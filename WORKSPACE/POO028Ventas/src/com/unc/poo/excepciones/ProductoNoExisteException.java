package com.unc.poo.excepciones;

public class ProductoNoExisteException extends Exception{

	public ProductoNoExisteException(String mensaje) {
		super(mensaje);
	}
}
