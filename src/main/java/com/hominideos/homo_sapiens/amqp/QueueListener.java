package com.hominideos.homo_sapiens.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hominideos.homo_sapiens.model.Neandertal;
import com.hominideos.homo_sapiens.service.NeandertalService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class QueueListener {
	
	@Autowired
	private NeandertalService service;

	private ObjectMapper objectMapper = new ObjectMapper();

	@RabbitListener(queues = { "${amqp.neandertal.listener-queue}" })
	public void receberMensagemNeandertal(@Payload String corpoMensagem) {
		
		try {
			Neandertal neander = objectMapper.readValue(corpoMensagem, Neandertal.class);
			Neandertal neanderNoBanco = service.salvarNoBanco(neander);
			log.info(neanderNoBanco.toString());			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
		}
	}
		
}
