package com.netflix.suporte.suporteservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.netflix.suporte.suporteservice.model.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {

	Categoria findAllByIdCategoria(Integer idCategoria);
	
	
}
