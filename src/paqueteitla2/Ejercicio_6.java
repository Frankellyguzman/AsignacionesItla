package paqueteitla2;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complejo c1 = new Complejo(1.0, 1.0);
		Complejo c2 = new Complejo(2.0, 2.0);
		Complejo c3;

		c3 = c1.sum(c2);

		c3 = c1.res(c2);

		c3 = c1.div(c2);

		c3 = c1.mult(c2);

	}

}

class Complejo {
	private double nreal;
	private double nimg;

	public Complejo() {

		nreal = 1;

		nimg = 1;

	}

	public Complejo(double nreal, double nimg) {
		this.nreal = nreal;
		this.nimg = nimg;
	}

	// METODOS GETTER
	public double getNimg() {
		return nimg;
	}

	public double getNreal() {
		return nreal;
	}

	// METODOS GETTER

	public void setNreal(double nreal) {
		this.nreal = nreal;
	}

	public void setNimg(double nimg) {
		this.nimg = nimg;
	}

	public String toString() {
		return "(" + nreal + ", " + nimg + ")";
	}

	public Complejo sum(Complejo complex) {
		Complejo op = new Complejo();
		op.nreal = nreal + complex.nreal;
		op.nimg = nimg + complex.nimg;
	
		System.out.println( " El resultado de la operacion suma es igual a " + op);
		return op;
		

	}

	public Complejo res(Complejo complex) {
		Complejo op = new Complejo();
		op.nreal = nreal - complex.nreal;
		op.nimg = nimg - complex.nimg;
		System.out.println( " El resultado de la operacion Resta es igual a " + op);
		return op;
	}

	public Complejo mult(Complejo complex) {
		Complejo op = new Complejo();
		op.nreal = nreal * complex.nreal - nimg * complex.nimg;
		op.nimg = nreal * complex.nimg + nimg * complex.nreal;
		System.out.println( " El resultado de la operacion Multiplicacion es igual a " + op);
		return op;
	}

	public Complejo multiplicar(double n) {
		Complejo op = new Complejo();
		op.nreal = nreal * n;
		op.nimg = nimg * n;
		return op;
	}

	public Complejo div(Complejo complex) {
		Complejo op = new Complejo();
		op.nreal = (nreal * complex.nreal + nimg * complex.nimg)
				/ (complex.nreal * complex.nreal + complex.nimg * complex.nimg);
		op.nimg = (nimg * complex.nreal - nreal * complex.nimg)
				/ (complex.nreal * complex.nreal + complex.nimg * complex.nimg);
		
		System.out.println( " El resultado de la operacion Division es igual a " + op + " En valores Decimales");
		return op;
	}

}