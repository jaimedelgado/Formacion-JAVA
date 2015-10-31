package com.jdlsoft.geometria.model;

public class Punto {
	private double x;
	private double y;
	
	public Punto(){
		this.x= 0.0;
		this.y = 0.0;
	}
	
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distancia(Punto punto){
		return Math.sqrt(Math.pow(this.x-punto.x, 2) + Math.pow(this.y-punto.y, 2));
	}
	
	public void trasladar(double incrementoX, double incrementoY){
		this.x += incrementoX;
		this.y += incrementoY;
	}
	
}
