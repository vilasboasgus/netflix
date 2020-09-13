package com.netflix.filmes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PopularesDTO {

	@JsonProperty("categoria")
	String categoria;

	@JsonProperty("filme")
	String filme;
	
	@JsonProperty("mensagem")
	String mensagem;

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


	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public PopularesDTO(String categoria, String filme, String mensagem) {
		super();
		this.categoria = categoria;
		this.filme = filme;
		this.mensagem = mensagem;
	}
	
	
	
	
}
