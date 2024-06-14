package com.grupo.poo.unc;

public class ManejadorListas {

	private CajaDato primero;
	
	public void agregar(int datoValor) {
		if(primero == null) {
			CajaDato nuevo = new CajaDato();
			nuevo.setDato(datoValor);
			primero = nuevo;
		} else {
			
			CajaDato temporal = primero;
			while(temporal.getSiguiente() != null) {
				temporal = temporal.getSiguiente();
			}
			
			CajaDato nuevo = new CajaDato();
			nuevo.setDato(datoValor);
			temporal.setSiguiente(nuevo);
		}
	}
	
	public void imprimirLista() {
		System.out.println("============================================");
		CajaDato temporal = primero;
		while(temporal != null) {
			System.out.println(temporal.getDato());
			temporal = temporal.getSiguiente();
		}
		System.out.println("============================================");
	}
	
	public IndiceIterador getIterador() {
		IndiceIterador nuevo = new IndiceIterador(this.primero);
		return nuevo;
	}
}
