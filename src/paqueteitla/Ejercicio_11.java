package paqueteitla;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//11.	Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien usando un switch

		System.out.println("Introduzca una nota de 0 a 10 por favor");
		Scanner s = new Scanner(System.in);
		int nota = s.nextInt();

		switch (nota) {

		case 1:

			System.out.println("Insuficiente");
			break;

		case 2:

			System.out.println("Insuficiente");
			break;
		case 3:

			System.out.println("Insuficiente");
			break;
		case 4:

			System.out.println("Insuficiente");
			break;
		case 5:

			System.out.println("Suficiente");
			break;
		case 6:

			System.out.println("Suficiente");
			break;
		case 7:

			System.out.println("Suficiente");
			break;
		case 8:

			System.out.println("Bueno");
			break;
		case 9:

			System.out.println("Bueno");
			break;

		case 10:

			System.out.println("Bueno");
			break;
		}

	}

}
