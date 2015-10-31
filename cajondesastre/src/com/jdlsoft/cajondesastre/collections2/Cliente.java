package com.jdlsoft.cajondesastre.collections2;

public class Cliente implements Comparable<Cliente> {
	private int id;
	private String nombre;
	private String NIF;
	
	public Cliente(){}
	public Cliente(int id, String nombre, String NIF){
		this.id=id;
		this.nombre=nombre;
		this.NIF=NIF;
	}
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getNIF() {
		return NIF;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", NIF=" + NIF
				+ "]";
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
	public int compareTo(Cliente c) {
		return this.nombre.compareTo(c.nombre);
	}
	
	
}
