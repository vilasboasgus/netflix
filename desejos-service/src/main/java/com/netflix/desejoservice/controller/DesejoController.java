package com.netflix.desejoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.desejoservice.domain.Desejo;
import com.netflix.desejoservice.repository.DesejoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class DesejoController {

	@Autowired
	DesejoRepository desejoRepository;

	@PostMapping(value = "/desejos")
	public Desejo createDesejo(@RequestBody Desejo desejo) {
		
		return desejoRepository.save(desejo);
	}
	
}
