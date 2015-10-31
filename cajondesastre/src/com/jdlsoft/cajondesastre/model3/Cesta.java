package com.jdlsoft.cajondesastre.model3;

import java.util.List;

public class Cesta {
	private int id;
	private String cliente;
	private List<Producto> productos;
	
	public Cesta(){}
	public Cesta(int id, String cliente){
		this.id=id;
		this.cliente=cliente;
	}
	public int getId() {
		return id;
	}
	public String getCliente() {
		return cliente;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public void addProducto(Producto producto){
		this.productos.add(producto);
	}
}
