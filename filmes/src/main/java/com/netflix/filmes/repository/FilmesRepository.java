package com.netflix.filmes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.netflix.filmes.model.FilmeEntity;

public interface FilmesRepository extends CrudRepository<FilmeEntity, Integer>{
	
    @Override
    public List<FilmeEntity> findAll();
    
    public List<FilmeEntity> findAllById(Integer id);
    


}
