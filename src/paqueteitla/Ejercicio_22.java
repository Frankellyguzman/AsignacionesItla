package paqueteitla;

import java.util.Scanner;

public class Ejercicio_22 {

	public static void main(String[] args) {

		// 22.  Leer un número entero y calcular a cuánto es igual la 
		//sumatoria de todas las factoriales de los números comprendidos entre 1 y el número leído
		
		System.out.println(
				"Ingresa un numero entero para calcular el promedio de los factoriales comprendidos entre 1 y el numeor ingresado");

		Scanner entrada = new Scanner(System.in);
		int n, f = 1, prom = 0;

		do {

			n = entrada.nextInt();
			if (n < 1)
				System.out.println("Recuerda que el numero debe ser mayor a 1");

		} while (n < 1);

		for (int i = n; i != 0; i--) {

			for (int j = i; j != 1; j--) {
				f = f * j;
			}
			prom = prom + f;
			System.out.println("El factorial de " + i + " es " + f);
			f = 1;
		}

		System.out.println("La sumatoria de los misms es: " + prom);

		entrada.close();

	}

}
