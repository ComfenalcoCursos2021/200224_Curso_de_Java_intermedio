package com.unc.grupo.mayo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		MisFuncionesDeInstancias funciones = new MisFuncionesDeInstancias();

		CajaNumerica cajaA = new CajaNumerica();
		CajaNumerica cajaB = new CajaNumerica();

		cajaA.setDato(30);
		cajaB.setDato(50);
		System.out.println(cajaA.getDato());
		System.out.println(cajaB.getDato());
		System.out.println("==================");

		funciones.duplicar(cajaA);

		System.out.println(cajaA.getDato());
		System.out.println(cajaB.getDato());

		System.out.println("Impuesto - > " + cajaA.getImpuesto());
		System.out.println("Ingrese el valor base para calcular el impuesto");
		float valorBase = 25000;// teclado.nextFloat();
		System.out.println("*********");
		cajaA.setImpuesto(21);
		System.out.println("Base\t\t" + valorBase);
		float valorImpuesto = valorBase * cajaA.getImpuesto() / 100f;
		System.out.println("Impuesto\t" + valorImpuesto);
		System.out.println("______________________");
		System.out.println("Total\t\t" + (valorImpuesto + valorBase));
		
		System.out.println("--------------------------------");
		System.out.println("123\t456\n78\n\n\t9");
		System.out.println("Termino!!!");
	}

}
