package com.netflix.filmes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_mais_vistos")
@Entity
public class MaisVistosEntity {
	
	@Id
	@Column(name = "id_categoria")
    private Integer idCategoria;
	
	@Column(name = "id_filme")
    private Integer idFilme;

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}

    
    

}
