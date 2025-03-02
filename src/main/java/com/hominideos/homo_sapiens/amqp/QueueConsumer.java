package com.hominideos.homo_sapiens.amqp;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class QueueConsumer {

	@RabbitListener(queues = { "${amqp.neandertal.listener-queue}" })
	public void receberMensagemNeandertal(@Payload String corpoMensagem) {
		log.info(corpoMensagem);
	}

}
