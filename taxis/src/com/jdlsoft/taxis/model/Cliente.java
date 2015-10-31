package com.jdlsoft.taxis.model;

import java.util.List;


public class Cliente extends Persona{
	private boolean VIP;
	private List<Carrera> carreras;
	
	public Cliente(){
		
	}
	public Cliente(DatosContacto datosContacto, Direccion direccion,
			String email, String telefono, String movil, boolean VIP, List<Carrera> carreras) {
		super(datosContacto, direccion, email, telefono, movil);
		this.VIP = VIP;
		this.setCarreras(carreras);
	}
	public boolean isVIP() {
		return VIP;
	}

	public void setVIP(boolean vIP) {
		VIP = vIP;

	}
	public List<Carrera> getCarreras() {
		return carreras;
	}
	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}
	@Override
	public String toString() {
		return "Cliente [VIP=" + VIP + ", carreras=" + carreras
				+ ", datosContacto=" + datosContacto + ", direccion="
				+ direccion + ", email=" + email + ", telefono=" + telefono
				+ ", movil=" + movil + "]";
	}

}
