package com.unc.poo.inicio;

import java.util.Scanner;

import com.unc.poo.inicio.recursos.BicicletaMontaña;
import com.unc.poo.inicio.recursos.BicicletaMontañaRuedaRuta;
import com.unc.poo.inicio.recursos.BicicletaRuta;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido a arma tu bicicleta");
		
		System.out.println("+--------------------+");
		System.out.println("Selecciona tu bicicleta:");
		System.out.println("1. montaña");
		System.out.println("2. ruta");
		System.out.println("3. hibrido");
		int opcion = teclado.nextInt();
		
		if(opcion == 1) {
			BicicletaMontaña m = new BicicletaMontaña();
			m.pintar();
		}
		if(opcion == 2) {
			BicicletaRuta m = new BicicletaRuta();
			m.dibujarBicicleta();
		}
		if(opcion == 3) {
			BicicletaMontañaRuedaRuta m = new BicicletaMontañaRuedaRuta();
			m.imprimir();
		}
		
		System.out.println("termino!!!");
		
	}

}
