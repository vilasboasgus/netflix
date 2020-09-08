package com.netflix.filmes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.filmes.model.Filme;
import com.netflix.filmes.model.FilmeEntity;
import com.netflix.filmes.services.QueryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "filmes")
public class FilmesController {
	
    @Autowired
    QueryService queryservice;
	
	@ApiOperation(value = "Lista de Filmes")
	@GetMapping(value = "/filmes")
	public List<Filme> getFilmes(@RequestParam(required=false) String genero) {
		return queryservice.JPQLQuery(genero);
	}
	
	@ApiOperation(value = "Lista de Filmes")
	@GetMapping(value = "/filmes/{id_filme}")
	public List<FilmeEntity> getFilmes(@PathVariable Integer id_filme) {
		return queryservice.getDetalhesFilme(id_filme);
	}

}
