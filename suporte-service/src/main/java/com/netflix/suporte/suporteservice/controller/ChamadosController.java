package com.netflix.suporte.suporteservice.controller;

import org.apache.kafka.common.network.Send;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.suporte.suporteservice.model.Categoria;
import com.netflix.suporte.suporteservice.model.Chamados;
import com.netflix.suporte.suporteservice.repository.CategoriaRepository;
import com.netflix.suporte.suporteservice.repository.ChamadosRepository;
import com.netflix.suporte.suporteservice.service.ChamadoProducer;
import com.netflix.suporte.suporteservice.service.ChamadosService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@Controller
@RequestMapping(value = "/chamados")
@Api(value="chamados")

public class ChamadosController {
	
	@Autowired
	ChamadosRepository chamadosRepository;
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ChamadosService chamadosService;
	
	@Autowired
	ChamadoProducer chamadoProducer;
	
	@ApiOperation(value = "Lista todas as categorias cadastradas")
	@GetMapping(value = "/categorias")
	public Iterable<Categoria> all() {
		return categoriaRepository.findAll();
	}
	
	@ApiOperation(value = "Cadastrar um novo chamado para suporte")
	@PostMapping(value = "/chamados")
	public Chamados createChamados(@RequestBody Chamados chamados) {
		return chamadosRepository.save(chamados);
	}
	
	@RequestMapping(method = RequestMethod.POST)
    public void send(@RequestBody String chamado) {
        chamadoProducer.send(chamado);
    }
	
}
