package com.jdlsoft.taxis.model;

public class Direccion {
	//Direccion
	protected String calle;
	public String getCalle() {
		return calle;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	protected String codigoPostal;
	protected String poblacion;
	protected String provincia;
	protected String pais;
}
