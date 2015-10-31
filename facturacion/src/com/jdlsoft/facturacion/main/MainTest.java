package com.jdlsoft.facturacion.main;

import com.jdlsoft.facturacion.business.model.Cliente;
import com.jdlsoft.facturacion.integration.DAOImpl.ClienteDAO;


public class MainTest {

	public static void main(String[] args) {
		//creamos un cliente
		Cliente cliente = new Cliente(400, "65145151B", "Pepin Galvez Ridruejo");
		ClienteDAO clienteDAO = null;
		clienteDAO.create(cliente);
		
		//obtenemos el cliente a partir de la id
		Cliente c = clienteDAO.read(400);
		
		//eliminamos el cliente
		clienteDAO.delete(400);
		
		//actualizacion
		c.setNombre("PEPIN GALVEZ RIDRUEJO");
		clienteDAO.update(c);
	}

}
