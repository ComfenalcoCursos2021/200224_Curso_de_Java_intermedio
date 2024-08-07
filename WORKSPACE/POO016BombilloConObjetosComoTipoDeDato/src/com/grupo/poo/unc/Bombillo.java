package com.grupo.poo.unc;

public class Bombillo {

	private boolean encendido;
	private float lumens;
	private String color;
	private String tipo;

	private Dimensiones medidas;

	/**
	 * Este constructor inicializa todos los valores del bombillo, para que este
	 * este funcional desde el principio
	 * 
	 * @param altoValor     Esta variable lleva el valor de la dimension del alto
	 * @param anchoValor    Esta variable lleva el valor de la dimension del ancho
	 * @param profundoValor Esta variable lleva el valor de la dimension de la
	 *                      profundidad
	 * @param tipoValor     Esta variable lleva el valor del tipo; tales como "LED"
	 *                      "Incandecente" "alogeno"
	 * @param colorValor    Esta variable lleva el valor del color
	 * @param lumensValor   Esta variable lleva el valor de la intensidad luminica
	 */
	public Bombillo(float altoValor, float anchoValor, float profundoValor, String tipoValor, String colorValor,
			float lumensValor) {
		System.out.println("******************el constructor");

		// this.alto = altoValor;
		// this.ancho = anchoValor;
		// this.profundo = profundoValor;

		this.medidas = new Dimensiones(anchoValor, altoValor, profundoValor);
		this.setTipo(tipoValor);
		this.setColor(colorValor);
		this.setLumens(lumensValor);
		this.apagar();
	}

	/**
	 * Este comportamiento cambia una propiedad interna para almacenar y controlar
	 * el estado actual del bombillo, podra ser consultada por medio del metodo
	 * estaEncendido()
	 */
	public void encender() {
		this.encendido = true;
	}

	public void apagar() {
		this.encendido = false;
	}

	/**
	 * Esta funcion retorna en una cadena SI/NO si esta encendido el bombillo
	 * 
	 * @return estado actual del bombillo
	 */
	public String estaEncendido() {
		if (this.encendido) {
			return "SI";
		} else {
			return "NO";
		}
	}

	public boolean isEncendido() {
		return this.encendido;
	}

	public float getLumens() {
		return lumens;
	}

	private void setLumens(float lumens) {
		this.lumens = lumens;
	}

	public String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Dimensiones getMedidas() {
		return medidas;
	}

	public void setMedidas(Dimensiones medidas) {
		this.medidas = medidas;
	}

}
