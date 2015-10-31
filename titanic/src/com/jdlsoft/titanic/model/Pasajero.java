package com.jdlsoft.titanic.model;

import java.util.Date;

public class Pasajero {
	private int id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private double precioBillete;
	private String sexo; // H-hombre M-mujer
	private Date fechaNacimiento;
	private double peso;
	private double altura;
	private boolean religioso;
	
	public Pasajero(){
		
	}

	public Pasajero(int id, String nombre, String apellido1, String apellido2,
			double precioBillete, String sexo, double peso, double altura,
			boolean religioso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.precioBillete = precioBillete;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.religioso = religioso;
	}



	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public double getPrecioBillete() {
		return precioBillete;
	}

	public String getSexo() {
		return sexo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public boolean isReligioso() {
		return religioso;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public void setPrecioBillete(double precioBillete) {
		this.precioBillete = precioBillete;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setReligioso(boolean religioso) {
		this.religioso = religioso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pasajero other = (Pasajero) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "pasajero [id=" + id + ", nombre=" + nombre + ", apellido1="
				+ apellido1 + ", apellido2=" + apellido2 + ", precioBillete="
				+ precioBillete + ", sexo=" + sexo + ", fechaNacimiento="
				+ fechaNacimiento + ", peso=" + peso + ", altura=" + altura
				+ ", religioso=" + religioso + "]";
	}
	
	

}
