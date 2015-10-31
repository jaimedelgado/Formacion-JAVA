package com.jdlsoft.cajondesastre.collections;

public class Foo {
	private String nombre;
	
	public Foo(){}
	
	public Foo(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Foo other = (Foo) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
