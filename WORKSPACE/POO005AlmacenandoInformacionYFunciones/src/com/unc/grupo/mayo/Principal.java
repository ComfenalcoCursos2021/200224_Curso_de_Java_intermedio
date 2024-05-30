package com.unc.grupo.mayo;

public class Principal {

	public static void main(String[] args) {				
		MisFuncionesDeInstancias funciones = new MisFuncionesDeInstancias();
		
		CajaNumerica cajaA = new CajaNumerica();
		CajaNumerica cajaB = new CajaNumerica();
		
		cajaA.dato = 30;
		cajaB.dato = 50;
		System.out.println(cajaA.dato);
		System.out.println(cajaB.dato);
		System.out.println("==================");
		
		funciones.duplicar(cajaA);
		
		System.out.println(cajaA.dato);
		System.out.println(cajaB.dato);
		
		
		
		System.out.println("Termino!!!");
	}

}
