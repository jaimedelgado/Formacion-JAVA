package com.jdlsoft.taxis.model;

import java.util.List;

public class Taxista extends Persona {
	private String NTL;
	private List<Carrera> carreras;
	
	public Taxista(){
		
	}
	

	public Taxista(String NTL, List<Carrera> carreras, DatosContacto datosContacto, Direccion direccion,
			String email, String telefono, String movil) {
		super(datosContacto, direccion, email, telefono, movil);
		this.NTL = NTL;
		this.carreras = carreras;
	}


	public String getNTL() {
		return NTL;
	}

	@Override
	public String toString() {
		return "Taxista [NTL=" + NTL + ", carreras=" + carreras
				+ ", datosContacto=" + datosContacto + ", direccion="
				+ direccion + ", email=" + email + ", telefono=" + telefono
				+ ", movil=" + movil + "]";
	}


	public void setNTL(String nTL) {
		NTL = nTL;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}



	
}
