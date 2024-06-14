package com.grupo.poo.unc.aves;

public class Pinguino extends AveArtica{

	public Pinguino(String nombreValor) {
		super(nombreValor);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String respuesta ="";
		respuesta = respuesta +" \n";
		respuesta = respuesta +" .______    __  .__   __.   _______  __    __   __  .__   __.   ______   \n";
		respuesta = respuesta +" |   _  \\  |  | |  \\ |  |  /  _____||  |  |  | |  | |  \\ |  |  /  __  \\  \n";
		respuesta = respuesta +" |  |_)  | |  | |   \\|  | |  |  __  |  |  |  | |  | |   \\|  | |  |  |  | \n";
		respuesta = respuesta +" |   ___/  |  | |  . `  | |  | |_ | |  |  |  | |  | |  . `  | |  |  |  | \n";
		respuesta = respuesta +" |  |      |  | |  |\\   | |  |__| | |  `--'  | |  | |  |\\   | |  `--'  | \n";
		respuesta = respuesta +" | _|      |__| |__| \\__|  \\______|  \\______/  |__| |__| \\__|  \\______/  \n";
		respuesta = respuesta +"                                                                         \n";
		respuesta = respuesta +" NOMBRE::> " + this.getNombre() + "\n";
		respuesta = respuesta +" \n";
		
		return respuesta;
	}
}
