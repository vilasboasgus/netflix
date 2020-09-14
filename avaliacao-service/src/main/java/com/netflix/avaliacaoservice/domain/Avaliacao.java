package com.netflix.avaliacaoservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name = "USUARIO_AVALIA_FILME")
@Entity
@IdClass(AvaliacaoId.class)
public class Avaliacao {
	
	@Id
	@Column(name = "IDFILMED")
	@JsonProperty("idFilmeD")
	Integer idFilmeD;
	
	@Id
	@Column(name = "IDUSUARIOD")
	@JsonProperty("idUsuarioD")
	Integer idUsuarioD;	

	@Column(name = "NOTA")
	@JsonProperty("nota")
	Integer nota;

	public Integer getIdFilmeD() {
		return idFilmeD;
	}

	public Integer getIdUsuarioD() {
		return idUsuarioD;
	}

	public Integer getNota() {
		return nota;
	}

	public void setIdFilmeD(Integer idFilmeD) {
		this.idFilmeD = idFilmeD;
	}

	public void setIdUsuarioD(Integer idUsuarioD) {
		this.idUsuarioD = idUsuarioD;
	}

	public void setNota(Integer nota) {
		if (nota < 1 || nota >5) {
			System.out.println("nota deve estar entre 1 e 5");
		} else {
		this.nota = nota;
		}
	}	


}
