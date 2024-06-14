package com.grupo.poo.unc.aves;

public class AveArtica extends Ave implements INavegar, ISumergirse {

	public AveArtica(String nombreValor) {
		super(nombreValor);
	}

	@Override
	public void sumergirse() {
		System.out.println("Sumergiendo el ave artica");		
	}

	@Override
	public void emerger() {
		System.out.println("emergiendo el ave artica");		
	}
	@Override
	public void navegar() {
		System.out.println("navegando el ave artica");		
	}

}
