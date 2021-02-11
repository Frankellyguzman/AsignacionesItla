package paqueteitla;

public class ejemploFreidy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		consoladejuegos consola = new consoladejuegos("Play Station");
		
		
		consola.setMarca("Xbox");
		
		System.out.println(consola.getMarca());

	}

}


class consoladejuegos{
	
public  consoladejuegos(String marca){
	
	
	Marca = marca;
	
	
}

public void setMarca(String marca) {
	
	
	Marca = marca;
}
	

public String getMarca() {
	
	if(Marca == null) {
		
		return "La consola aun no tiene marca establecida";
	}
	
	return Marca;
	
}

	
	
	
	private String Marca= null;
}