package paqueteitla;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*14.	Pedir 15 números y escribir la suma total.  Usando solo uno de los bucles mostrados en clase*/
		
		int i;
		int ii=0;
		int cont=0;
		
		
		do {
		
		System.out.println("Introduzca un numero");
		Scanner s = new Scanner(System.in);
		 i = s.nextInt();
		 
		 ii=ii+i;
		
		 
		 cont++;
		}
			while(cont<15);
		
		System.out.println("Programa terminado,\nla suma de todos los numeros introducidos es igual a:\n"
				+ ii);
		
}
}
