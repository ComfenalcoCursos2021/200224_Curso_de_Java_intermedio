package com.unc.poo;

import com.unc.poo.interfaces.IConn;

public class MySQLConn extends Conn implements IConn{

	public MySQLConn() {
		this.setUser("####EL USUARIO DESDE EL CONSTRUCTOR DE MYSQL###");
	}
	
	public void conectar() {
		System.out.println("Conectando desde MYSQL");
	}
	public void consultar() {
		System.out.println("Consultando desde MYSQL");
	}

	
}
