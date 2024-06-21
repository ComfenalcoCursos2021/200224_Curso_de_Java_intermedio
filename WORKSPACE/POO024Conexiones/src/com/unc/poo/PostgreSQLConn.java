package com.unc.poo;

public class PostgreSQLConn extends Conn{

	public void conectar() {
		System.out.println("Conectando desde PostgreSQL");
	}
	public void consultar() {
		System.out.println("Consultando desde PostgreSQL");
	}
}
