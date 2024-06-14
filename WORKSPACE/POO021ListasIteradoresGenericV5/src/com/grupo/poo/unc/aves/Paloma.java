package com.grupo.poo.unc.aves;

public class Paloma extends AveTerrestre {

	public Paloma(String nombreValor) {
		super(nombreValor);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		String respuesta = "+------PALOMA------+\n";
		respuesta = respuesta + "+------" +this.getNombre() +  "------+\n";
		return respuesta;
	}

}
