package com.netflix.desejoservice.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;

@Table(name = "USUARIO_DESEJA_FILME")
@Entity

public class Desejo implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDDESEJO")
	@JsonProperty("idDesejo")
	Integer idDesejo;	

	@Column(name = "IDUSUARIO")
	@JsonProperty("idUsuario")
	Integer idUsuario;	

	@Column(name = "IDFILME")
	@JsonProperty("idFilme")
	Integer idFilme;	

	@Column(name = "TIMESTAMPACAO")
	@JsonProperty("timestampAcao")
	Timestamp timestampAcao;

	@Column(name = "STACAO")
	@JsonProperty("stAcao")
	String stAcao;

	public Desejo() {
		super();
	}

	public Desejo(Integer idDesejo, Integer idUsuario, Integer idFilme, Timestamp timestampAcao, String stAcao ) {
		super();
		this.idDesejo = idDesejo;
		this.idUsuario = idUsuario;
		this.idFilme = idFilme;
		this.timestampAcao = timestampAcao;
		this.stAcao = stAcao;
	}
	
	public void setidDesejo(Integer idDesejo) {
		this.idDesejo = idDesejo;
	}	

	public void setidUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}	

	public void setidFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}	

	public void settimestampAcao(Timestamp timestampAcao) {
		this.timestampAcao = timestampAcao;
	}	

	public void setstAcao(String stAcao) {
		this.stAcao = stAcao;
	}
	
}