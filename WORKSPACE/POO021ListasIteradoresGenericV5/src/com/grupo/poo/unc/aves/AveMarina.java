package com.grupo.poo.unc.aves;

public class AveMarina extends AveTerrestre implements INavegar {

	public AveMarina(String nombreValor) {
		super(nombreValor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void navegar() {
		System.out.println("Navegando desde Ave terrestre");
	}
 
}
