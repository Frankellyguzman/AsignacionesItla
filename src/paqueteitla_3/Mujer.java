package paqueteitla_3;

public class Mujer extends Adolescente_f{

	
	Mujer() {

		this.nombre = "No especificado";
		this.apellido = "No especificado";
		this.edad = "No especificado";
		
	}

	Mujer(String nombre, String apellido, String edad) {

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
