package paqueteitla_3;

public class Adulta extends Mujer{
	
	Adulta() {

		this.nombre = "No especificado";
		this.apellido = "No especificado";
		this.edad = "No especificado";
		
	}

	Adulta(String nombre, String apellido, String edad) {

		super.nombre = nombre;
		super.apellido = apellido;
		super.edad = edad;

	}
	
	public void cuidarnietos(){
		
		System.out.println("Cuido a los nietos");
	}

}
