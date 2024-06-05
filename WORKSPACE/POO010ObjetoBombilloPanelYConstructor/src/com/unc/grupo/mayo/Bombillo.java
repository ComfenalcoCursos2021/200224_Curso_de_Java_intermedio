package com.unc.grupo.mayo;

public class Bombillo {
		
	private boolean encendido;	
	private float lumens;
	private String color;
	private String tipo;
	
	private float ancho;
	private float alto;
	private float profundo;
	
	
	public Bombillo (float altoValor, float anchoValor, float profundoValor) {
		System.out.println("******************el constructor");
		
		this.alto = altoValor;
		this.ancho = anchoValor;
		this.profundo = profundoValor;
	}
	
	
	public void encender() {
		this.encendido = true;
	}
	public void apagar() {
		this.encendido = false;
	}
	
	public String estaEncendido() {
		if(this.encendido) {
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
	public void setLumens(float lumens) {
		this.lumens = lumens;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getAncho() {
		return ancho;
	}
	private void setAncho(float ancho) {
		this.ancho = ancho;
	}
	
	public float getAlto() {
		return alto;
	}
	private void setAlto(float alto) {
		this.alto = alto;
	}
	public float getProfundo() {
		return profundo;
	}
	private void setProfundo(float profundo) {
		this.profundo = profundo;
	}
	
	
	
	
}
