package com.jdlsoft.cajondesastre.model4;

public abstract class Humano {
	protected int id;
	protected int peso; //gramos
	protected int altura; //centimetros
	public Humano(){}
	public Humano(int id, int peso, int altura) {
		this.id=id;
		this.peso=peso;
		this.altura=altura;
	}
	public int getId() {
		return id;
	}
	public int getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void setAltura(int altura) {
		this.altura = altura;
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
		Humano other = (Humano) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Humano [id=" + id + ", peso=" + peso + ", altura=" + altura
				+ "]";
	}
	
	
}
