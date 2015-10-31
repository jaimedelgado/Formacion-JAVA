package com.jdlsoft.geometria.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jdlsoft.geometria.model.Circulo;
import com.jdlsoft.geometria.model.Punto;

public class CirculoTest {

	private Circulo circulo;
	
	@Test
	public void getArea(){
		circulo = new Circulo(new Punto(0.0,0.0), 10.0);
		double area = circulo.getArea();
		assertEquals(314.16, area, 0.10);
	}
	
	@Test
	public void getPerimetro(){
		circulo = new Circulo(new Punto(0.0,0.0), 10.0);
		double perimetro = circulo.getPerimetro();
		assertEquals(62.83, perimetro, 0.10);
	}
	
	@Test
	public void trasladar(){
		
		double incrementoX = 10.0;
		double incrementoY = -10.0;
		Punto centro = new Punto(0.0,0.0);
		
		circulo = new Circulo(centro, 10.0);
		circulo.trasladar(incrementoX, incrementoY);
		
		assertEquals(10.0, circulo.getCentro().getX(), 0.1);
		assertEquals(-10.0, circulo.getCentro().getY(), 0.1);
		
	}
}
