package com.grupo.poo.unc;

public class IndiceIterador {

	private CajaDato actual;
	
	public IndiceIterador(CajaDato primero) {
		this.actual = primero;
	}
	
	public boolean tieneSiguiente() {
		return actual != null;
	}

	
	public Integer siguiente() {
		int dato = actual.getDato();
		actual = actual.getSiguiente();
		return dato;
	}

}
