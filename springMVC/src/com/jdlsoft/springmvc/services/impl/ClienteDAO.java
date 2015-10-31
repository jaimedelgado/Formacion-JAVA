package com.jdlsoft.springmvc.services.impl;

import java.util.List;

import com.jdlsoft.springmvc.model.Cliente;
import com.jdlsoft.springmvc.services.IClienteDAO;

public class ClienteDAO implements IClienteDAO{

	@Override
	public Cliente getClienteById(int id) {
		Cliente cliente = new Cliente();
		cliente.setId(id);
		cliente.setNombre("Pepin");
		cliente.setApellido1("Roldán");
		cliente.setApellido2("Smith");
		System.out.println("Hemos obtenido el cliente de la base de datos");
		return cliente;
	}

	@Override
	public List<Cliente> getCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Hemos guardado el cliente en la base de datos...");
	}

}
