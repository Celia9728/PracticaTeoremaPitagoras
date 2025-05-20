package clases;

public class TrianguloRectangulo {

	double a;
	double b;
	double c;
	
	/**
	 * Constructor por defecto que pone los valores de los catetos en 1.
	 */
	public TrianguloRectangulo() { 
		  this.a = 1; 
		  this.b = 1; 
		  this.c = hipotenusa();
	} 
	
	/**
	 * Constructor donde se le pasa por parametro los 2 catetos y la hipotenusa se calcula dentro.
	 * Tambien puede lanzar una excepcion en caso de alguno de los catetos sea menor o igual a 0.
	 * @param a cateto 1
	 * @param b cateto 2
	 * @throws IllegalArgumentException
	 */
	public TrianguloRectangulo(double a, double b)  throws IllegalArgumentException{ 
		  if(a <= 0 || b <= 0) {
			  throw new IllegalArgumentException("No puede ser menor o igual a 0");
		  } else {
			  this.a = a; 
			  this.b = b; 
			  this.c = hipotenusa();
		  }
	} 
	
	/**
	 * Función para calcular el area del triangulo rectangulo.
	 * @return double
	 */
	public double area () {
		double area = (this.a * this.b) / 2;
		return area;
	}
	
	/**
	 * Función para calcular la hipotenusa del triangulo rectangulo.
	 * @return double
	 */
	public double hipotenusa() {
		double primerPaso = (this.a * this.a) + (this.b * this.b);
		double resultado = Math.sqrt(primerPaso);
		double redondeado = Math.round(resultado * 100) / 100;
		return redondeado;
	}
	
	/**
	 * Función para calcular el perimetro del triangulo rectangulo.
	 * @return double
	 */
	public double perimetro() {
		return (a + b + hipotenusa());
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	@Override
	public String toString() {
		String mensaje = "";
		mensaje += "Cateto a: " + this.a;
		mensaje += "Cateto b: " + this.b;
		mensaje += "Hipotenusa: " + this.c;
		return mensaje;
	}
}
