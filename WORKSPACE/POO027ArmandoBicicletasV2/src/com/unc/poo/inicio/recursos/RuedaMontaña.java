package com.unc.poo.inicio.recursos;

import com.unc.poo.inicio.interfaces.IRueda;

public class RuedaMontaña implements IRueda{

	@Override
	public void dibujar() {
		System.out.println("            ██████╗         ██╗    ██╗         ██████╗ ");
		System.out.println("        ██╗██╔═████╗        ██║    ██║        ██╔═████╗");
		System.out.println("        ╚═╝██║██╔██║        ██║ █╗ ██║        ██║██╔██║");
		System.out.println("        ▄█╗████╔╝██║        ██║███╗██║        ████╔╝██║");
		System.out.println("        ▀═╝╚██████╔╝        ╚███╔███╔╝        ╚██████╔╝");
		System.out.println("            ╚═════╝          ╚══╝╚══╝          ╚═════╝ ");		
	}

}
