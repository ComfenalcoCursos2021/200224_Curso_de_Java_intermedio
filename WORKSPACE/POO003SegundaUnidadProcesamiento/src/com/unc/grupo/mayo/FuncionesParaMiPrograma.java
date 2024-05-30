package com.unc.grupo.mayo;

public class FuncionesParaMiPrograma {

	public void imprimirBienvenida() {
		System.out.println("██████╗░██╗███████╗███╗░░██╗██╗░░░██╗███████╗███╗░░██╗██╗██████╗░░█████╗░");
		System.out.println("██╔══██╗██║██╔════╝████╗░██║██║░░░██║██╔════╝████╗░██║██║██╔══██╗██╔══██╗");
		System.out.println("██████╦╝██║█████╗░░██╔██╗██║╚██╗░██╔╝█████╗░░██╔██╗██║██║██║░░██║███████║");
		System.out.println("██╔══██╗██║██╔══╝░░██║╚████║░╚████╔╝░██╔══╝░░██║╚████║██║██║░░██║██╔══██║");
		System.out.println("██████╦╝██║███████╗██║░╚███║░░╚██╔╝░░███████╗██║░╚███║██║██████╔╝██║░░██║");
		System.out.println("╚═════╝░╚═╝╚══════╝╚═╝░░╚══╝░░░╚═╝░░░╚══════╝╚═╝░░╚══╝╚═╝╚═════╝░╚═╝░░╚═╝");
	}
	public int suma(int a, int b) {
		int suma = a+b;
		return suma;
	}
	
	public int sumaNNumeros(int hastaDondeSumar) {
		int suma = 0;
		for(int i = 0; i<= hastaDondeSumar; i=i+1) {
			suma = suma + i;
		}
		return suma;
	}
}
