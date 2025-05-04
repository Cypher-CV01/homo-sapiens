package com.hominideos.homo_sapiens.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableRabbit
public class RabbitConfig {
	
	 
	@Value("${amqp.neandertal.listenerQueue}")
	private String filaEntradaNeandertal;
 
	 
	@Value("${amqp.neandertal.retornoQueue}")
	private String filaRetornoNeandertal;
	
	@Bean("entradaNeandertal")
	Queue queueEntradaNeandertal() {
		return new Queue(filaEntradaNeandertal, true);
	}

	@Bean("retornoNeandertal")
	Queue queueRetornoNeanderal() {
		return new Queue(filaRetornoNeandertal, true);
	}
	
	@Value("${amqp.florisience.listenerQueue}")
	private String filaEntradaFlorisience;
	
	@Value("${amqp.florisience.retornoQueue}")
	private String filaRetornoFlorisience;
	
	@Bean("entradaFlorisience")
	Queue queueEntradaFlorisience() {
		return new Queue(filaEntradaFlorisience, true);
	}
	
	@Bean("retornoFlorisience")
	Queue queueRetornoFlorisience() {
		return new Queue(filaRetornoFlorisience, true);
	}
	
	
	@Value("${amqp.denisovano.listenerQueue}")
	private String filaEntradaDenisovano;
	
	
	@Value("${amqp.denisovano.retornoQueue}")
	private String filaRetornoDenisovano;
		
	@Bean("entradaDenisovano")
	Queue queueEntradaDenisovano() {
		return new Queue(filaEntradaDenisovano, true);
	}
	
	@Bean("retornoDenisovano")
	Queue queueRetornoDenisovano() {
		return new Queue(filaRetornoDenisovano, true);
	}
	
	
	@Value("${amqp.habilis.listenerQueue}")
	private String filaEntradaHabilis;
	
	
	@Value("${amqp.habilis.retornoQueue}")
	private String filaRetornoHabilis;
		
	@Bean("entradaHabilis")
	Queue queueEntradaHabilis() {
		return new Queue(filaEntradaHabilis, true);
	}
	
	@Bean("retornoHabilis")
	Queue queueRetornoHabilis() {
		return new Queue(filaRetornoHabilis, true);
	}
}
