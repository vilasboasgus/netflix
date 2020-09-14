package com.netflix.desejoservice.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name = "USUARIO_DESEJA_FILME")
@Entity
@IdClass(DesejoId.class)
public class Desejo implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IDFILMED")
	@JsonProperty("idFilmeD")
	Integer idFilmeD;
	
	@Id
	@Column(name = "IDUSUARIOD")
	@JsonProperty("idUsuarioD")
	Integer idUsuarioD;	


	public Desejo() {
		super();
	}


	public Desejo(Integer idFilmeD, Integer idUsuarioD) {
		super();
		this.idFilmeD = idFilmeD;
		this.idUsuarioD = idUsuarioD;
	}


	public Integer getIdFilmeD() {
		return idFilmeD;
	}


	public void setIdFilmeD(Integer idFilmeD) {
		this.idFilmeD = idFilmeD;
	}


	public Integer getIdUsuarioD() {
		return idUsuarioD;
	}


	public void setIdUsuarioD(Integer idUsuarioD) {
		this.idUsuarioD = idUsuarioD;
	}
	
}