package com.jdlsoft.cajondesastre.model2;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private boolean activo;
	
	public Cliente(){}
	
	public Cliente(boolean activo){
		this.activo=activo;
	}
	
	public Cliente(String nombre, String apellido1, String apellido2, boolean activo){
		super(nombre, apellido1, apellido2);
		this.activo = activo;
	}
	
	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (activo ? 1231 : 1237);
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
		if (activo != other.activo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [activo=" + activo + "]";
	}

	
	
}
