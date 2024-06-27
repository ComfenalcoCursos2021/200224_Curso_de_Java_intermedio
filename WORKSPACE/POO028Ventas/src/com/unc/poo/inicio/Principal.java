package com.unc.poo.inicio;

import com.unc.poo.excepciones.ProductoNoExisteException;
import com.unc.poo.interfazusuario.InterfazUsuarioInventarios;
import com.unc.poo.interfazusuario.InterfazUsuarioVentas;
import com.unc.poo.motores.MotorInventario;

public class Principal {

	public static void main(String[] args) throws ProductoNoExisteException {
		// TODO Auto-generated method stub
		
		
		MotorInventario motor = new MotorInventario();
		InterfazUsuarioInventarios iInv = new InterfazUsuarioInventarios(motor);
		InterfazUsuarioVentas iVentas = new InterfazUsuarioVentas();
		int opcion=2;
		System.out.println("BIENVENIDA PRINCIPAL");
		System.out.println("1. Inventarios");
		System.out.println("2. Venta");
		
		
		motor.imprimir();
		if(opcion==1) {
			iInv.ejecutar();	
		}
		if(opcion==2) {
			iVentas.runVenta(motor, iInv);	
		}
		motor.imprimir();
		
		
		System.out.println("TERMINO !!!!");
	}

}
