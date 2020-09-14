package com.netflix.usuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netflix.usuarios.models.UsuarioEntity;

public interface UsuariosRepository extends JpaRepository<UsuarioEntity, Integer>{
   
	@Override
    public List<UsuarioEntity> findAll();

	public List<UsuarioEntity> findByIdUsuario(Integer id_usuario);
}
