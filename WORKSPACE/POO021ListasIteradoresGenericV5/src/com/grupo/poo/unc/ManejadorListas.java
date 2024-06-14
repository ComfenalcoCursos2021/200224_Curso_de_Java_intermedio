package com.grupo.poo.unc;

public class ManejadorListas<T> {

	private CajaDato<T> primero;
	
	public void agregar(T datoValor) {
		if(primero == null) {
			CajaDato<T> nuevo = new CajaDato<T>();
			nuevo.setDato(datoValor);
			primero = nuevo;
		} else {
			
			CajaDato<T> temporal = primero;
			while(temporal.getSiguiente() != null) {
				temporal = temporal.getSiguiente();
			}
			
			CajaDato<T> nuevo = new CajaDato<T>();
			nuevo.setDato(datoValor);
			temporal.setSiguiente(nuevo);
		}
	}
	
	public void imprimirLista() {
		System.out.println("============================================");
		CajaDato<T> temporal = primero;
		while(temporal != null) {
			System.out.println(temporal.getDato());
			temporal = temporal.getSiguiente();
		}
		System.out.println("============================================");
	}
	
	public IndiceIterador<T> getIterador() {
		IndiceIterador<T> nuevo = new IndiceIterador<T>(this.primero);
		return nuevo;
	}
}
