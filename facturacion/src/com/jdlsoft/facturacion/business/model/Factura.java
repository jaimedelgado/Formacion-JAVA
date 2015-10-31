package com.jdlsoft.facturacion.business.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
	private int id;
	private Date fechaFactura;
	private Cliente cliente;
	private String observaciones;
	private final List<LineaFactura> lineasFactura = new ArrayList<LineaFactura>();
	
	public Factura(){
		
	}

	
	public Factura(int id, Date fechaFactura, Cliente cliente) {
		super();
		this.id = id;
		this.fechaFactura = fechaFactura;
		this.cliente = cliente;
	}


	public int getId() {
		return id;
	}


	public Date getFechaFactura() {
		return fechaFactura;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public String getObservaciones() {
		return observaciones;
	}


	public List<LineaFactura> getLineasFactura() {
		return lineasFactura;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public void addLineaFactura(Producto producto, int cantidad, double precio){
		LineaFactura lineaFactura = new LineaFactura(producto,cantidad,precio);
		this.lineasFactura.add(lineaFactura);
	}
	
	
	/**
	 * 
	 * @author Administrador
	 *
	 */
	public class LineaFactura{
		private Producto producto;
		private int cantidad;
		private double precio;
		
		public LineaFactura(){
			
		}
		public LineaFactura(Producto producto, int cantidad, double precio) {
			super();
			this.producto = producto;
			this.cantidad = cantidad;
			this.precio = precio;
		}
		public Producto getProducto() {
			return producto;
		}
		public int getCantidad() {
			return cantidad;
		}
		public double getPrecio() {
			return precio;
		}
	}
}
