package paqueteitla_3;

public abstract class humano implements Valores{

	humano() {

		this.nombre = "No especificado";
		this.apellido = "No especificado";
		this.edad = "No especificado";
		
	}

	humano(String nombre, String apellido, String edad) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;

	}


	public abstract String getNombre();

	public abstract  void setNombre(String nombre);

	public abstract String getApellido();

	public abstract void setApellido(String apellido);

	public abstract String getEdad();

	public abstract void setEdad(String edad);

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		sexo = sexo;
	}

	
	// Settings familiar members
	
	public void setHermana(Nina hermana) {
		
		System.out.println("Mi hermana es" + hermana.getNombre());
		
	}
	
	public void setHermano(Nino hermano) {
		
		System.out.println("Mi hermano es" + hermano.getNombre());
		
	}
	public void setPadre(Hombre hombre) {
		
		System.out.println("Mi padre es" + hombre.getNombre());
		
	}
	
	public void setMadre(Mujer mujer) {
		
		System.out.println("Mi madre es" + mujer.getNombre());
		
	}
	
	public void setAbuelo(Adulto adulto) {
		
		
		System.out.println("Mi abuelo es "+ adulto.getNombre());
	}
	
	public void setTio(Hombre hombre) {
		
		System.out.println("Mi Tio es "+ hombre.getNombre());
	}

	public void setTia(Mujer mujer) {
		
		System.out.println("Mi Tia es es "+ mujer.getNombre());
	}
	

	public void setAbuela(Adulta adulta) {
		
		System.out.println("Mi abuela es "+ adulta.getNombre());
	}
	
	public void setHijo(Nino hijo) {
		
	System.out.println("Mi Hija es "+ hijo.getNombre());

	}
	
	public void setHija(Nina hija) {
		
		System.out.println("Mi Hija es "+ hija.getNombre());
		
	}
	
	public void setHija(Adolescente_f hija) {
		
		System.out.println("Mi Hija es "+ hija.getNombre());
		
		
	}
	
	public void setHijo(Adolescente_m hijo) {
		
		
		System.out.println("Mi Hija es "+ hijo.getNombre());
		
	}
	
	public void setNieto(Nino nieto) {
		
		
		System.out.println("Mi Hija es "+ nieto.getNombre());
		
	}
	
	
	public void setNieta(Nina nieta) {
		
		
		System.out.println("Mi Hija es "+ nieta.getNombre());
		
	}
	

	
	
	//Atributos personales
	
	
	
String nombre, apellido, edad, sexo, padre, madre, tio, tia, abuelo, abuela, hermano, hermana;
}
