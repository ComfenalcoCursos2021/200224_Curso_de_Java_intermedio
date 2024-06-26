package com.unc.poo.recursos;

public class Empleado extends Persona {
	private String cargo;
	private String codigoEmpleado;
	
	public Empleado(String nombreValor, String cargoValor, String codigoValor) {
		this.setNombre(nombreValor);
		this.cargo = cargoValor;
		this.codigoEmpleado = codigoValor;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	
	

}
