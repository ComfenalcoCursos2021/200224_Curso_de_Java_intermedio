package com.unc.grupo.mayo;

public class GeneradorTablasMultiplicar {

	public void imprimirTabla(int numeroParaTabla) {
		for (int i = 1; i <= 10; i = i + 1) {
			int temporal = i * numeroParaTabla;
			System.out.println(numeroParaTabla + "x" + i + "=" + temporal);
		}
	}
	
	public void imprimirTodasTablasMejorado() {
		for (int i = 1; i <= 10; i = i + 1) {
			imprimirTabla(i);
		}
	}
	
	public void imprimirTodasTablas() {
		for (int i = 1; i <= 10; i = i + 1) {
			for (int j = 1; j <= 10; j = j + 1) {
				int temporal = i * j;
				System.out.println(i + "x" + j + "=" + temporal);
			}
		}
	}
	
}
