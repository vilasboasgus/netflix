package com.netflix.historicoservice.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Index;
import javax.persistence.Table;


@Table(name = "TB_HISTORICO")
@Entity
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_HISTORICO")
    Integer id_Historico;
    
    @Column(name = "ID_USUARIO")
    Integer id_Usuario;

	@Column(name = "TITULOFILME")
	String tituloFilme;

	@Column(name = "DESCRICAOCATEGORIA")
	String descricaoCategoria;
	
	@Column(name = "DATAVISUALIZACAO")
	Date dataVisualizacao;

	public Integer getId_Historico() {
		return id_Historico;
	}

	public void setId_Historico(Integer id_Historico) {
		this.id_Historico = id_Historico;
	}

	public Integer getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(Integer id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getTituloFilme() {
		return tituloFilme;
	}

	public void setTituloFilme(String tituloFilme) {
		this.tituloFilme = tituloFilme;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public Date getDataVisualizacao() {
		return dataVisualizacao;
	}

	public void setDataVisualizacao(Date dataVisualizacao) {
		this.dataVisualizacao = dataVisualizacao;
	}

}
