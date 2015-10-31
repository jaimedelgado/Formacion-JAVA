package com.jdlsoft.springhelloworld.services.impl;

import com.jdlsoft.springhelloworld.model.Cliente;
import com.jdlsoft.springhelloworld.services.IClienteDAO;

public class ClienteDAO implements IClienteDAO{

	@Override
	public Cliente getClienteById(int id) {
		System.out.println("El cliente " + id + " ha sido recuperado de la DB");
		return new Cliente();
	}

	@Override
	public void create(Cliente cliente) {
		System.out.println("El cliente ha sido guardado en la DB");
		
	}

}
