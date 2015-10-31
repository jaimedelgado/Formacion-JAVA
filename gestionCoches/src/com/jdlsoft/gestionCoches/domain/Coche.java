package com.jdlsoft.gestionCoches.domain;

import java.util.Date;


public class Coche {

	private Date fechaMatriculacion;
	private String numeroBastidor;
	private String matricula;  // Lo utilizamos como número de identificación del coche ("id")
	private String marca;
	private String modelo;
	private int numeroPuertas;
	private String tipoMotor; // Diesel, gasolina, híbrido
	private boolean siniestrado;
	
	
	
	public Coche(){
		
	}

	public Coche(Date fechaMatriculacion, String numeroBastidor,
			String matricula, String marca, String modelo, int numeroPuertas,
			String tipoMotor, boolean siniestrado) {
		super();
		this.fechaMatriculacion = fechaMatriculacion;
		this.numeroBastidor = numeroBastidor;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPuertas = numeroPuertas;
		this.tipoMotor = tipoMotor;
		this.siniestrado = siniestrado;
	}

	public String getNumeroBastidor() {
		return numeroBastidor;
	}


	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
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


	public int getNumeroPuertas() {
		return numeroPuertas;
	}


	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}


	public String getTipoMotor() {
		return tipoMotor;
	}


	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}


	public boolean isSiniestrado() {
		return siniestrado;
	}


	public void setSiniestrado(boolean siniestrado) {
		this.siniestrado = siniestrado;
	}


	public Date getFechaMatriculacion() {
		return fechaMatriculacion;
	}


	public void setFechaMatriculacion(Date fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}


	@Override
	public String toString() {
		return "Coche [numeroBastidor=" + numeroBastidor + ", matricula="
				+ matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", numeroPuertas=" + numeroPuertas + ", tipoMotor="
				+ tipoMotor + ", siniestrado=" + siniestrado
				+ ", fechaMatriculacion=" + fechaMatriculacion + "]";
	}
	
	
}
