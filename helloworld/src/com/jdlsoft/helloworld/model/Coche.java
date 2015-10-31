package com.jdlsoft.helloworld.model;

import java.util.Date;

public class Coche {
	private int id;
	private String marca;
	private String color;
	private String matricula;
	private String tipoMotor;
	private boolean automatico;
	private Date fechaMatriculacion;
	private double precio;
	private String observaciones;
	
	public Coche(){
		
	}
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(String tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	public boolean isAutomatico() {
		return automatico;
	}
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	public Date getFechaMatriculacion() {
		return fechaMatriculacion;
	}
	public void setFechaMatriculacion(Date fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
}
