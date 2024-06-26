package com.unc.poo.interfazusuario;

import java.util.Scanner;

import com.unc.poo.excepciones.ProductoNoExisteException;
import com.unc.poo.motores.MotorInventario;
import com.unc.poo.recursos.Inventario;
import com.unc.poo.recursos.Producto;

public class InterfazUsuarioInventarios {

	private Scanner teclado = new Scanner(System.in);
	private MotorInventario motor;
	
	public void ejecutar(MotorInventario motorValor) throws ProductoNoExisteException {
		this.motor = motorValor;
	///------------8<------------8<------------8<------------8<
	this.cargarProductosPrueba();	
	///------------8<------------8<------------8<------------8<
		
		int opcion = 99;
		
		System.out.println("#######=> SECCION DE INVENTARIOS");
		while(opcion != 9) {
			//motor.imprimir();
			System.out.println("#######=> SECCION DE INVENTARIOS");
			System.out.println("\t1. Agregar");
			System.out.println("\t2. Dar de baja");
			System.out.println("\t3. imprimir productos actuales");
			System.out.println("\t9. Salir");
			
			opcion = teclado.nextInt();
			if(opcion == 1) {
				this.opcionAgregar();
			}
			if(opcion == 2) {
				this.opcionDarBaja();
			}
			if(opcion == 3) {
				this.motor.imprimir();
			}
			
			
			
		}
	
	}
	private void opcionDarBaja() throws ProductoNoExisteException {
		
		System.out.println("#####=>DAR DE BAJA PRODUCTO DEL INVENTARIO");
		System.out.println("\tIngrese el nombre del producto");
		String nombre = teclado.next();
		System.out.println("\tCantidad de producto a descontar");
		int cantidad = teclado.nextInt();
		Producto paraDarBaja = new Producto(nombre, 0);
		
		try {
			motor.darBaja(paraDarBaja, cantidad);
			System.out.println("Producto descontado con exito");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("EL PRODUCTO NO EXISTE, DEBES VOLVER A HACER EL PROCESO");
		}
		
		
		
		System.out.println("#####################################...");
	}
	private void opcionAgregar() throws ProductoNoExisteException {
		System.out.println("#####=>AGREGAR PRODUCTO A INVENTARIO");
		System.out.println("\tIngrese el nombre del producto");
		String nombre = teclado.next();
		System.out.println("\tIngrese el precio");
		float precio = teclado.nextFloat();
		System.out.println("\tCantidad de producto");
		int cantidad = teclado.nextInt();
		
		Producto paraAgregar = new Producto(nombre, precio);
		this.motor.agregar(paraAgregar, cantidad);
		System.out.println("Producto agregado con exito");
		System.out.println("#####################################...");
		
		
	}
	
	private void cargarProductosPrueba() throws ProductoNoExisteException {
		for (int i = 0; i < 500; i++) {
			this.motor.agregar(new Producto("Balon"+i,50000), 10);
			
			this.motor.agregar(new Producto("Arroz"+i,45000), 15);
			if(i == 400) {
				this.motor.agregar(new Producto("Cafe",120000), 500);	
			}
			this.motor.agregar(new Producto("Papas"+i,3000), 10);
			
			this.motor.agregar(new Producto("Cerveza"+i,58000), 300);
		}
		
	}
	
}
