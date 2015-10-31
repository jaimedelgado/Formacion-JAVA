package com.jdlsoft.geometria.model;

public class Cuadrado extends Poligono {

	public Cuadrado(Punto v1, Punto v2) {
		this.vertices = new Punto[4];
		this.vertices[0] = v1;
		this.vertices[1] = v2;
		this.vertices[2] = new Punto(v1.getX()+v1.distancia(v2), v1.getY()+v1.distancia(v2));
		this.vertices[3] = new Punto(v2.getX()+v2.distancia(v1), v2.getY()+v2.distancia(v1));
	}

	@Override
	public double getPerimetro() {
		return this.vertices[0].distancia(this.vertices[1])*4;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.vertices[0].distancia(this.vertices[1]), 2);
	}

}
