package unc.grupo.intermedio.objetos;

import unc.grupo.intermedio.interfaces.IVolar;

public class AveVoladora extends Ave implements IVolar {

	@Override
	public void volar() {
		System.out.println("Volando desde ave voladora");
	}

}
