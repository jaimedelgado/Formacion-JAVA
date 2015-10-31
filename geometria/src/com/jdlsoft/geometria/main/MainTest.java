package com.jdlsoft.geometria.main;

import com.jdlsoft.geometria.model.Figura;
import com.jdlsoft.geometria.model.Poligono;
import com.jdlsoft.geometria.model.Punto;
import com.jdlsoft.geometria.model.Triangulo;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto[] vertices = new Punto[3];
		vertices[0] = new Punto(2,5);
		vertices[1] = new Punto(5,2);
		vertices[2] = new Punto(5,5);
		Figura f = new Triangulo(vertices[0], vertices[1], vertices[2]);
		System.out.println(f.getArea());
	}

}
