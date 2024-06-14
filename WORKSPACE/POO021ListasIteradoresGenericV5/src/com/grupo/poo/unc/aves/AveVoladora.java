package com.grupo.poo.unc.aves;

public class AveVoladora extends Ave implements IVolar {

	public AveVoladora(String nombreValor) {
		super(nombreValor);
	}
	
	@Override
	public void volar() {
		System.out.println("Volando desde ave voladora");
	}

}
