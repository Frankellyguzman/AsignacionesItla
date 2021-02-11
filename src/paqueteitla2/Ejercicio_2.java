package paqueteitla2;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c = new Cuenta("54321",1000);
		
		Cuenta cu=new Cuenta();
		
		c.transferencia(50, cu);

		
		
		//System.out.println(c.getCantidad());
	}
	
}


class Cuenta{
	
	String ncuenta;
	int total;
	
	Cuenta(String cuenta,int t){
		
		ncuenta=cuenta;
		
		total=t;
		
	}
	Cuenta(){
		
		ncuenta= "12345";
		total=500;
	}
	
	void ingreso(int cantidad) {

		total += cantidad;
		
	//	System.out.println("nuevo total " +total);
	}
	
	void reintegro(int cantidad) {
		
		total-= cantidad;
	}
	
	
	void transferencia(int cantidad,Object cuentadestino){
		
		total-=cantidad;
		
		System.out.println("Se ha realizado la transferencia");
		
				
	}
	
	void setCantidad(int cant) {
		
		total = cant;
		
	}
	
	int getCantidad() {
		
		
		return total;
	}
	

	
}