package com.unc.grupo.mayo;

public class Principal {

	public static void main(String[] args) {				
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
		
		
		
		System.out.println("Termino!!!");
	}

}
