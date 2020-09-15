package com.netflix.backofficeservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.netflix.backofficeservice.model.Chamados;

@Repository
public interface ChamadosRepository extends CrudRepository<Chamados, Integer> {

	Chamados findAllByCpfPessoa(Integer cpfPessoa);
	
	@SuppressWarnings("unchecked")
	Chamados save(Chamados chamados);
}
