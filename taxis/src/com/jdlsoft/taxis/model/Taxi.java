package com.jdlsoft.taxis.model;

import java.util.List;


public class Taxi {
	private String matricula;
	private String marca;
	private String modelo;
	private double kilometros;
	private int plazas;
	private List<Carrera> carreras;
	
	public Taxi(){
		
	}
	
	public Taxi(String matricula, String marca, String modelo, double kilometros, int plazas, List<Carrera>carreras){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.kilometros = kilometros;
		this.plazas = plazas;		
		this.carreras = carreras;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public double getKilometros() {
		return kilometros;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}
	@Override
	public String toString() {
		return "Taxi [matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + ", kilometros=" + kilometros
				+ ", plazas=" + plazas + ", carreras=" + carreras + "]";
	}

}
