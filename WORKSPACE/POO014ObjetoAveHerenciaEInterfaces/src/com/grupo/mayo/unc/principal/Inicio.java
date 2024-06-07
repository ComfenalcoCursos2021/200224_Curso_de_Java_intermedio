package com.grupo.mayo.unc.principal;

import com.grupo.mayo.unc.Colibri;
import com.grupo.mayo.unc.Paloma;
import com.grupo.mayo.unc.Pelicano;
import com.grupo.mayo.unc.interfaces.INadar;
import com.grupo.mayo.unc.interfaces.IVolar;

public class Inicio {

	public static void emprenderVuelo(IVolar p) {
		System.out.println("--->--->--->--->--->--->");
		p.volar();
		System.out.println("--->--->--->--->--->--->");
	}
	
	public static void emprenderNado(INadar o) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		o.nadar();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paloma p1 = new Paloma();
		Paloma p2 = new Paloma();
		Paloma p3 = new Paloma();
		Colibri c1 = new Colibri();
		Pelicano pel1 = new Pelicano();

		emprenderVuelo(p1);

		emprenderVuelo(p2);

		emprenderVuelo(p3);

		emprenderVuelo(pel1);
		emprenderNado(pel1);
		emprenderVuelo(c1);
		

		System.out.println("Termino!!!!");
	}

}
