package unc.grupo.mayo;

import java.util.Scanner;

public class Inicial {

	public static void imprimirBienvenida() {
		System.out.println("██████╗░██╗███████╗███╗░░██╗██╗░░░██╗███████╗███╗░░██╗██╗██████╗░░█████╗░");
		System.out.println("██╔══██╗██║██╔════╝████╗░██║██║░░░██║██╔════╝████╗░██║██║██╔══██╗██╔══██╗");
		System.out.println("██████╦╝██║█████╗░░██╔██╗██║╚██╗░██╔╝█████╗░░██╔██╗██║██║██║░░██║███████║");
		System.out.println("██╔══██╗██║██╔══╝░░██║╚████║░╚████╔╝░██╔══╝░░██║╚████║██║██║░░██║██╔══██║");
		System.out.println("██████╦╝██║███████╗██║░╚███║░░╚██╔╝░░███████╗██║░╚███║██║██████╔╝██║░░██║");
		System.out.println("╚═════╝░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░╚══════╝╚═╝░░╚══╝╚═╝╚═════╝░╚═╝░░╚═╝");
	}
	public static int suma(int a, int b) {
		int suma = a+b;
		return suma;
	}
	
	public static int sumaNNumeros(int hastaDondeSumar) {
		int suma = 0;
		for(int i = 0; i<= hastaDondeSumar; i=i+1) {
			suma = suma + i;
		}
		return suma;
	}
	
	
	public static void main(String[] args) {
		
		imprimirBienvenida();
		int numero1 = 15;
		int numero2 = 30;
		int respuesta = suma(numero1,numero2);
		System.out.println("La suma es " + respuesta);
		Scanner teclado = new Scanner(System.in);
		for(int a = 0; a < 5; a=a+1) {
			System.out.println("Ingrese hasta donde quiere sumar");
			int n = teclado.nextInt();
			int respuestaSuma = sumaNNumeros(n); 
			System.out.println("La suma de los "+ n + " numeros  es " + respuestaSuma);
		}
		System.out.println("Termino!!!");
	}

}
