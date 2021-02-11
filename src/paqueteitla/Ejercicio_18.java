package paqueteitla;

public class Ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 18.	 Determinar cuántos elementos de la serie de Fibonacci se encuentran entre 1000 y 2000. 

		int suma = 0,cont=0,i = 0, ii = 1, temp, limite = 2000;

		System.out.println(i);
	//	cont=cont+1;
		System.out.println(ii);
		
		suma=suma+ii;

		while (i + ii < limite) {

			temp = i;
			i = ii;
			ii = temp + i;
			//cont++;

			System.out.println(ii);
			
			suma= suma+ii;
			
			if(ii>1000) {
				
				
				cont++;
				
				
			}
			
			
			
			//System.out.println(cont);
		}
		
		System.out.println("\nCantidad de elementos"
				+ "es : " + cont);

	}

}
