package com.jdlsoft.springhelloworld.services;

import com.jdlsoft.springhelloworld.model.Cliente;

public interface IClienteDAO {
	
	public Cliente getClienteById(int id);
	
	public void create(Cliente cliente);
}
