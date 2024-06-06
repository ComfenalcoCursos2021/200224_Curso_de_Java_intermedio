package com.grupo.mayo.unc.principal;

import com.grupo.mayo.unc.Colibri;
import com.grupo.mayo.unc.Paloma;
import com.grupo.mayo.unc.Pelicano;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paloma p1 = new Paloma();
		Colibri c1 = new Colibri();
		Pelicano pel1 = new Pelicano();
		p1.volar();
		
		
		pel1.volar();
		pel1.nadar();
		
		c1.volar();
		
		System.out.println("Termino!!!!");
	}

}
