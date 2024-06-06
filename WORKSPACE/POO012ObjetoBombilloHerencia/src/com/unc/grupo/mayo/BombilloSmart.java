package com.unc.grupo.mayo;

public class BombilloSmart extends Bombillo {

	public BombilloSmart(float altoValor, float anchoValor, float profundoValor, String tipoValor, String colorValor,
			float lumensValor) {
		super(altoValor, anchoValor, profundoValor, tipoValor, colorValor, lumensValor);
		// TODO Auto-generated constructor stub
	}



	private String nombreWifi;
	private String passwordWifi;
	private String modo;
	
	public String estaEncendido() {
		return "ESTOY EN LA CLASE HIJA Y NO SE SI ESTA ENCENDIDO";
	}
	
	
	

}
