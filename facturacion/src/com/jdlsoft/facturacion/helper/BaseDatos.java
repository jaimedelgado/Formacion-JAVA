package com.jdlsoft.facturacion.helper;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.jdlsoft.facturacion.business.model.Cliente;
import com.jdlsoft.facturacion.business.model.Factura;
import com.jdlsoft.facturacion.business.model.Producto;

public class BaseDatos {
	//Almacenes de objetos..
	private static final Set<Cliente>  CLIENTES = new HashSet<Cliente>();
	private static final Set<Producto> PRODUCTOS = new HashSet<Producto>();
	private static final Set<Factura>  FACTURAS = new HashSet<Factura>();
	
	static{
		Cliente cliente1 = new Cliente(100, "54682345F", "CEPSA");
		Cliente cliente2 = new Cliente(200, "66827345D", "ADIPSA");
		Cliente cliente3 = new Cliente(300, "79682345K", "ACEPSA");
		
		Producto producto1 = new Producto(100, "A", 10.0);
		Producto producto2 = new Producto(120, "B", 90.0);
		
		Factura factura1 = new Factura(5000, new Date(), cliente1);
		factura1.setObservaciones("factura de prueba..");
		factura1.addLineaFactura(producto1, 10, 10.0);
		factura1.addLineaFactura(producto2, 10, 90.0);
		
		Factura factura2 = new Factura(6000, new Date(), cliente2);
		factura2.setObservaciones("otra factura de prueba..");
		factura2.addLineaFactura(producto1, 10, 9.0);
		
		BaseDatos.CLIENTES.add(cliente1);
		BaseDatos.CLIENTES.add(cliente2);
		BaseDatos.CLIENTES.add(cliente3);
		
		BaseDatos.PRODUCTOS.add(producto1);
		BaseDatos.PRODUCTOS.add(producto2);
		
		BaseDatos.FACTURAS.add(factura1);
		BaseDatos.FACTURAS.add(factura2);
	}
	
	public BaseDatos(){
		
	}

	public Set<Cliente> getClientes() {
		return CLIENTES;
	}

	public Set<Producto> getProductos() {
		return PRODUCTOS;
	}

	public Set<Factura> getFacturas() {
		return FACTURAS;
	}
	
	
}
