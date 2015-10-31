package com.jdlsoft.helloworld.model;
//POJO (Plain old java object), Entity Class, bean
public class Television {
	// Atributos, Campos, Variables de instancia, Propiedades
	private int id;
	private String marca;
	private String modelo;
	private int alto;
	private int ancho;
	private int pulgadas;
	private String numeroSerie;
	private String tipo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
