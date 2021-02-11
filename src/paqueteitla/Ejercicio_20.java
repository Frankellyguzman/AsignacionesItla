package paqueteitla;

import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Leer un número y calcularles la factorial a todos los enteros comprendidos entre 1 y el número leído. 
		System.out.println(
				"Ingresa un numero entero para calcular el factorial de todos los numeros comprendidos entre el 1 y el numero que ingresaste");

		Scanner entrada = new Scanner(System.in);
		int n, f = 1;

		do {

			n = entrada.nextInt();
			if (n < 1)
				System.out.println("Recuerda que el numero debe ser mayor a 1");

		} while (n < 1);

		for (int i = n; i != 0; i--) {

			for (int j = i; j != 1; j--) {
				f = f * j;
			}
			System.out.println("El factorial de " + i + " es " + f);
			f = 1;
		}

		entrada.close();

	}
}
