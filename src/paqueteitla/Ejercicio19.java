package paqueteitla;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 19.	 Leer un número y calcularle su factorial. 
		
		int n ;
		String r="";

		n=Integer.parseInt(JOptionPane.showInputDialog(" Factorial de numero: "));
		// System.out.println(factorial(n));
		JOptionPane.showMessageDialog(null, "Factorial de es igual " +(factorial(n)));
		}

		public static int factorial(int n) {
		int resultado = 1;
		for (int i = 1; i <= n; i++) {
		resultado *= i;
		}
		return resultado;
		}
		

	

}
