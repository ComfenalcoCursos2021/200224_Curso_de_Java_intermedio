package com.unc.grupo.poo.rutinas;

import java.util.Scanner;

import com.unc.grupo.poo.recursos.IndiceIterador;
import com.unc.grupo.poo.recursos.ManejadorListas;

public class RutinaAgregarImprimir {

	private ManejadorListas<Integer> manejador;
	private Scanner teclado;

	public RutinaAgregarImprimir() {
		manejador = new ManejadorListas<Integer>();
		teclado = new Scanner(System.in);

		// -------8<-------8<-------8<-------8<-------8<-------8<
		manejador.agregar(10);
		manejador.agregar(200);
		manejador.agregar(3000);

		// -------8<-------8<-------8<-------8<-------8<-------8<
	}

	private void imprimirBienvenida() {
		System.out.println("+----------------------------------+");
		System.out.println("|                                  |");
		System.out.println("|          BIENVENIDA              |");
		System.out.println("|                                  |");
	}

	private void imprimirOpciones() {
		System.out.println("+----------------------------------+");
		System.out.println("|     1. AGREGAR                   |");
		System.out.println("|     2. IMPRIMIR TODOS            |");
		System.out.println("|                                  |");
		System.out.println("|     9. SALIR                     |");
		System.out.println("+----------------------------------+");
	}

	private void imprimirMenu() {
		int opcion = 0;
		this.imprimirBienvenida();
		while (opcion != 9) {
			this.imprimirOpciones();

			System.out.println("|     INGRESE UNA OPCION:          |");
			System.out.print("|#> ");
			opcion = this.teclado.nextInt();
			while (opcion != 1 && opcion != 2 && opcion != 9) {
				System.out.println("|     INGRESE UNA OPCION VALIDA    |");
				System.out.print("|#> ");
				opcion = this.teclado.nextInt();
			}

			if (opcion == 1) {
				System.out.println("| INGRESE EL DATO A GUARDAR:       |");
				System.out.print("|#> ");
				int dato = this.teclado.nextInt();
				this.manejador.agregar(dato);
				System.out.println("| DATO ALMACENADO CON EXITO:       |");
			}

			if (opcion == 2) {
				System.out.println("+----------------------------------+");
				System.out.println("| TODOS LOS DATOS ALMACENADOS SON  |");
				System.out.println("+----------------------------------+");
				IndiceIterador<Integer> iterador = this.manejador.getIterador();
				while (iterador.tieneSiguiente()) {

					System.out.println(this.empaquetado(iterador.siguiente()));
				}

				System.out.println("+----------------------------------+");
			}
		}

	}

	private String empaquetado(int dato) {
		// String datoComoTexto = dato + "";
		String datoComoTexto = String.valueOf(dato);
		int formatoInternoEspacios = 34;

		String formato = "|";

		String formatoDato = "";
		formatoDato = formatoDato + datoComoTexto;
		for (int i = 0; i < (formatoInternoEspacios - datoComoTexto.length()); i = i + 1) {
			formatoDato = formatoDato + " ";
		}
		formato = formato + formatoDato;

		formato = formato + "|";

		return formato;
	}

	public void iniciarRutina() {
		imprimirMenu();
	}

}
