package com.jdlsoft.geometria.model;

public class Circulo implements Figura {

	private Punto centro;
	private double radio;
	
	public Circulo () {
		this.radio = 0.0;
		this.centro = new Punto (0.0, 0.0);
	}
	
	public Circulo (Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}
	
	public Circulo (double x, double y, double radio) {
		this.centro = new Punto (x, y);
		this.radio = radio;
	}
	
	
	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	
	@Override
	public void trasladar(double incrementoX, double incrementoY) {
		this.centro.setX(this.centro.getX() + incrementoX);
		this.centro.setY(this.centro.getY() + incrementoY);
	}

	@Override
	public double getPerimetro() {
		
		return 2*Math.PI*this.radio;
	}

	@Override
	public double getArea() {
		return Math.PI*Math.pow(this.radio, 2);
	}

}
