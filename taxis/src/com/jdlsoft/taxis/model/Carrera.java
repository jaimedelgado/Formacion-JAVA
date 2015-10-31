package com.jdlsoft.taxis.model;

import java.util.Date;

public class Carrera {
	private Taxista taxista;
	private int id;
	private Taxi taxi;
	private Cliente cliente;
	private Date fecha;
	private String coordenadasOrigen;
	private String coordenadasDestino;
	private double importe;
	private Tarifa tarifa;
	private String observaciones;
	
	public Carrera(){
		
	}
	public Carrera(int id, Taxista taxista, Cliente cliente, Taxi taxi, Date fecha, String coordenadasOrigen,
			String coordenadasDestino, double importe, Tarifa tarifa,
			String observaciones) {
		super();
		this.id = id;
		this.taxista = taxista;
		this.cliente = cliente;
		this.fecha = fecha;
		this.coordenadasOrigen = coordenadasOrigen;
		this.coordenadasDestino = coordenadasDestino;
		this.importe = importe;
		this.tarifa = tarifa;
		this.observaciones = observaciones;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Date getFecha() {
		return fecha;
	}
	public String getCoordenadasOrigen() {
		return coordenadasOrigen;
	}
	public String getCoordenadasDestino() {
		return coordenadasDestino;
	}
	public double getImporte() {
		return importe;
	}
	public Tarifa getTarifa() {
		return tarifa;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public int getId() {
		return id;
	}
	public Taxista getTaxista() {
		return taxista;
	}
	public Taxi getTaxi() {
		return taxi;
	}
	public void setTaxi(Taxi taxi) {
		this.taxi = taxi;
	}
	public void setTaxista(Taxista taxista) {
		this.taxista = taxista;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public void setCoordenadasOrigen(String coordenadasOrigen) {
		this.coordenadasOrigen = coordenadasOrigen;
	}
	public void setCoordenadasDestino(String coordenadasDestino) {
		this.coordenadasDestino = coordenadasDestino;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public String toString() {
		return "Carrera [taxista=" + taxista + ", id=" + id + ", taxi=" + taxi
				+ ", cliente=" + cliente + ", fecha=" + fecha
				+ ", coordenadasOrigen=" + coordenadasOrigen
				+ ", coordenadasDestino=" + coordenadasDestino + ", importe="
				+ importe + ", tarifa=" + tarifa + ", observaciones="
				+ observaciones + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carrera other = (Carrera) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
}
