package com.netflix.filmes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.filmes.model.Filme;
import com.netflix.filmes.repository.FilmesRepository;
import com.netflix.filmes.services.QueryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "filmes")
public class FilmesController {
	
    @Autowired
    QueryService queryservice;
    
    @Autowired
    FilmesRepository filmesRepository;
	
	@ApiOperation(value = "Lista de Filmes")
	@GetMapping(value = "/filmes")
	public List<Filme> getFilmes() {
		return filmesRepository.findAll();
	}
	
	@ApiOperation(value = "Detalhe Filmes")
	@GetMapping(value = "/filmes/{id_filme}")
	public List<Filme> getFilmesDetalhes(@PathVariable Integer id_filme) {
		return filmesRepository.findByIdFilme(id_filme);
	}
	
	@ApiOperation(value = "Lista de Filmes Filtro Categoria")
	@GetMapping(value = "/filmes/filtros/categorias/{id_categoria}")
	public List<Filme> getFilmesByCategoria(@PathVariable Integer id_categoria) {
		return filmesRepository.findByCategoria(id_categoria);
	}
	
	@ApiOperation(value = "Lista de Filmes Filtro Titulo - Palavra chave")
	@GetMapping(value = "/filmes/filtros/titulos/{titulo}")
	public List<Filme> getFilmesByTitulo(@PathVariable String titulo) {
		return filmesRepository.findByTitulo(titulo.toLowerCase());
	}

}
