package com.hominideos.homo_sapiens.amqp.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HabilisQueueSender {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	@Qualifier("retornoHabilis")
	private Queue queue;

	public void send(String conteudo) {
		rabbitTemplate.convertAndSend(this.queue.getName(), conteudo);
	}

}
