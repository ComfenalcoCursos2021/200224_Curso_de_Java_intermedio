package com.grupo.poo.unc;

public class Iniciador {

	public static void main(String[] args) {

		CajaDato primero = new CajaDato();
		primero.setDato(5);
		
		System.out.println(primero.getDato());
		System.out.println(primero.getSiguiente());
		
		CajaDato segundo = new CajaDato();
		segundo.setDato(10);		
		primero.setSiguiente(segundo);
		System.out.println("=========================================");
		System.out.println(primero.getDato());
		System.out.println(primero.getSiguiente());		
		System.out.println(primero.getSiguiente().getDato() );
		System.out.println("=========================================");
		
		CajaDato tercero = new CajaDato();
		tercero.setDato(30);		
		segundo.setSiguiente(tercero);
		
		System.out.println("=========================================");
		System.out.println(tercero.getDato());
		System.out.println(segundo.getSiguiente().getDato());
		System.out.println(primero.getSiguiente().getSiguiente().getDato());
		
		
		
		System.out.println("Termino !!!!");
	}

}
