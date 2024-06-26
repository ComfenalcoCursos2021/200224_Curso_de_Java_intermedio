package com.unc.poo.recursos;

public class Inventario {
	private Producto producto;
	private int cantidad;	
	
	public Inventario(Producto producto, int cantidad) {		
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	/*public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}*/
	public void procesarCantidad(int cantidadValor) {
		this.cantidad = this.cantidad + cantidadValor;
	}
	
	
	public String toString() {
		String formato = "";
		
		formato = formato + "+-----------------------------+\n";
		formato = formato + "|   "+this.producto.getNombre()+"   |     "+this.cantidad+"     |\n";
		formato = formato + "+-----------------------------+";
		
		return formato;
	}
	
}
