package com.unc.poo.recursos;

import java.util.ArrayList;
import java.util.List;

public class Venta {

	private Empleado vendedor;
	private Cliente cliente;
	private List<Inventario> productosPorVender;
	
	public Venta() {
		this.productosPorVender = new ArrayList<Inventario>();
	}
	
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
	
	public String toString() {
		String formato = "";
		formato = formato + "+---------------------------------------------\r\n";
		formato = formato + "|Cliente:\t"+this.cliente.getNombre() + "\r\n";
		formato = formato + "|Empleado:\t"+this.vendedor.getNombre() + "\r\n";
		formato = formato + "|\r\n|Productos:\t\r\n\r\n";
		
		for (Inventario elemento : productosPorVender) {
			formato = formato + "|" + elemento.getProducto().getNombre() + "\t\t" + elemento.getCantidad() + "\r\n";
		}
		return formato;
	}
	
}
