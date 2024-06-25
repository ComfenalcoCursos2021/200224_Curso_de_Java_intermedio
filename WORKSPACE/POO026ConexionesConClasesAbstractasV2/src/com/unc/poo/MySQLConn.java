package com.unc.poo;

import com.unc.poo.interfaces.IConn;

public class MySQLConn extends AbstractConn{

	@Override
	public void conectar() {
		System.out.println("Conectando desde Mysql");
		
	}

	@Override
	public void consultar() {
		System.out.println("Consultando desde Mysql");
		
	}


	
}
