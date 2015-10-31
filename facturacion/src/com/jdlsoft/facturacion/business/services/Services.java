package com.jdlsoft.facturacion.business.services;

import java.util.List;
import java.util.Set;

import com.jdlsoft.facturacion.business.model.Factura;
import com.jdlsoft.facturacion.business.model.Producto;

public interface Services {
	
	public Set<Factura> loadFacturaBetweenDates();
	
	public void incrementarPrecios(List<Producto> productos, double porcentaje);
	
	public Set<Producto> loadProductos(double precioMin, double precioMax);
	
	public Set<Producto> loadProdctos(double precioMin);
	
}
