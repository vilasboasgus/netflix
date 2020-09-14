package com.netflix.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.usuarios.models.UsuarioEntity;
import com.netflix.usuarios.repository.UsuariosRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "usuarios")
public class UsuarioController {

    @Autowired
    UsuariosRepository usuariosRepository;
	
	@ApiOperation(value = "Lista de Usuarios")
	@GetMapping(value = "/usuarios")
	public List<UsuarioEntity> getUsuarios() {
		return usuariosRepository.findAll();
	}
	
	@ApiOperation(value = "Detalhe Usuario")
	@GetMapping(value = "/usuarios/{id_usuario}")
	public List<UsuarioEntity> getUsuarioDetalhe(@PathVariable Integer id_usuario) {
		return usuariosRepository.findByIdUsuario(id_usuario);
	}
}
