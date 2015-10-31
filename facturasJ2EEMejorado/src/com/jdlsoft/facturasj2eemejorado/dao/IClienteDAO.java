package com.jdlsoft.facturasj2eemejorado.dao;

import java.util.List;

import com.jdlsoft.facturasj2eemejorado.model.Cliente;

public interface IClienteDAO {
	public void create(Cliente cliente);
	public Cliente read(int id);
	public void update (Cliente cliente );
	public void delete (int id);
	public List<Cliente> getAll();

}
