package com.unc.grupo.mayo;

public class CajaNumerica {

	private int dato = 15;
	private float impuesto = 19;
	
	public int getDato() {
		return this.dato;
	}
	public void setDato(int elValorDelDato) {
		this.dato = elValorDelDato;
	}
	
	public float getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(float impuesto) {
		System.err.println("ESTA OPERACION ES ILEGAL, NO ES POSIBLE CAMBIAR EL IMPUESTO");
	}
	
	
	
}
