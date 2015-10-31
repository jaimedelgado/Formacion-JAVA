package com.jdlsoft.cajondesastre.model2;

import java.io.Serializable;

public class Proveedor extends Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String tipo;
	
	public Proveedor(){}

	public Proveedor(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	public Proveedor(String nombre, String apellido1, String apellido2, String tipo){
		super(nombre, apellido1, apellido2);
		this.tipo=tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proveedor other = (Proveedor) obj;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Proveedor [tipo=" + tipo + "]";
	}
	
	
	
}
