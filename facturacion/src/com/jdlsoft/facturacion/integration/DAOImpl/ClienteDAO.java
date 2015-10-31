package com.jdlsoft.facturacion.integration.DAOImpl;

import java.util.Set;

import com.jdlsoft.facturacion.business.model.Cliente;
import com.jdlsoft.facturacion.helper.BaseDatos;
import com.jdlsoft.facturacion.integration.DAOServices.DAO;

public class ClienteDAO implements DAO<Cliente> {
	private BaseDatos baseDatos = new BaseDatos();
	
	@Override
	public void create(Cliente cliente) {
		this.baseDatos.getClientes().add(cliente);
		
	}

	@Override
	public Cliente read(int id) {
		Cliente cliente = null;
		for(Cliente c : this.baseDatos.getClientes()){
			if (c.getId() == id){
				cliente = c;
			}
		}
		return cliente;
	}

	@Override
	public void update(Cliente cliente) {
		if(this.baseDatos.getClientes().contains(cliente)){
			this.baseDatos.getClientes().add(cliente);
		}
		
	}

	@Override
	public void delete(int id) {
		Cliente cliente= new Cliente();
		cliente.setId(id);
		this.baseDatos.getClientes().remove(cliente);
		
	}

	@Override
	public Set<Cliente> getAll() {
		return this.baseDatos.getClientes();
	}

}
