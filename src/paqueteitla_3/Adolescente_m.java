package paqueteitla_3;

public class Adolescente_m extends Nino {

	
	Adolescente_m() {

		this.nombre = "No especificado";
		this.apellido = "No especificado";
		this.edad = "No especificado";
		
	}

	Adolescente_m(String nombre, String apellido, String edad) {

		super.nombre = nombre;
		super.apellido = apellido;
		super.edad = edad;

	}
	
public void estudiar(){
	
	
	System.out.println("Estoy estudianto");
	
}


public void trabajar() {
	
	System.out.println("Estoy trabajando");
}

public void jugar() {
	
	System.out.println("juego video juegos");
}

public void verdeportes() {
	
	System.out.println("veo el juego de basket");
}


}
