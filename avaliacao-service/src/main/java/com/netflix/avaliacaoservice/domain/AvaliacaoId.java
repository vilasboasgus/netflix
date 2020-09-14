package com.netflix.avaliacaoservice.domain;

import java.io.Serializable;

public class AvaliacaoId implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private int idFilmeD;   
    
    private int idUsuarioD;

    public AvaliacaoId() {
	    }

	public AvaliacaoId(int idUsuarioD, int idFilmeD) {
		super();
		this.idUsuarioD = idUsuarioD;
		this.idFilmeD = idFilmeD;
	}

	public int getIdFilmeD() {
		return idFilmeD;
	}

	public int getIdUsuarioD() {
		return idUsuarioD;
	}

}
