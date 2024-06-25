package com.unc.poo;

public class MenejadorConexion {

	//private MySQLConn conexion = new MySQLConn();
	//private SQLServerConn conexion = new SQLServerConn();
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
		String user = this.conexion.getUser();
		
		this.conexion.conectar();
	}
	
	public void consultar() {
		this.conexion.consultar();
	}

	
	
}
