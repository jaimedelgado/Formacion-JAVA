package com.jdlsoft.facturasBueno.model;

public class LineaDetalleFactura {

	private Producto producto;
	private int cantidad;
	private double precio;
	
	public LineaDetalleFactura(){
		
	}
	
	public LineaDetalleFactura(Producto producto, int cantidad, double precio) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getImporte(){
		return this.precio * this.cantidad;
	}
}
