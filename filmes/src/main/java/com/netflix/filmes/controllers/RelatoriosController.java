package com.netflix.filmes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.filmes.model.PopularesDTO;
import com.netflix.filmes.services.QueryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "relatorios")
public class RelatoriosController {

    @Autowired
    QueryService queryservice;
	
	@ApiOperation(value = "Lista de Filmes Mais Vistos Por Categoria")
	@GetMapping(value = "/Filmes/Populares")
	public List<PopularesDTO> getFilmes() {
		return queryservice.getFilmesMaisVistosByCategoria();
	}
}
