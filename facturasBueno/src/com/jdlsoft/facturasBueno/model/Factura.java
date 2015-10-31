package com.jdlsoft.facturasBueno.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
	private int codigo;
	private Date fecha;
	private String observaciones;
	private Cliente cliente;
	private List<LineaDetalleFactura> detalle = new ArrayList<LineaDetalleFactura>();

	public Factura(){
		
	}

	public Factura(int codigo, Date fecha, String observaciones, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.observaciones = observaciones;
		this.cliente = cliente;
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

	public void addLineaDetalle (Producto producto, int cantidad, double precio){
		this.detalle.add(new LineaDetalleFactura(producto, cantidad, precio));
	}
	
	public List<LineaDetalleFactura> getDetalle(){
		return this.detalle;
	}

	public double getSubTotal(){
		double subTotal = 0;
		for(LineaDetalleFactura l: this.detalle){
			subTotal += l.getImporte();
		}
		return subTotal;
	}
	
	public double getIVA(){
		return this.getSubTotal()*0.21;
	}
	
	public double getTotal(){
		return this.getSubTotal() + this.getIVA();
	}
	
}
