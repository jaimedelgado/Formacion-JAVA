package com.jdlsoft.facturacion.business.model;

public class Cliente {
	private int id;
	private String CIF;
	private String nombre;
	
	public Cliente(){
		
	}
	public int getId() {
		return id;
	}
	public String getCIF() {
		return CIF;
	}
	public String getNombre() {
		return nombre;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Cliente(int id, String cIF, String nombre) {
		super();
		this.id = id;
		CIF = cIF;
		this.nombre = nombre;
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
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", CIF=" + CIF + ", nombre=" + nombre
				+ "]";
	}
}
