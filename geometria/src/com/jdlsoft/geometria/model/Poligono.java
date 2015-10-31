package com.jdlsoft.geometria.model;

public abstract class Poligono implements Figura {

	protected Punto[] vertices;

	public Poligono() {

	}

	public Poligono(Punto[] vertices) {
		this.vertices = vertices;
	}

	@Override
	public void trasladar(double incrementoX, double incrementoY) {
		for (int i = 0; i < vertices.length ; i++){
			this.vertices[i].setX(this.vertices[i].getX() + incrementoX);
			this.vertices[i].setY(this.vertices[i].getY() + incrementoY);
		}

	}

	@Override
	public double getPerimetro() {
		double resultado =vertices.length*this.vertices[0].distancia(this.vertices[1]); 
		return resultado;
	}

	@Override
	public double getArea() {
		double calculo = 0;
		double[][] m = new double[2][2];
		
		for (int i = vertices.length-1; i > 0; i--){
			m[0][0] = vertices[i].getX();
			m[0][1] = vertices[i - 1].getX();
			m[1][0] = vertices[i].getY();
			m[1][1] = vertices[i - 1].getY();
			calculo = calculo + determinante(m);
		}
		
		m[0][0] = vertices[0].getX();
		m[0][1] = vertices[vertices.length-1].getX();
		m[1][0] = vertices[0].getY();
		m[1][1] = vertices[vertices.length-1].getY();
		
		calculo = calculo + determinante(m);
		
		
		return Math.abs(calculo / 2);
	}
	
	public static double determinante(double[][] matriz)
	{
	    double det;
	    if(matriz.length==2)
	    {
	        det=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
	        return det;
	    }
	    double suma=0;
	    for(int i=0; i<matriz.length; i++){
	    double[][] nm=new double[matriz.length-1][matriz.length-1];
	        for(int j=0; j<matriz.length; j++){
	            if(j!=i){
	                for(int k=1; k<matriz.length; k++){
	                int indice=-1;
	                if(j<i)
	                indice=j;
	                else if(j>i)
	                indice=j-1;
	                nm[indice][k-1]=matriz[j][k];
	                }
	            }
	        }
	        if(i%2==0)
	        suma+=matriz[i][0] * determinante(nm);
	        else
	        suma-=matriz[i][0] * determinante(nm);
	    }
	    return suma;
	}

}
