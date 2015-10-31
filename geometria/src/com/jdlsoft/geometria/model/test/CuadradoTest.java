package com.jdlsoft.geometria.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jdlsoft.geometria.model.Cuadrado;
import com.jdlsoft.geometria.model.Punto;


public class CuadradoTest {
	
	Cuadrado cuadrado;

	@Test
	public void getArea() {
		cuadrado = new Cuadrado(new Punto(0.0,0.0), new Punto(0.0,10.0));
		double area = cuadrado.getArea();
		assertEquals(100.0, area, 0.1);
	}
	
	@Test
	public void getPerimetro(){
		cuadrado = new Cuadrado(new Punto(0.0,0.0), new Punto(0.0,10.0));
		double perimetro = cuadrado.getPerimetro();
		assertEquals(40.0, perimetro, 0.1);
	}
	
	//TODO implementar hashCode() & equals()

}
