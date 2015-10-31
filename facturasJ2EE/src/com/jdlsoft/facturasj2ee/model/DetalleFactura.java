package com.jdlsoft.facturasj2ee.model;

public class DetalleFactura {
	private int codigo_factura;
	private int id_producto;
	private int cantidad;
	private double precio;
	private Producto producto;
	
	public DetalleFactura(){
		
	}
	
	public DetalleFactura(int codigo_factura, int id_producto, int cantidad,
			double precio, Producto producto) {
		super();
		this.codigo_factura = codigo_factura;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.producto = producto;
	}
	
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCodigo_factura() {
		return codigo_factura;
	}
	public int getId_producto() {
		return id_producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setCodigo_factura(int codigo_factura) {
		this.codigo_factura = codigo_factura;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "DetalleFactura [codigo_factura=" + codigo_factura
				+ ", id_producto=" + id_producto + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", producto=" + producto + "]";
	}

	
	
	
}
