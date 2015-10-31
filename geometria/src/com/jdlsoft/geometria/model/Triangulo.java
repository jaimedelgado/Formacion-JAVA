package com.jdlsoft.geometria.model;

public class Triangulo extends Poligono{
	public Triangulo(Punto v1, Punto v2, Punto v3){
		this.vertices = new Punto[3];
		this.vertices[0] = v1;
		this.vertices[1] = v2;
		this.vertices[2] = v3;
	}

	@Override
	public double getPerimetro() {
		double resultado=0.0;
		for ( int i = 0; i < vertices.length - 1 ; i++){
			resultado= resultado + this.vertices[i].distancia(vertices[i+1]);
		}
		return resultado;
	}

	public String getTipo (){
		double distancia1 = this.vertices[0].distancia(this.vertices[1]);
		double distancia2 = this.vertices[1].distancia(this.vertices[2]);
		double distancia3 = this.vertices[2].distancia(this.vertices[0]);
		
		if(distancia1 == distancia2 && distancia2 == distancia3){
			return "equilatero";
		}else if(distancia1==distancia2 || distancia2==distancia3){
			return "isosceles";
		}else{
			return "escaleno";
		}
		
	}
}
