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
		a.imprimirLista();
		
		List<Integer> aListaJava = new ArrayList<Integer>();
		
		aListaJava.add(5);
		aListaJava.add(10);
		aListaJava.add(30);
		aListaJava.add(40);
		aListaJava.add(50);
		
		
		System.out.println("Termino !!!!");
	}

}
