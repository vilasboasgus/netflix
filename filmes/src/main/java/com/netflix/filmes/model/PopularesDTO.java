package com.netflix.filmes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PopularesDTO {

	@JsonProperty("categoria")
	String categoria;

	@JsonProperty("filme")
	String filme;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	public PopularesDTO(String categoria, String filme) {
		super();
		this.categoria = categoria;
		this.filme = filme;
	}
	
	
	
}
