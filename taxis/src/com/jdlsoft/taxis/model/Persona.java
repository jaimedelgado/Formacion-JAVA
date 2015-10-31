package com.jdlsoft.taxis.model;


public abstract class Persona {
	protected DatosContacto datosContacto;
	protected Direccion direccion;
	//Contacto
	protected String email;
	protected String telefono;
	protected String movil;
	
	public Persona(){
		
	}
	
	public Persona(DatosContacto datosContacto, Direccion direccion,
			String email, String telefono, String movil) {
		super();
		this.datosContacto = datosContacto;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.movil = movil;
	}

	public String getEmail() {
		return email;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getMovil() {
		return movil;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}

	@Override
	public String toString() {
		return "Persona [datosContacto=" + datosContacto + ", direccion="
				+ direccion + ", email=" + email + ", telefono=" + telefono
				+ ", movil=" + movil + "]";
	}

}
