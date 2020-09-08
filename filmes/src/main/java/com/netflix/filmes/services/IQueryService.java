package com.netflix.filmes.services;

import java.util.List;

import com.netflix.filmes.model.Filme;

public interface IQueryService {

	List<Filme> JPQLQuery(String genero);

}
