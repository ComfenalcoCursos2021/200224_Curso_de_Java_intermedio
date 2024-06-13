package com.grupo.poo.unc;

public class Iniciador {

	public static void main(String[] args) {

		ManejadorListas a = new ManejadorListas();
		
		a.agregar(5);
		a.agregar(10);
		a.agregar(30);
		a.agregar(40);
		a.agregar(50);
		a.imprimirLista();
		
		
		
		System.out.println("Termino !!!!");
	}

}
