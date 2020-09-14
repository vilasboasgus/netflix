package com.netflix.desejoservice.domain;

import java.io.Serializable;

public class DesejoId implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private int idFilmeD;   
    
    private int idUsuarioD;

    public DesejoId() {
	    }

	public DesejoId(int idUsuarioD, int idFilmeD) {
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
