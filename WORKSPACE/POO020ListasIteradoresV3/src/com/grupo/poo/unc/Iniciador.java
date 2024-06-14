package com.grupo.poo.unc;

import java.util.ArrayList;
import java.util.List;

public class Iniciador {

	public static void main(String[] args) {

		ManejadorListas a = new ManejadorListas();
		
		a.agregar(5);
		a.agregar(10);
		a.agregar(30);
		a.agregar(40);
		a.agregar(50);
		
		
		IndiceIterador iterador = a.getIterador();
		
		while(iterador.tieneSiguiente()) {
			System.out.println("****************");
			System.out.println("*      "+iterador.siguiente()+"       *");
			System.out.println("****************");
		}
		
		
		iterador = a.getIterador();
		
		while(iterador.tieneSiguiente()) {
			System.out.println("****************");
			System.out.println("*      "+iterador.siguiente()+"       *");
			System.out.println("****************");
		}
		
		
		System.out.println("Termino !!!!");
	}

}
