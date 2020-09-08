package com.netflix.avaliacaoservice.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;

@Table(name = "USUARIO_AVALIA_FILME")
@Entity

public class Avaliacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDAVALIACAO")
	@JsonProperty("idAvaliacao")
	Integer idAvaliacao;
	
	@Column(name = "IDUSUARIO")
	@JsonProperty("idUsuario")
	Integer idUsuario;	

	@Column(name = "IDFILME")
	@JsonProperty("idFilme")
	Integer idFilme;	

	@Column(name = "TIMESTAMPAVALIACAO")
	@JsonProperty("timestampAvaliacao")
	Timestamp timestampAvaliacao;
	
	@Column(name = "AVALIACAO")
	@JsonProperty("avaliacao")
	Integer avaliacao;
	
	public Avaliacao() {
		super();
	}

	public Avaliacao(Integer idAvaliacao, Integer idUsuario, Integer idFilme, Timestamp timestampAvaliacao, Integer avaliacao ) {
		super();
		this.idAvaliacao = idAvaliacao;
		this.idUsuario = idUsuario;
		this.idFilme = idFilme;
		this.timestampAvaliacao = timestampAvaliacao;
		this.avaliacao = avaliacao;
	}
	
	public void setidAvaliacao(Integer idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}	

	public void setidUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}	

	public void setidFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}	

	public void settimestampAvaliacao(Timestamp timestampAvaliacao) {
		this.timestampAvaliacao = timestampAvaliacao;
	}	

	public void setavaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}

}
