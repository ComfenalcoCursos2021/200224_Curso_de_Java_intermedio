package com.unc.grupo.mayo;

public class Principal {

	public static void main(String[] args) {				
		int a = 15;
		int b = 15;		
		a = 30;
		System.out.println(a);
		System.out.println(b);
		b = a;
		a = 45;
		System.out.println(a);
		System.out.println(b);
		System.out.println("=================================");
		CajaNumerica cajaA = new CajaNumerica();
		CajaNumerica cajaB = new CajaNumerica();
		cajaA.dato = 30;
		System.out.println(cajaA.dato);
		System.out.println(cajaB.dato);
		cajaB = cajaA;
		cajaA.dato = 45;
		System.out.println(cajaA.dato);
		System.out.println(cajaB.dato);
		System.out.println("----------------------------------");
		cajaB.dato = 89;
		System.out.println(cajaA.dato);
		System.out.println(cajaB.dato);
		
		System.out.println("Termino!!!");
	}

}
