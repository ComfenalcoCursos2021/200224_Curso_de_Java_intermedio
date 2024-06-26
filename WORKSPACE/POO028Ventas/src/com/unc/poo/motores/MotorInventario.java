package com.unc.poo.motores;

import java.util.ArrayList;
import java.util.List;

import com.unc.poo.excepciones.ProductoNoExisteException;
import com.unc.poo.recursos.Inventario;
import com.unc.poo.recursos.Producto;

public class MotorInventario {

	private List<Inventario> inventariosProductos;
	
	public MotorInventario() {
		inventariosProductos = new ArrayList<Inventario>();
	}
	
	
	private void procesarAgregarDarBaja(Producto producto, int cantidad) throws ProductoNoExisteException {
		Inventario i = this.buscarInventarioPorProducto(producto);
		
		//i.setCantidad(i.getCantidad() + cantidad);
		
		/*int cantidadActual = i.getCantidad();
		i.setCantidad(cantidadActual+cantidad);*/
		
		
		if(i != null) {
			i.procesarCantidad(cantidad);
		} else {
			if(cantidad > 0 ) {
				i = new Inventario(producto, cantidad);
				this.inventariosProductos.add(i);
			}
		}
			
		
		if(i==null) {
			throw new ProductoNoExisteException("El producto " + producto.getNombre() + " no existe" );
		}
	}
	public void agregar(Producto producto, int cantidad) throws ProductoNoExisteException {
		this.procesarAgregarDarBaja(producto, cantidad);	
	}
	
	public void darBaja(Producto producto, int cantidad) throws ProductoNoExisteException {
		this.procesarAgregarDarBaja(producto, cantidad*-1);
	}
	
	public Inventario buscar(String palabra) {
		Inventario buscado = null;
		for (int i = 0; i < inventariosProductos.size(); i++) {
			
			String nombreSimpleProductoEnInventario = inventariosProductos.get(i).getProducto().getNombre();			
			nombreSimpleProductoEnInventario = nombreSimpleProductoEnInventario.trim().toLowerCase();
			palabra = palabra.trim().toLowerCase();
			if(nombreSimpleProductoEnInventario.contains(palabra)) {
				buscado = inventariosProductos.get(i);
				break;
			}			
		}
		
		return buscado;
	}
	
	private Inventario buscarInventarioPorProducto(Producto p) {
		Inventario buscado = null;
		for (int i = 0; i < inventariosProductos.size(); i++) {
			/*if(inventariosProductos.get(i).getProducto().getNombre().equals(p.getNombre())) {
				buscado = inventariosProductos.get(i);
			}*/
			
			if(inventariosProductos.get(i).getProducto().equals(p)) {
				buscado = inventariosProductos.get(i);
			}
		}		
		
		return buscado;
	}
	
	public void imprimir() {
		System.out.println("********************************************");
		for (Inventario inventario : inventariosProductos) {
			System.out.println(inventario);
		}
		System.out.println("********************************************");
	}
	
}
