package com.netflix.suporte.suporteservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.netflix.suporte.suporteservice.model.Chamados;

@Service
//@EnableBinding(Source.class)
public class ChamadosService {

	/*
	@Autowired
	private Source source;
	
	public void updatestatus(Chamados chamados) {
		source.output().send(MessageBuilder.withPayload(chamados).build());
	}
	*/
}
