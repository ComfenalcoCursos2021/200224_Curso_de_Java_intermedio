package com.unc.poo.inicio;

import com.unc.poo.excepciones.ProductoNoExisteException;
import com.unc.poo.interfazusuario.InterfazUsuarioInventarios;
import com.unc.poo.motores.MotorInventario;

public class Principal {

	public static void main(String[] args) throws ProductoNoExisteException {
		// TODO Auto-generated method stub
		MotorInventario motor = new MotorInventario();
		InterfazUsuarioInventarios iInv = new InterfazUsuarioInventarios();
		
		iInv.ejecutar(motor);
		
		
		System.out.println("TERMINO !!!!");
	}

}
