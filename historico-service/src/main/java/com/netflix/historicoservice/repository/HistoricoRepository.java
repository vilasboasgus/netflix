package com.netflix.historicoservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.netflix.historicoservice.domain.Historico;

public interface HistoricoRepository extends JpaRepository<Historico, Integer> {
	
    @Query("SELECT h FROM Historico h where h.id_Usuario = :id_Usuario")
    public List<Historico> findByIdUsuario(@Param("id_Usuario") Integer id_Usuario);
}