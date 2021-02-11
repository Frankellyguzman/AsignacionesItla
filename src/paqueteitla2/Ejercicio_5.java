package paqueteitla2;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
        Fraccion fra1 = new Fraccion(1, 4);
        Fraccion fra2 = new Fraccion(3, 1); 

        // operaciones aritméticas con esas fracciones
        Fraccion suma = fra1.multiplicar(fra2);
        
        System.out.println("El resultado de la operacion " +fra1+" + " +fra2+" Es igual a " +suma );
       
	}

}


 class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if(denominador==0){
            denominador = 1;
        }
        this.denominador = denominador;
      
    }

    public Fraccion(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }
    
    // Conversion de datos 
    
    public String toString() {
        return numerador + "/" + denominador;
    }    
    
// METODOS GETTERS
    public int getdenominadorominador() {
        return denominador;
    }

    public int getnumeradorerador() {
        return numerador;
    }
    
    // METODOS SETTERS 
    public void setdenominadorominador(int denominador) {
        this.denominador = denominador;
    }

    public void setnumeradorerador(int numerador) {
        this.numerador = numerador;
    }
    
    // OPERACIONES

    // METODO SUMA 
    public Fraccion sumar(Fraccion frac) {
        Fraccion operacion = new Fraccion();
        operacion.numerador = this.numerador * frac.denominador + this.denominador * frac.numerador;
        operacion.denominador = this.denominador * frac.denominador;
                                              
        return operacion;
    }
   
    //METODO RESTA
    public Fraccion restar(Fraccion frac) {
        Fraccion operacion = new Fraccion();
        operacion.numerador = this.numerador * frac.denominador - this.denominador * frac.numerador;
        operacion.denominador = this.denominador * frac.denominador;
        return operacion;
    }
   
    // METODO MULTIPLICACION
    public Fraccion multiplicar(Fraccion frac) {
        Fraccion operacion = new Fraccion();
        operacion.numerador = this.numerador * frac.numerador;
        operacion.denominador = this.denominador * frac.denominador;
        return operacion;
    }

    //METODO DIVISION
    public Fraccion dividir(Fraccion frac) {
        Fraccion operacion = new Fraccion();
        operacion.numerador = this.numerador * frac.denominador;
        operacion.denominador = this.denominador * frac.numerador;
        return operacion;
    }


} 