package com.netflix.filmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "tb_filmes")
@Entity
public class Filme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_filme")
	Integer idFilme;

	@Column(name = "titulo")
	String titulo;
	
	@Column(name = "ano")
	Integer ano;
	
	@Column(name = "diretor")
	String diretor;
	
	@Column(name = "duracao")
	Integer duracao;
	
	
	@Column(name = "idioma")
	String idioma;
	
	@Column(name = "sinopse")
	String sinopse;

    @OneToOne(mappedBy = "filme")
    private Categoria categoria;

    

	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
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

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


}
