package com.netflix.backofficeservice.service;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.netflix.backofficeservice.model.Chamados;

@Component
public class ChamadoConsumer {

	
	
	@KafkaListener(topics = "${config.server.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumer(ConsumerRecord consumerRecord) {
		
        System.out.println("Log de leitura" + consumerRecord.value());
    }
}
