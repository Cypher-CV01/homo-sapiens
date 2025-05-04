package com.hominideos.homo_sapiens.amqp.listener;


import java.time.LocalDateTime;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.hominideos.homo_sapiens.amqp.sender.DenisovanoQueueSender;
import com.hominideos.homo_sapiens.dto.RetornoHominideoDto;
import com.hominideos.homo_sapiens.dto.TipoHomo;
import com.hominideos.homo_sapiens.model.Denisovano;
import com.hominideos.homo_sapiens.service.DenisovanoService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DenisovanoQueueListener {
	
	@Autowired
	private DenisovanoService service;
	
	@Autowired
	private DenisovanoQueueSender sender;

	private ObjectMapper objectMapper = new ObjectMapper();
	

	@RabbitListener(queues = { "${amqp.denisovano.listenerQueue}" })
	public void receberMensagemDenisovano(@Payload String corpoMensagem) {
		objectMapper.registerModule(new JavaTimeModule());
		
		try {
			Denisovano denisovano = objectMapper.readValue(corpoMensagem, Denisovano.class);
			Denisovano denisovanoNoBanco = service.salvarNoBanco(denisovano);
			
			RetornoHominideoDto resposta = RetornoHominideoDto.builder()
					.id(denisovanoNoBanco.getId())
					.dataHora(LocalDateTime.now())
					.resultado(Boolean.TRUE)
					.descricao("Operação Finalizada com Sucesso!")
					.tipoHomo(TipoHomo.DENISOVANO).build();
			sender.send(objectMapper.writeValueAsString(resposta));
			log.info(denisovanoNoBanco.toString());			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
			RetornoHominideoDto respostaErro = RetornoHominideoDto.builder()
					.descricao(e.getMessage())
					.dataHora(LocalDateTime.now())
					.resultado(Boolean.FALSE)
					.tipoHomo(TipoHomo.DENISOVANO).build();
			try {
				sender.send(objectMapper.writeValueAsString(respostaErro));
			} catch (JsonProcessingException e1) {
				log.error(e1.getMessage());
			}
			
		}
		
	}
	
}
	