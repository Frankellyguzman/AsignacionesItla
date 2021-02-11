package paqueteitla_3;

public class Adolescente_f extends Nina{

	Adolescente_f() {

		this.nombre = "No especificado";
		this.apellido = "No especificado";
		this.edad = "No especificado";
		
	}

	Adolescente_f(String nombre, String apellido, String edad) {

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

public void pintarunas() {
	
	System.out.println("Me pinto las unas");
}

public void vernovelas() {
	
	System.out.println("veo novelas");
}
}
