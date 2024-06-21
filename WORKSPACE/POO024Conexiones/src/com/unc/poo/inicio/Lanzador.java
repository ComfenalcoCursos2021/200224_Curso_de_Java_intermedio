package com.unc.poo.inicio;

import com.unc.poo.MenejadorConexion;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenejadorConexion con = new MenejadorConexion(1);
		System.out.println("CONECTANDO......");
		System.out.println("+-------------------------------+");
		con.conectar();
		System.out.println("+-------CONSULTANDO...----------+");
		con.consultar();
		
		System.out.println("Termino  !!");
	}

}
