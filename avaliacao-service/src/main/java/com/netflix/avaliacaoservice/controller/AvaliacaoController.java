package com.netflix.avaliacaoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.avaliacaoservice.domain.Avaliacao;
import com.netflix.avaliacaoservice.repository.AvaliacaoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "avaliacao")
public class AvaliacaoController {

	@Autowired
	AvaliacaoRepository avaliacaoRepository;

	@ApiOperation(value = "Avalia Filmes")
	@PostMapping(value = "/avaliacao")
	public Avaliacao createAvaliacao(@RequestBody Avaliacao avaliacao) {
		
		return avaliacaoRepository.save(avaliacao);
	}

}
