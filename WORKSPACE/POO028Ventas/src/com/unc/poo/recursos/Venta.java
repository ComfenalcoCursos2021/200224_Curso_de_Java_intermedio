package com.unc.poo.recursos;

import java.util.List;

public class Venta {

	private Empleado vendedor;
	private Cliente cliente;
	private List<Inventario> productosPorVender;
	
	public Empleado getVendedor() {
		return vendedor;
	}
	public void setVendedor(Empleado vendedor) {
		this.vendedor = vendedor;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Inventario> getProductosPorVender() {
		return productosPorVender;
	}
	public void setProductosPorVender(List<Inventario> productosPorVender) {
		this.productosPorVender = productosPorVender;
	}
	
	
}
