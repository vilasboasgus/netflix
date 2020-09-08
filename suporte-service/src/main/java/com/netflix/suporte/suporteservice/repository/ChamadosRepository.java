package com.netflix.suporte.suporteservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.netflix.suporte.suporteservice.model.Chamados;

@Repository
public interface ChamadosRepository extends CrudRepository<Chamados, Integer> {

	Chamados findAllByCpfPessoa(Integer cpfPessoa);
	
	@SuppressWarnings("unchecked")
	Chamados save(Chamados chamados);
	
}
