package com.unc.poo;

public class MetodosRapidos {

	public String mensaje(String mensaje) {
		String mensajeTotal = "";
		for (int i = 1; i <= 10; i++) {
			mensajeTotal = mensajeTotal + (i + " concatenacion " + mensaje) + "\r\n";
		}
		return mensajeTotal;
	}

}
