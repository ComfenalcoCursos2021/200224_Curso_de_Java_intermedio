package com.unc.poo.interfazusuario;

import java.util.List;
import java.util.Scanner;

import com.unc.poo.excepciones.ProductoNoExisteException;
import com.unc.poo.motores.MotorInventario;
import com.unc.poo.recursos.Inventario;
import com.unc.poo.recursos.Producto;

public class InterfazUsuarioInventarios {

	private Scanner teclado = new Scanner(System.in);
	private MotorInventario motor;
	
	public InterfazUsuarioInventarios(MotorInventario motorValor) throws ProductoNoExisteException {
		this.motor = motorValor;
		/// ------------8<------------8<------------8<------------8<
		this.cargarProductosPrueba();
		/// ------------8<------------8<------------8<------------8<
	}
	
	public void ejecutar() throws ProductoNoExisteException {
		
		

		int opcion = 99;

		while (opcion != 9) {
			// motor.imprimir();
			System.out.println("#######=> SECCION DE INVENTARIOS");
			System.out.println("\t1. Agregar");
			System.out.println("\t2. Dar de baja");
			System.out.println("\t3. imprimir productos actuales");
			System.out.println("\t9. Salir");

			opcion = teclado.nextInt();
			if (opcion == 1) {
				this.opcionAgregar();
			}
			if (opcion == 2) {
				this.opcionDarBaja();
			}
			if (opcion == 3) {
				this.motor.imprimir();
			}

		}

	}

	private void opcionDarBaja() throws ProductoNoExisteException {

		System.out.println("#####=>DAR DE BAJA PRODUCTO DEL INVENTARIO");
		Producto paraDarBaja = this.runBuscador();
		if(paraDarBaja != null) {
			System.out.println("\tCantidad de producto a descontar");
			int cantidad = teclado.nextInt();
	
			try {
				motor.darBaja(paraDarBaja, cantidad);
				System.out.println("Producto descontado con exito");
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println("EL PRODUCTO NO EXISTE, DEBES VOLVER A HACER EL PROCESO");
			}
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
		
			this.motor.agregar(new Producto("Balon" , 50000), 10);

			this.motor.agregar(new Producto("Arroz" , 45000), 15);
			
				this.motor.agregar(new Producto("Cafe", 120000), 500);
			
			this.motor.agregar(new Producto("Papas" , 3000), 10);

			this.motor.agregar(new Producto("Cerveza" , 58000), 300);
		

	}

	public Producto runBuscador() {

		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("============>BUSCADOR DE PRODUCTOS");
		int seleccion = 0;
		while (seleccion == 0) {
			System.out.println("\tIngrese el producto a buscar o -1 para cancelar");
			String texto = teclado.next();

			if(texto.equals("-1")) {
				seleccion = 1;
				continue;
			}
			
			List<Inventario> inventarios = this.motor.buscarMultiple(texto);
			if (inventarios.size() > 50) {
				System.out
						.println("OBTUVIMOS " + inventarios.size() + " RESULTADOS, PRUEBA ESCRIBIENDO MAS CARACTERES");
			} else {

				if (inventarios.size() != 0) {
					if(inventarios.size() == 1) {
						return inventarios.get(0).getProducto();
					}
					System.out.println("_________________________________________________________");
					for (int i = 0; i < inventarios.size(); i++) {
						System.out.println("\t" + (i + 1) + ".  " + inventarios.get(i).getProducto().getNombre());
					}
					System.out.println("_________________________________________________________");
					System.out.println("\tQue producto quiere modificar?   presione 0 para volver a intentarlo ");

					seleccion = teclado.nextInt();
					if (seleccion > 0) {
						return inventarios.get(seleccion - 1).getProducto();
					}
				} else {
					System.out.println("No se encontraron resultados");
				}
			}
		}
		return null;

	}

}
