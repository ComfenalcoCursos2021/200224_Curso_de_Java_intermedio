package com.unc.poo.inicio;

import java.util.Scanner;

import com.unc.poo.inicio.recursos.Bicicleta;
import com.unc.poo.inicio.recursos.MarcoMontaña;
import com.unc.poo.inicio.recursos.MarcoRuta;
import com.unc.poo.inicio.recursos.RuedaLarga;
import com.unc.poo.inicio.recursos.RuedaLigera;
import com.unc.poo.inicio.recursos.RuedaMontaña;
import com.unc.poo.inicio.recursos.RuedaOruga;
import com.unc.poo.inicio.recursos.RuedaRara;
import com.unc.poo.inicio.recursos.RuedaRuta;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		Bicicleta enConstruccion = new Bicicleta();
		System.out.println("Bienvenido a arma tu bicicleta");
		
		System.out.println("+--------------------+");
		System.out.println("Selecciona tu marco:");
		System.out.println("1. montaña");
		System.out.println("2. ruta");
		
		int opcion = teclado.nextInt();
		
		if(opcion == 1) {
			MarcoMontaña marcoMontaña = new MarcoMontaña();
			enConstruccion.setMarco(marcoMontaña);
		}
		if(opcion == 2) {
			MarcoRuta marcoRuta = new MarcoRuta();
			enConstruccion.setMarco(marcoRuta);
		}
		
		
		System.out.println("+--------------------+");
		System.out.println("Selecciona tu rueda:");
		System.out.println("1. montaña");
		System.out.println("2. ruta");
		System.out.println("3. oruga");
		System.out.println("4. ligera");
		System.out.println("5. rara");
		System.out.println("6. larga");
		
		opcion = teclado.nextInt();
		
		if(opcion == 1) {
			RuedaMontaña ruedaMontaña = new RuedaMontaña();
			enConstruccion.setRueda(ruedaMontaña);
		}
		if(opcion == 2) {
			RuedaRuta ruedaRuta = new RuedaRuta();
			enConstruccion.setRueda(ruedaRuta);
		}
		if(opcion == 3) {
			RuedaOruga ruedaOruga = new RuedaOruga();
			enConstruccion.setRueda(ruedaOruga);
		}
		if(opcion == 4) {
			RuedaLigera ruedaLigera = new RuedaLigera();
			enConstruccion.setRueda(ruedaLigera);
		}
		
		if(opcion == 5) {
			RuedaRara rueda = new RuedaRara();
			enConstruccion.setRueda(rueda);
		}
		if(opcion == 6) {
			RuedaLarga rueda = new RuedaLarga();
			enConstruccion.setRueda(rueda);
		}
		
		System.out.println("Imprimiendo");
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		
		Thread.sleep(1000);
		System.out.print(".\n\n\n");
		enConstruccion.dibujarBicicleta();
		
		System.out.println("termino!!!");
		
	}

}
