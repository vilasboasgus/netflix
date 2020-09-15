package com.netflix.suporte.suporteservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.netflix.suporte.suporteservice.model.Chamados;

@Component
public class ChamadoProducer {

	@Value("${config.server.topic}")
	private String chamadoTopic;
	
	private final KafkaTemplate kafkaTemplate;
	
	public ChamadoProducer(final KafkaTemplate kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void send(final @RequestBody String chamado) {
		final String mensageKey = UUID.randomUUID().toString();
		kafkaTemplate.send(chamadoTopic, mensageKey, chamado);
	}
}
