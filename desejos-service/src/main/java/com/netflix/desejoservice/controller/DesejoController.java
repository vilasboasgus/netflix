package com.netflix.desejoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.desejoservice.domain.Desejo;
import com.netflix.desejoservice.repository.DesejoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "desejo")

public class DesejoController {

	@Autowired
	DesejoRepository desejoRepository;

	@ApiOperation(value = "Escolhe Filmes para assitir depois")
	@PostMapping(value = "/desejo")
	public Desejo createDesejo(@RequestBody Desejo desejo) {
		
		return desejoRepository.save(desejo);
	}
	
}
