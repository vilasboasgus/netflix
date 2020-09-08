package com.netflix.avaliacaoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.avaliacaoservice.domain.Avaliacao;
import com.netflix.avaliacaoservice.repository.AvaliacaoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class AvaliacaoController {

	@Autowired
	AvaliacaoRepository avaliacaoRepository;

	@PostMapping(value = "/avaliacao")
	public Avaliacao createAvaliacao(@RequestBody Avaliacao avaliacao) {
		
		return avaliacaoRepository.save(avaliacao);
	}

}
