package paqueteitla2;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador c = new Contador(-25);

		c.incrementar(25);

		System.out.println(c.getContador());

	}

}

class Contador {

	int contador;

	// Contructor por defecto
	Contador() {

		contador = 0;

	}

//Constructor con parametros
	Contador(int cant) {

		contador = cant;
	}

	void incrementar() {

		contador++;

	}

	void decrementar() {

		contador--;

	}


	void incrementar(int cant) {
		
		
		contador += cant;
	}
	
	void decrementar(int cant) {
		
		contador-= cant;
	}
	
	int getContador() {

		return contador;
	}

	void setContador(int cant) {

		contador = cant;

	}
}