package poo.grupo.mayo.unc;

import java.util.Scanner;

public class Primera {	
	
	public static void main(String[] argumentos) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		short a = 18;
		int b = 18;
		long c = 18;
		float d = 18;
		double e = 18;
		
		Short am = new Short("18");
		Integer bm = new Integer(18);
		Long cm = new Long(18);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println("--------------");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println("--------------");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println("--------------");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println("--------------");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println("Ingrese la edad");
		short edad = teclado.nextShort();
		
		if(edad >= 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		
		int suma = 0;
		System.out.println("Ingrese hasta donde quiere sumar");
		int n = teclado.nextInt();
		
		for(int i = 0; i <= n; i=i+1 ) {
			
			suma = suma + i;
		}
		
		System.out.println(" La suma es " + suma );
		
		
		System.out.println("Ingrese un numero mayor que 100 ");
		int elNumero = teclado.nextInt();
		
		while(elNumero < 100) {
			System.out.println("Recuerde que el numero debe ser mayor que 100");
			elNumero = teclado.nextInt();
		}
		
		
		
		
		System.out.println("TERMINO");
		System.out.println();
		System.out.println();
		
	}
	
}
