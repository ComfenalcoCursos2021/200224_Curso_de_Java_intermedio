package com.unc.grupo.mayo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Bombillo sala = new Bombillo(10,5,5,"Led","Azul",15000);	
			
		//BombilloSmart sala = new BombilloSmart(10, 10, 10, "Led", "Blanca", 20000);
		
		Scanner teclado = new Scanner(System.in);
		int opcion = -1;
		
		while(opcion != 9) {
			try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
			
			if(sala.isEncendido()) {
				System.out.println("¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-¡-");
				System.out.println("Estado actual del bombillo");
				System.out.println("\t\tEncendido\t" + sala.estaEncendido() + "\n");
				
				System.out.println("-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!-!");
			} else {
				System.out.println("+______________________________________________");
				System.out.println("|Estado actual del bombillo");
				System.out.println("|\t\tEncendido\t" + sala.estaEncendido() + "\n");
				System.out.println("+______________________________________________");	
			}
			System.out.println("Dimensiones Alto " + sala.getAlto() + "  Ancho " + sala.getAncho() + "   profundidad " + sala.getProfundo());
			
			
			System.out.println("Que desea hacer?");
			System.out.println("\t1. Para Encender");
			System.out.println("\t2. Para Apagar");
			System.out.println("\t9. Para Salir");
			opcion = teclado.nextInt();
			
			if(opcion == 1) {
				sala.encender();
				
			}
			
			if(opcion == 2) {
				sala.apagar();
			}
			
			
		}
		
		teclado.close();
		System.out.println("Termino!!!");
	}

}
