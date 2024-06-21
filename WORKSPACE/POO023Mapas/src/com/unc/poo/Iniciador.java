package com.unc.poo;

import java.util.HashMap;

import javax.swing.JFrame;

public class Iniciador {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Object> mapa = new HashMap<String,Object>();
		
		Bombillo a = new Bombillo(15, 15, 15, "led", "azul", 15000f);
		Bombillo b = new Bombillo(30, 30, 30, "led", "azul", 30000f);
		
		JFrame ventana = new JFrame("Titulo");
		
		mapa.put("uno", a);
		mapa.put("dos", b);
		mapa.put("Ventana", ventana);
		
		
		Bombillo valor = (Bombillo) mapa.get("dos");
		
		JFrame ventanaRecuperada = (JFrame) mapa.get("Ventana");
		
		JFrame valorDos = (JFrame) mapa.get("Ventana");
		
		
		System.out.println(valor);
		
		
		MetodosRapidos metodos= new MetodosRapidos();
		
		
		
		String resultado = metodos.mensaje("prueba");
		
		System.out.println(resultado);
		
	}

}
