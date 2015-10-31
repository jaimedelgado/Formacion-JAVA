package com.jdlsoft.facturasj2ee.model;

public class Cliente {
	private int id;
	private String nombre;
	private String telefono;
	private String cIF;
	
	public Cliente(){
		
	}

	public Cliente(int id, String nombre, String telefono, String cIF) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.cIF = cIF;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getcIF() {
		return cIF;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setcIF(String cIF) {
		this.cIF = cIF;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", telefono="
				+ telefono + ", cIF=" + cIF + "]";
	}
	
	
}
