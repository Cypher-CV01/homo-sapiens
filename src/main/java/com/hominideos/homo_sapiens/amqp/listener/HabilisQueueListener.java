package com.hominideos.homo_sapiens.amqp.listener;

import java.time.LocalDateTime;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.hominideos.homo_sapiens.amqp.sender.HabilisQueueSender;
import com.hominideos.homo_sapiens.dto.RetornoHominideoDto;
import com.hominideos.homo_sapiens.dto.TipoHomo;
import com.hominideos.homo_sapiens.model.Habilis;
import com.hominideos.homo_sapiens.service.HabilisService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class HabilisQueueListener {
	
	@Autowired
	private HabilisService service;
	
	@Autowired
	private HabilisQueueSender sender;

	private ObjectMapper objectMapper = new ObjectMapper();
	

	@RabbitListener(queues = { "${amqp.habilis.listenerQueue}" })
	public void receberMensagemHabilis(@Payload String corpoMensagem) {
		objectMapper.registerModule(new JavaTimeModule());
		
		try {
			Habilis habilis = objectMapper.readValue(corpoMensagem, Habilis.class);
			Habilis habilisNoBanco = service.salvarNoBanco(habilis);
			
			RetornoHominideoDto resposta = RetornoHominideoDto.builder()
					.id(habilisNoBanco.getId())
					.dataHora(LocalDateTime.now())
					.resultado(Boolean.TRUE)
					.descricao("Operação Finalizada com Sucesso!")
					.tipoHomo(TipoHomo.HABILIS).build();
			sender.send(objectMapper.writeValueAsString(resposta));
			log.info(habilisNoBanco.toString());			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
			RetornoHominideoDto respostaErro = RetornoHominideoDto.builder()
					.descricao(e.getMessage())
					.dataHora(LocalDateTime.now())
					.resultado(Boolean.FALSE)
					.tipoHomo(TipoHomo.HABILIS).build();
			try {
				sender.send(objectMapper.writeValueAsString(respostaErro));
			} catch (JsonProcessingException e1) {
				log.error(e1.getMessage());
			}
			
		}
		
	}

}
