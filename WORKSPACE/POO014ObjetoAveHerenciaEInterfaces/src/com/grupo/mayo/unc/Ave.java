package com.grupo.mayo.unc;

import com.grupo.mayo.unc.interfaces.IVolar;

public class Ave implements IVolar {
	private String nombre;	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void volar() {
		System.out.println("Esta volando desde el ave");		
	}
	
	
}
