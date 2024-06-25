package com.unc.poo;

import com.unc.poo.interfaces.IConn;

public class SQLServerConn extends Conn implements IConn{

	public SQLServerConn() {
		this.setUser("-->SQL SERVER USER<--");
	}
	public void conectar() {
		System.out.println("Conectando desde SQLServer");
	}
	public void consultar() {
		System.out.println("Consultando desde SQLServer");
	}
}
