package paqueteitla;
import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 12.	Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo
		
		int i=1;

		while(i>=0) {
			
			System.out.println("Introduzca un numero");
			Scanner s = new Scanner(System.in);
			i = s.nextInt();
			
			
			System.out.println(Math.pow(i, 2));
			
			
		}
		
		System.out.println("Programa terminado");
	}

}