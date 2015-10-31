package com.jdlsoft.cajondesastre.model;

public class Cliente {
	private int id;
	private String NIF;
	private String nombre;
	private int numeroTrabajadores;
	private Direccion direccion;
	private boolean extranjero;
	private boolean moroso;
	
	public Cliente(){
		super();
	}
	public Cliente(int id, String NIF, String nombre, boolean moroso){
		super();
		this.id=id; 
		this.NIF=NIF; 
		this.nombre=nombre; 
		this.moroso=moroso;
	}
	
	public Cliente(int id, String NIF, String nombre, int numeroTrabajadores, Direccion direccion, boolean extranjero, boolean moroso) {
		super();
		this.id = id;
		NIF = NIF;
		this.nombre = nombre;
		this.numeroTrabajadores = numeroTrabajadores;
		this.direccion = direccion;
		this.extranjero = extranjero;
		this.moroso = moroso;
	}
	
	public Cliente(Cliente cliente){
		
	}
	
	public Cliente(int id, String nombre, String calle, String codigoPostal){
		this.id=id;
		this.nombre=nombre;
		this.direccion = new Direccion();
		this.direccion.setDireccion(calle);
		this.direccion.setCodigoPostal(codigoPostal);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroTrabajadores() {
		return numeroTrabajadores;
	}

	public void setNumeroTrabajadores(int numeroTrabajadores) {
		this.numeroTrabajadores = numeroTrabajadores;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public boolean isExtranjero() {
		return extranjero;
	}

	public void setExtranjero(boolean extranjero) {
		this.extranjero = extranjero;
	}

	public boolean isMoroso() {
		return moroso;
	}

	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", NIF=" + NIF + ", nombre=" + nombre
				+ ", numeroTrabajadores=" + numeroTrabajadores + ", direccion="
				+ direccion + ", extranjero=" + extranjero + ", moroso="
				+ moroso + "]";
	}
	
	
}
