package com.jdlsoft.demo.model;

public class Queja {
	private int id;
	private String motivo;
	private int nivelEnfado; // de 0 a 10
	private String usuario;
	
	public Queja(){
		
	}

	public Queja(int id, String motivo, int nivelEnfado, String usuario) {
		super();
		this.id = id;
		this.motivo = motivo;
		this.nivelEnfado = nivelEnfado;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public String getMotivo() {
		return motivo;
	}

	public int getNivelEnfado() {
		return nivelEnfado;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public void setNivelEnfado(int nivelEnfado) {
		this.nivelEnfado = nivelEnfado;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Queja [id=" + id + ", motivo=" + motivo + ", nivelEnfado="
				+ nivelEnfado + ", usuario=" + usuario + "]";
	}
	
}
