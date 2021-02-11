package paqueteitla_3;

public class Adulto extends Hombre{

	
	Adulto() {

		this.nombre = "No especificado";
		this.apellido = "No especificado";
		this.edad = "No especificado";
		
	}

	Adulto(String nombre, String apellido, String edad) {

		super.nombre = nombre;
		super.apellido = apellido;
		super.edad = edad;

	}
	public void cuidarnietos(){
		
		System.out.println("Cuido a los nietos");
	}
}
