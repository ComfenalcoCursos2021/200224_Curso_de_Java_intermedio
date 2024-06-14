package com.grupo.poo.unc.aves;

public class Ave {
	private String nombre;

	public Ave(String nombreValor) {
		this.nombre = nombreValor;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "por como no sabe que hacer solo imprima el nombre " + this.getNombre();
	}
	
	
}
