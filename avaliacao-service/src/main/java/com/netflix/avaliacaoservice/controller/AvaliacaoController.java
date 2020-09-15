package com.netflix.avaliacaoservice.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
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
	public Avaliacao createAvaliacao(@RequestBody @Valid Avaliacao avaliacao) {
		return avaliacaoRepository.save(avaliacao);
	}

	@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	 
	    ex.getBindingResult().getFieldErrors().forEach(error -> 
	        errors.put(error.getField(), error.getDefaultMessage()));
	     
	    return errors;
	}
}
