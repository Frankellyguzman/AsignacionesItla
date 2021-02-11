package paqueteitla_3;

public class Hombre extends Adolescente_m{

	Hombre() {

		this.nombre = "No especificado";
		this.apellido = "No especificado";
		this.edad = "No especificado";
		
	}

	Hombre(String nombre, String apellido, String edad) {

		super.nombre = nombre;
		super.apellido = apellido;
		super.edad = edad;

	}



	public void setCuidarhijos() {
		
		
		
		System.out.println("Cuido los ninos");
	}
	
	
	
	public void conducirauto() {
		
		
		System.out.println("Conduzo el auto");
	}
	

	
	
}
