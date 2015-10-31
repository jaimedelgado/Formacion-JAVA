package com.jdlsoft.springmvc.services;

import java.util.List;

import com.jdlsoft.springmvc.model.Cliente;

public interface IClienteDAO {
	public Cliente getClienteById(int id);
	public List<Cliente> getCliente();
	public void create(Cliente cliente);
}
