package paqueteitla;

public class Ejercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//17.	Determinar a cuánto es igual el promedio entero de los elementos de la serie de Fibonacci entre 0 y 1000. 

		int suma = 0,cont=0,i = 0, ii = 1, temp, limite = 1000;

		System.out.println(i);
		cont=cont+1;
		System.out.println(ii);
		
		suma=suma+ii;

		while (i + ii < limite) {

			temp = i;
			i = ii;
			ii = temp + i;
			cont++;

			System.out.println(ii);
			
			suma= suma+ii;
			
			
			
			//System.out.println(cont);
		}
		
		System.out.println("\nEl promedio de todos los numeros de la series de Fibonacci"
				+ "es : " + suma/cont);
		
	}

}
