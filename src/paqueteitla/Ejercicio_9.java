package paqueteitla;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9.	Crear un bucle que se ejecuta 10 veces utilizando un entero que va de 10 a 19 incrementándose en 1.
		//Imprimir en cada bucle el valor del entero, menos cuando es igual a 15.

		for (int i = 10; i < 20; i++) {

			if (i == 15) {
				continue;
			}
			
			System.out.println(i);

		}

	}

}
