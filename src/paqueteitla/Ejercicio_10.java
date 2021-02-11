package paqueteitla;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10.	Pedir dos números y decir si son iguales o no.

		System.out.println("Introduce un numero y presiona enter");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		System.out.println("Excelente, ahora introduce otro numero y presiona enter");
		s = new Scanner(System.in);
		int num2 = s.nextInt();
		
		if(num1==num2) {
			System.out.println("Los numeros son iguales");
		}else {System.out.println("Los numeros no son iguales");}

}
	
}
