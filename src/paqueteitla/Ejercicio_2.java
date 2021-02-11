package paqueteitla;
import java.util.Scanner;

public class Ejercicio_2 {
	
	//2.	Buscar cómo se declara una constante en java e imprimir el valor. Probar de cambiar su valor luego y ver que es lo que pasa.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String constante = "Esta es una constante"; 
		
		System.out.println(constante);

		
		//se intenta cambiar el valor
		
	//	constante = "nuevo valor";
		
	/* Se recibe el siguiente error al hacer el intento de asignar un nuevo valor
	 * 
	 * 
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The final local variable constante cannot be assigned. It must be blank and not using a compound assignment

	at AsignacionesItla/paqueteitla.Ejercicio_2.main(Ejercicio_2.java:14)

	 */
		
		
	}

}
