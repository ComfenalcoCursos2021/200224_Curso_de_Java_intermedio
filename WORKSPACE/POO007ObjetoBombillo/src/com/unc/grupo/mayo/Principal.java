package com.unc.grupo.mayo;

public class Principal {

	public static void main(String[] args) {
		Bombillo sala = new Bombillo();
		
		sala.setAlto(10);
		sala.setAncho(5);
		sala.setProfundo(5);
		sala.setColor("Azul");
		sala.setLumens(15000);
		sala.setTipo("Led");
		
		sala.encender();
		
		System.out.println("t1->Esta encendido? " + sala.estaEncendido());
		sala.apagar();
		
		System.out.println("t2->Esta encendido? " + sala.estaEncendido());
		
		System.out.println(sala.getAlto());
		System.out.println(sala.getAncho());
		System.out.println(sala.getProfundo());
		System.out.println(sala.getTipo());
		System.out.println(sala.getColor());
		System.out.println(sala.getLumens());
		
		System.out.println("Termino!!!");
	}

}
