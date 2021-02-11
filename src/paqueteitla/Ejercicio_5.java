package paqueteitla;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5.	Adjuntar comentario de una y de varias líneas un su código.  Imprimir la fecha y hora del sistema. 
		
		
		//Instanciamos las clases que necesitaremos 
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy:HH:mm:ss");

		LocalDateTime ahora= LocalDateTime.now();
		
		
		/*Realizamos la impresion
		 * con la hora y fecha exactas en las que 
		 * se ejecuta el programa
		 */
		
		
		System.out.println(formato.format(ahora));
		

	}



}
