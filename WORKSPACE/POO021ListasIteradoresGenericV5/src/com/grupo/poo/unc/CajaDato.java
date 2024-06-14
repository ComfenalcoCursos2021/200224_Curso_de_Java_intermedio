package com.grupo.poo.unc;

public class CajaDato<T> {

	private T dato;
	private CajaDato<T> siguiente;
	
	public T getDato() {
		return dato;
	}
	public void setDato(T datoValor) {
		this.dato = datoValor;
	}
	
	public CajaDato<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(CajaDato<T> siguienteValor) {
		this.siguiente = siguienteValor;
	}
	
}
