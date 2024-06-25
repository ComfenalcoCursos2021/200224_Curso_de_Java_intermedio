package com.unc.poo;

import com.unc.poo.interfaces.IConn;

public class PostgreSQLConn extends AbstractConn {

	public void conectar() {
		System.out.println("Conectando desde PostgreSQL");
	}
	public void consultar() {
		System.out.println("Consultando desde PostgreSQL");
	}
}
