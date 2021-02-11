package paqueteitla;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//15.	Pide un número (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho número
		
		
		System.out.println("Introduce un numero entre el 0 y el 10");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		int r;
		System.out.println("La tabla de multiplicar del " + i +" Es la siguiente");
		
		for(int ii=1; ii<13; ii++) {
			
			
			
			r=i*ii;
			System.out.println(r);

		}
		
	}

}
