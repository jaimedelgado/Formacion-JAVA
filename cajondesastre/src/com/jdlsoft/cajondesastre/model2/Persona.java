package com.jdlsoft.cajondesastre.model2;

import java.io.Serializable;

public abstract class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String DNI;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String telefono;
	private String fax;
	private String email;
	
	public Persona(){
	}

	public Persona(String dNI, String nombre, String apellido1, String apellido2) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}
	
	
	
	public Persona(String nombre, String apellido1, String apellido2) {
		super();
		this.nombre =nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		
	}

	public String getDNI() {
		return DNI;
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

	public String getTelefono() {
		return telefono;
	}

	public String getFax() {
		return fax;
	}

	public String getEmail() {
		return email;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", apellido1="
				+ apellido1 + ", apellido2=" + apellido2 + ", telefono="
				+ telefono + ", fax=" + fax + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
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
		Persona other = (Persona) obj;
		if (DNI == null) {
			if (other.DNI != null)
				return false;
		} else if (!DNI.equals(other.DNI))
			return false;
		return true;
	}
}
