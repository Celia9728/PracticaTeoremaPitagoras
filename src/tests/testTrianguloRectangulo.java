package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	 static TrianguloRectangulo trianguloRectangulo1; 
	 static TrianguloRectangulo trianguloRectangulo2; 
     @BeforeAll 
     static void setup() { 
    	 trianguloRectangulo1 = new TrianguloRectangulo(); 
    	 trianguloRectangulo2 = new TrianguloRectangulo(3,4); 
     } 
	
	@Test
	void testAreaConstructorDefecto() {
	    double areaObtenido = trianguloRectangulo1.area(); 
        double areaEsperado = 0.5; 
        assertEquals(areaEsperado, areaObtenido);
	}

	@Test
	void testPerimetroConstructorDefecto() {
		 double perimetroObtenido = Math.round(trianguloRectangulo1.perimetro() * 100) / 100; 
         double perimetroEsperado = Math.round(3.414213562373095 * 100) / 100; 
         assertEquals(perimetroEsperado, perimetroObtenido);
	}

	@Test
	void testHipotenusaConstructorDefecto() {
		double areaObtenida = trianguloRectangulo1.hipotenusa(); 
        double areaEsperada = Math.round(1.4142135623730951 * 100) / 100; 
        assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void testArea() {
	    double areaObtenido = Math.round(trianguloRectangulo2.area() * 100) / 100; 
        double areaEsperado = Math.round(6 * 100) / 100; 
        assertEquals(areaEsperado, areaObtenido);
	}

	@Test
	void testPerimetro() {
		 double perimetroObtenido = Math.round( trianguloRectangulo2.perimetro() * 100) / 100 ; 
         double perimetroEsperado =  Math.round(12 * 100) / 100; 
         assertEquals(perimetroEsperado, perimetroObtenido);
	}

	@Test
	void testHipotenusa() {
		double areaObtenida = trianguloRectangulo2.hipotenusa(); 
        double areaEsperada = Math.round(5.83 * 100) / 100; 
        assertEquals(areaEsperada, areaObtenida); 
	}
	
	@Test 
    void testExcepcion() { 
        Exception excepcion = assertThrows(IllegalArgumentException.class, () -> new 
        TrianguloRectangulo(-1, 5)); 
        String mensajeEsperado = "No puede ser menor o igual a 0"; 
        String mensajeObtenido = excepcion.getMessage(); 
        assertEquals(mensajeEsperado, mensajeObtenido); 
}
	

}
