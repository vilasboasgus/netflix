package com.netflix.filmes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.netflix.filmes.model.Filme;

public interface FilmesRepository extends JpaRepository<Filme, Integer>{
	
    @Override
    public List<Filme> findAll();
    
    public List<Filme> findByIdFilme(Integer idFilme);
    
    @Query("SELECT f FROM Filme f WHERE f.categoria.idCategoria = :idCategoria")
    public List<Filme> findByCategoria(@Param("idCategoria") Integer idCategoria);
    
    @Query("SELECT f from Filme f where LOWER(f.titulo) LIKE %:titulo%")
    public List<Filme> findByTitulo(@Param("titulo") String titulo);
    
    


}
