package com.jdlsoft.taxis.model;

import java.util.Date;

public class DatosContacto {
	//Datos personales
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected Date nacimiento;
	protected String DNI;
	public String getNombre() {
		return nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public String getDNI() {
		return DNI;
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
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	@Override
	public String toString() {
		return "DatosContacto [nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", nacimiento=" + nacimiento
				+ ", DNI=" + DNI + "]";
	}
}
