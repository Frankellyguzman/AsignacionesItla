package paqueteitla;

import java.util.Scanner;

public class Ejercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//21.  Leer un n�mero entero y calcular el promedio entero de las factoriales de los enteros comprendidos entre 1 y el n�mero le�do.
		
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

		System.out.println("El promedio entero de la suma de los factoriales es: " + (prom / n));

		entrada.close();

	}
}