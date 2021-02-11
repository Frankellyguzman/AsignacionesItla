package paqueteitla;

public class Ejercicio_16 {

	public static void main(String[] args) {
		
		//Determinar a cuánto es igual la suma de los elementos de la serie de Fibonacci entre 0 y 100.

		int suma = 0,i = 0, ii = 1, temp, limite = 100;

		System.out.println(i);
		System.out.println(ii);
		
		suma=suma+ii;

		while (i + ii < limite) {

			temp = i;
			i = ii;
			ii = temp + i;
			
			System.out.println(ii);
			suma= suma+ii;

		}

		
		System.out.println("\nTotal de la suma de la serie es:\n"+suma);
	}

}
