package com.unc.grupo.mayo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		FuncionesParaMiPrograma lasFunciones = new FuncionesParaMiPrograma();
		GeneradorTablasMultiplicar generador = new GeneradorTablasMultiplicar();
		
		generador.imprimirTabla(23);
		System.out.println("=============================================");
		generador.imprimirTodasTablasMejorado();
		System.out.println("=============================================");
		lasFunciones.imprimirBienvenida();
		int respuesta = lasFunciones.suma(15, 32);
		System.out.println("La respuesta = " + respuesta);
		
		
		
		for(int a = 0; a < 5; a=a+1) {
			System.out.println("Ingrese hasta donde quiere sumar");
			int n = teclado.nextInt();
			int respuestaSuma = lasFunciones.sumaNNumeros(n); 
			System.out.println("La suma de los "+ n + " numeros  es " + respuestaSuma);
		}
		
		System.out.println("Termino!!!");

	}

}
