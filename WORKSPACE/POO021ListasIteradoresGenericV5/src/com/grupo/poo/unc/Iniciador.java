package com.grupo.poo.unc;

import com.grupo.poo.unc.aves.Albatros;
import com.grupo.poo.unc.aves.Ave;
import com.grupo.poo.unc.aves.Colibri;
import com.grupo.poo.unc.aves.Paloma;
import com.grupo.poo.unc.aves.Pelicano;
import com.grupo.poo.unc.aves.Pinguino;
import com.grupo.poo.unc.bombillos.Bombillo;

public class Iniciador {

	public static void main(String[] args) {

		ManejadorListas<Integer> a = new ManejadorListas<Integer>();
		
		a.agregar(5);
		a.agregar(10);
		a.agregar(30);
		a.agregar(40);
		a.agregar(50);
		
		
		IndiceIterador<Integer> iterador = a.getIterador();
		
		while(iterador.tieneSiguiente()) {
			System.out.println("****************");
			System.out.println("*      "+iterador.siguiente()+"       *");
			System.out.println("****************");
		}
		System.out.println("//////////////////////////////////////////////////////////");
		ManejadorListas<Bombillo> listaBombillos= new ManejadorListas<Bombillo>(); 
		
		listaBombillos.agregar(new Bombillo(15,15,15,"Led","Azul",15000));
		listaBombillos.agregar(new Bombillo(55,55,55,"Incandecente","Amarilla",10000));
		
		IndiceIterador<Bombillo> iteradorBombillo = listaBombillos.getIterador();
		
		while(iteradorBombillo.tieneSiguiente()) {
			System.out.println(iteradorBombillo.siguiente());
		}
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		Paloma p1 = new Paloma("PUno");		
		Paloma p2 = new Paloma("PDos");
		
		ManejadorListas<Paloma> listaPalomas= new ManejadorListas<Paloma>(); 
		
		listaPalomas.agregar(p1);
		listaPalomas.agregar(p2);
		
		IndiceIterador<Paloma> iteradorPaloma = listaPalomas.getIterador();
		
		while(iteradorPaloma.tieneSiguiente()) {
			System.out.println(iteradorPaloma.siguiente());
		}
		System.out.println("?????????????????????????????????????????????????????");
		
		Pinguino pin1 = new Pinguino("PinUno");		
		Pinguino pin2 = new Pinguino("PinDos");
		
		ManejadorListas<Pinguino> listaPinguinos= new ManejadorListas<Pinguino>(); 
		
		listaPinguinos.agregar(pin1);
		listaPinguinos.agregar(pin2);
		
		IndiceIterador<Pinguino> iteradorPinguino = listaPinguinos.getIterador();
		
		while(iteradorPinguino.tieneSiguiente()) {
			System.out.println(iteradorPinguino.siguiente());
		}
		
		
		System.out.println("¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿");
		
		
		
		ManejadorListas<Ave> listaAves= new ManejadorListas<Ave>(); 
		
		listaAves.agregar(pin1);
		listaAves.agregar(pin2);
		listaAves.agregar(p1);
		listaAves.agregar(p2);
		listaAves.agregar(new Albatros("Alba 1"));
		listaAves.agregar(new Colibri("Col 1"));
		listaAves.agregar(new Pelicano("Pel 1"));
		
		IndiceIterador<Ave> iteradorAve = listaAves.getIterador();
		
		while(iteradorAve.tieneSiguiente()) {
			System.out.println(iteradorAve.siguiente());
		}
		System.out.println("Termino !!!!");
	}

}
