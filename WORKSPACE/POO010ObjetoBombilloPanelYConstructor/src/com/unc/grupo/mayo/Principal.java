package com.unc.grupo.mayo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Bombillo sala = new Bombillo(10,5,5);
		
		sala.setAlto(10);
		sala.setAncho(5);
		sala.setProfundo(5);
		sala.setColor("Azul");
		sala.setLumens(15000);
		sala.setTipo("Led");
		
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
			
			
			
			System.out.println("Que desea hacer?");
			System.out.println("\t1. Para Encender");
			System.out.println("\t2. Para Apagar");
			System.out.println("\t9. Para Salir");
			opcion = teclado.nextInt();
			
			if(opcion == 1) {
				sala.encender();
				sala.setAlto(20);
			}
			
			if(opcion == 2) {
				sala.apagar();
			}
			
			
		}
		
		teclado.close();
		System.out.println("Termino!!!");
	}

}
