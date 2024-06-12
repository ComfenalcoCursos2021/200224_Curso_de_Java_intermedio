package com.grupo.poo.unc;

public class Dimensiones {
	private float ancho;
	private float alto;
	private float profundo;

	public Dimensiones(float anchoValor, float altoValor, float profundoValor) {
		this.alto = altoValor;
		this.ancho = anchoValor;
		this.profundo = profundoValor;
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getProfundo() {
		return profundo;
	}

	public void setProfundo(float profundo) {
		this.profundo = profundo;
	}

}
