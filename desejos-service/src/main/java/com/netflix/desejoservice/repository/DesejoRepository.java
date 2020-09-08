package com.netflix.desejoservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.netflix.desejoservice.domain.Desejo;

public interface DesejoRepository extends CrudRepository<Desejo, Integer> {

	Desejo save(Desejo desejo);
	
}
