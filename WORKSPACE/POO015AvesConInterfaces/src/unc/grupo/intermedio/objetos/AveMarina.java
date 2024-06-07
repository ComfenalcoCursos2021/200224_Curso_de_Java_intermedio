package unc.grupo.intermedio.objetos;

import unc.grupo.intermedio.interfaces.INavegar;

public class AveMarina extends AveTerrestre implements INavegar {

	@Override
	public void navegar() {
		System.out.println("Navegando desde Ave terrestre");
	}
 
}
