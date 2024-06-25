package com.unc.poo;

import com.unc.poo.interfaces.IConn;

public class MenejadorConexion {

	//private MySQLConn conexion = new MySQLConn();
	//private SQLServerConn conexion = new SQLServerConn();
	private AbstractConn conexion;
	
	public MenejadorConexion(String motor) {
		
		
		if("MYSQL".equals(motor)) {
			this.conexion = new MySQLConn();
		}
		if("SQLSERVER".equals(motor)) {
			this.conexion = new SQLServerConn();
		}
		if("POSTGRE".equals(motor)) {
			this.conexion = new PostgreSQLConn();
		}
		
	}
	
	public void conectar() {
		String usuario = this.conexion.getUser();
		System.out.println("USANDO EL USUARIO " + usuario + " para la conexion");
		this.conexion.conectar();
	}
	
	public void consultar() {
		this.conexion.consultar();
	}

	
	
}
