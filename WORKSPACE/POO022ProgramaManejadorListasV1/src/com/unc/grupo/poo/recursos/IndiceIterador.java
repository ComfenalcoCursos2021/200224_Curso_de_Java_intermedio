package com.unc.grupo.poo.recursos;

public class IndiceIterador<T> {

	private CajaDato<T> actual;
	
	public IndiceIterador(CajaDato<T> primero) {
		this.actual = primero;
	}
	
	public boolean tieneSiguiente() {
		return actual != null;
	}
	
	public T siguiente() {
		T dato = actual.getDato();
		actual = actual.getSiguiente();
		return dato;
	}

}
