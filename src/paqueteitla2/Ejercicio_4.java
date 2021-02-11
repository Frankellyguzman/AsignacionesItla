package paqueteitla2;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Libro l = new Libro();
		
		l.prestamo("Matematicas");

		l.devolucion();
		l.prestamo("sociales");
		l.toString();

		
	}

}


class Libro{
	
	private String libreria, Libro;
	private boolean prestado=false;
	
	Libro(){
		
		libreria="Libreria ITLA";
		
		
	}
	
	Libro(String d){
		
		libreria=d;
	
	}
	
	
	
	void prestamo(String libro) {
		
		
		if(prestado) {
			
			System.out.println("Tiene un libro prestado, por favor realiza una devolucion en la "+libreria);		
			
		}else {
			
			
			Libro=libro;
			
			prestado=true;
			
			System.out.println("Usted a realizado un prestamo del libro " +Libro+ " en la " +libreria);
		}
	}
	
	void devolucion() {
		
		
		if(prestado) {
			
			prestado=false;
			
			System.out.println("El libro "+Libro+" ha sido devuelto a la "+ libreria);
			
		}else {
			
			System.out.println("no tiene "+Libro+" libro prestado para devolver en la" + libreria);
		}
		
		
	}

	public String getLibreria() {
		return libreria.toString();
	}

	public void setLibreria(String libreria) {
		this.libreria = libreria;
	}

	public String getLibro() {
		return Libro;
	}

	public void setLibro(String libro) {
		Libro = libro;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public String toString() {
		
		return Libro;
	}
	
}