package com.jdlsoft.geometria.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jdlsoft.geometria.model.Punto;

public class PuntoTest {
	
	private Punto punto1;
	private Punto punto2;

	@Test
	public void distancia(){
		punto1 = new Punto(0.0,0.0);
		punto2 = new Punto(0.0,0.0);
		double distancia = punto1.distancia(punto2);
		assertEquals(0.0, distancia, 0.01);
		
		punto2 = new Punto(0.0, 10.0);
		distancia = punto1.distancia(punto2);
		assertEquals(10.0, distancia, 0.01);
		
		punto2 = new Punto(-20.0,-15.45);
		distancia = punto1.distancia(punto2);
		assertEquals(25.27, distancia, 0.01);

		punto1 = new Punto(100.0,-25.50);
		punto2 = new Punto(-45.20,-76.89);
		distancia = punto1.distancia(punto2);
		assertEquals(154.02, distancia, 0.01);
		
		//la distancia de un punto a si mismo...
		distancia = punto1.distancia(punto1);
		assertEquals(0.0, distancia, 0.01);
		
	}
}
