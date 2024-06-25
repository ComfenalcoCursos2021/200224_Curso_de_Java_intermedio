package com.unc.poo.inicio.recursos;

import com.unc.poo.inicio.interfaces.IMarco;
import com.unc.poo.inicio.interfaces.IRueda;

public class Bicicleta {

	private IMarco marco;
	private IRueda rueda;

	public IRueda getRueda() {
		return rueda;
	}

	public void setRueda(IRueda rueda) {
		this.rueda = rueda;
	}

	public IMarco getMarco() {
		return marco;
	}

	public void setMarco(IMarco marco) {
		this.marco = marco;
	}
	
	public void dibujarBicicleta() {
		this.marco.dibujar();
		this.rueda.dibujar();
	}
}
