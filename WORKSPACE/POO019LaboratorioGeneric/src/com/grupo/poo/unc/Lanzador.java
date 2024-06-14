package com.grupo.poo.unc;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlmacenadorNumero a = new AlmacenadorNumero();
		AlmacenadorBombillo b = new AlmacenadorBombillo();
		AlmacenadorAve c = new AlmacenadorAve();
		
		a.setDato(89);
		Bombillo sala = new Bombillo();
		b.setDato(sala);
		
		Ave paloma = new Ave();
		c.setDato(paloma);
		
		
		System.out.println(a.getDato());

		System.out.println("======================================");
		
		AlmacenadorUniversal<Ave> aUniAve = new AlmacenadorUniversal<Ave>();
		AlmacenadorUniversal<Bombillo> aUniBombillo = new AlmacenadorUniversal<Bombillo>();
		AlmacenadorUniversal<Integer> aUniNumero = new AlmacenadorUniversal<Integer>();
		AlmacenadorUniversal<ManejadorListas> aUniManejador = new AlmacenadorUniversal<ManejadorListas>();
		aUniAve.setDato(paloma);
		aUniBombillo.setDato(sala);
		aUniNumero.setDato(89);
		ManejadorListas listaNormal = new ManejadorListas();
		aUniManejador.setDato(listaNormal);
		
		System.out.println("Termino!!!");
	}

}
