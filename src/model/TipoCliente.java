package model;

import java.io.Serializable;

public enum TipoCliente implements Serializable {
	
	NATURAL(0),JURIDICO(1);
	
private int numTipo;
	
	/**
	 * Constructor
	 * @param tipo
	 */
	private TipoCliente(int tipo) {
		numTipo = tipo;
	}
	
	/**
	 * Metodo Get
	 * @return
	 */
	public int getNumTipo() {
		return numTipo;
	}
	

}
