package com.hominideos.homo_sapiens.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class RabbitConfig {

	@Value("${amqp.neandertal.producer-queue}")
	private String Fila_Retorno_Neandertal;

	@Bean("retornoNeandertal")
	Queue queueRetornoNeanderal() {
		return new Queue(Fila_Retorno_Neandertal, true);
	}

}
