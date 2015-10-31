package com.jdlsoft.cajondesastre.model3;

public class Producto {
	private int id;
	private String nombre;
	private double precio;
	public Producto(){}
	public Producto(int id, String nombre, double precio){
		this.id = id;
		this.nombre =nombre;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
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
		Producto other = (Producto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio="
				+ precio + "]";
	}
}
