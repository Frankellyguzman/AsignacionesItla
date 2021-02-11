package paqueteitla2;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		persona p1 = new persona("Frankelly", "Guzman", 20, false, "402-1382389-6");
		persona p2 = new persona("migel", "Guzman", 20, false, "402-1382389-6");
		persona p3 = new persona("Frank", "Guzman", 20, false, "402-1382389-6");
		persona p4 = new persona("Francis", "Guzman", 20, false, "402-1382389-6");
		persona p5 = new persona("Francil", "Guzman", 20, false, "402-1382389-6");
		persona p6 = new persona("Fraly", "Guzman", 20, false, "402-1382389-6");
		persona p7 = new persona("kelly", "Guzman", 20, false, "402-1382389-6");
		p1.profesion("chofer");
		p2.profesion("constructor");
		p3.profesion("soldador");
		p4.profesion("chofer");
		p5.profesion("constructor");
		p6.profesion("soldador");
		p7.profesion("chofer");
	
	}

}

class persona {

	persona(String name, String lname, int age, boolean married, String id) {

		nombre = name;
		apellido = lname;
		numeroDocumentoIdentidad = id;
		edad = age;
		casado = married;

//		("Hola "+name+" Pof favor elije una profesion\n1.Programador");

	}

	
	//metodo que decide que profesion
	void profesion(String prof) {

		if (prof == "chofer") {

			conducir();
		} else if (prof == "constructor") {

			construir();

		} else if (prof == "soldador") {

			soldar();
		} else {

			System.out.println("La profesion no ha sido especificada correctamente");
		}

	}
//Metodos profesiones
	void conducir() {

		System.out.println("Conducir");

	}

	void soldar() {

		System.out.println("Soldar");
	}

	void construir() {

		System.out.println("Construir");
	}

	// Metodos getters
	String getName() {

		return nombre;

	}

	String getApellido() {

		return apellido;
	}

	String getNumeroDocumentoIdentidad() {

		return numeroDocumentoIdentidad;
	}

	int getEdad() {

		return edad;
	}

	boolean getCasado() {

		return casado;

	}
	// Metodos Setters

	void setName(String name) {

		nombre = name;

	}

	void setLastname(String lname) {

		apellido = lname;
	}

	void setnumeroDocumentoIdentidad(String id) {
		
		numeroDocumentoIdentidad =id;
	}

	void setEdad(int age) {
		
		edad=age;
	}
	
	void setCasado(boolean married) {
		
		casado=married;
	}
	
	//Atributos de clase
	public String nombre, apellido, numeroDocumentoIdentidad ;

	public int edad;

	public boolean casado;

}