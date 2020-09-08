package com.netflix.filmes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Filme {

	@JsonProperty
	Integer id;
	@JsonProperty
	String titulo;
	@JsonProperty
	Integer ano;
	@JsonProperty
	String diretor;
	@JsonProperty
	Integer duracaoMinutos;
	@JsonProperty
	String idioma;
	@JsonProperty
	String sinopse;
	@JsonProperty
	String genero;
	
	
	
	public Filme(Integer id, String titulo, Integer ano, String diretor, Integer duracaoMinutos, String idioma,
			String sinopse, String genero) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.diretor = diretor;
		this.duracaoMinutos = duracaoMinutos;
		this.idioma = idioma;
		this.sinopse = sinopse;
		this.genero = genero;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public Integer getDuracaoMinutos() {
		return duracaoMinutos;
	}
	public void setDuracaoMinutos(Integer duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
