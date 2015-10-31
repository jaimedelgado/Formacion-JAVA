package com.jdlsoft.pruebJDBC.model;

import java.util.Date;
import java.util.List;

public class Factura {
	private int codigo;
	private Date fecha;
	private String observaciones;
	private Cliente cliente; 
	private List<DetalleFactura> detalles;
	

	
	public Factura(){
		
	}

	public Factura(int codigo, Date fecha, String observaciones, Cliente cliente, List<DetalleFactura> detalles) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.observaciones = observaciones;
		this.cliente = cliente;
		this.setDetalles(detalles);
	}

	public int getCodigo() {
		return codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<DetalleFactura> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "Factura [codigo=" + codigo + ", fecha=" + fecha
				+ ", observaciones=" + observaciones + ", cliente=" + cliente
				+ ", detalles=" + detalles + "]";
	}


	
}
