package paqueteitla;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//13.	Pedir números hasta que se teclee un 0, 
		//mostrar la suma de todos los números introducidos. Usando solo uno de los bucles mostrados en clase
		int i;
		int ii=0;
		
		
		do {
		
		System.out.println("Introduzca un numero");
		Scanner s = new Scanner(System.in);
		 i = s.nextInt();
		 
		 ii=ii+i;
		
		}
			while(i!=0);
		
		System.out.println("Programa terminado,\n1la suma de todos los numeros introducidos es igual a:\n"
				+ ii);
	}

}
