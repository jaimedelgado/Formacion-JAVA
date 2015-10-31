package com.jdlsoft.facturacion.main;

import com.jdlsoft.facturacion.business.model.Cliente;
import com.jdlsoft.facturacion.business.model.Factura;
import com.jdlsoft.facturacion.business.model.Producto;
import com.jdlsoft.facturacion.integration.DAOImpl.ClienteDAO;
import com.jdlsoft.facturacion.integration.DAOServices.DAO;

public class FormController {
	private DAO<Cliente> clienteDAO = new ClienteDAO();
	private DAO<Producto> productoDAO;
	private DAO<Factura> facturaDAO;
	
	public FormController(){
		
	}
	
	public void botonAltaCliente(Cliente cliente){
		clienteDAO.create(cliente);
	}
	
	public void botonAltaProducto(Producto producto){
		productoDAO.create(producto);
	}
	
	public void botonAltaFactura(Factura factura){
		facturaDAO.create(factura);
	}
}
