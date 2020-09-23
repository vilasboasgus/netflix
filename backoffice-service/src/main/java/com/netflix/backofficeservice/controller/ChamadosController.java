package com.netflix.backofficeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.backofficeservice.model.Chamados;
import com.netflix.backofficeservice.repository.ChamadosRepository;
import com.netflix.backofficeservice.service.ChamadoConsumer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Controller
@RequestMapping(value = "/backoffice")

public class ChamadosController {
	
	@Autowired
	ChamadosRepository chamadosRepository;
	
	@Autowired
	ChamadoConsumer chamadoconsumer;
	
	
	@ApiOperation(value = "Lista todos os chamados cadastrados via suporte")
	@GetMapping(value = "/chamados")
	public Iterable<Chamados> all() {
		return chamadosRepository.findAll();
	}
	
	@ApiOperation(value = "Cadastrar um novo chamado para suporte")
	@PostMapping(value = "/chamados")
	public Chamados createChamados(@RequestBody Chamados chamados) {
		return chamadosRepository.save(chamados);
	}	
	
}
