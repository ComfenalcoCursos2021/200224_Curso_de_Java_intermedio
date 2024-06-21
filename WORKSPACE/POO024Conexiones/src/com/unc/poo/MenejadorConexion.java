package com.unc.poo;

public class MenejadorConexion {

	private Conn conexion;
	
	public MenejadorConexion(int tipo) {
		if(tipo == 1) {
			this.conexion = new MySQLConn();
		}
		if(tipo == 2) {
			this.conexion = new SQLServerConn();
		}
		if(tipo == 3) {
			this.conexion = new PostgreSQLConn();
		}
	}
	
	public void conectar() {
		this.conexion.conectar();
	}
	
	public void consultar() {
		this.conexion.consultar();
	}

	
	
}
