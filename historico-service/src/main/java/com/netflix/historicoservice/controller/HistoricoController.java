package com.netflix.historicoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.historicoservice.domain.Historico;
import com.netflix.historicoservice.repository.HistoricoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "historico")

public class HistoricoController {

	@Autowired
	HistoricoRepository historicoRepository;

	@ApiOperation(value = "Visualizar Filmes e Series que ja foram assistidos")
	@GetMapping(value = "/historico/{idUsuario}")
	public List<Historico> getHistoricoByUsuario(@PathVariable Integer idUsuario) {
		return historicoRepository.findByIdUsuario(idUsuario);
	}
}