package paqueteitla_3;

public class Nina extends humano{
	
	Nina() {

		this.nombre = "No especificado";
		this.apellido = "No especificado";
		this.edad = "No especificado";
		
	}

	Nina(String nombre, String apellido, String edad) {

		super.nombre = nombre;
		super.apellido = apellido;
		super.edad = edad;

	}


	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.nombre = nombre;
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return super.nombre;
	}

	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		
		super.apellido=apellido;		
	}

	@Override
	public String getEdad() {
		// TODO Auto-generated method stub
		return super.edad;
	}

	@Override
	public void setEdad(String edad) {
		// TODO Auto-generated method stub
		super.edad=edad;
	}

	public void jugar() {
		
		System.out.println("Jugar con princesas");
	}
	
	public void pasear() {
		
		System.out.println("Paseo por el parque");
		
	}
	
	public void saltar(){
		
		System.out.println("estoy saltando");
	}
	

	
	@Override
	public String quienSoy() {
		// TODO Auto-generated method stub
		return Valores.nina;
	}

}
