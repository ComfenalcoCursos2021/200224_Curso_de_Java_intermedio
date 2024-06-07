package unc.grupo.intermedio.objetos;

import unc.grupo.intermedio.interfaces.INavegar;
import unc.grupo.intermedio.interfaces.ISumergirse;

public class AveArtica extends Ave implements INavegar, ISumergirse {

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
