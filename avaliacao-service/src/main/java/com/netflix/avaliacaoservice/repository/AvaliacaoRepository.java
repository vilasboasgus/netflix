package com.netflix.avaliacaoservice.repository;

import org.springframework.data.repository.CrudRepository;
import com.netflix.avaliacaoservice.domain.Avaliacao;

public interface AvaliacaoRepository extends CrudRepository<Avaliacao, Integer> {

	Avaliacao save(Avaliacao avaliacao);
	
}
