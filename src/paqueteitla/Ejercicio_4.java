package paqueteitla;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4.	Declarar un float con valor=10152466.25. Declara un byte que es igual a 5 + el float. 
		
		float f = 10152466.25f ;
		
		byte b= (byte) (5+f);
		
		//Se pierde informacion al realizar el casting
		
		System.out.println(b);

	}
}
