package com.jdlsoft.facturacion.integration.DAOImpl;

import java.util.HashSet;
import java.util.Set;

import com.jdlsoft.facturacion.business.model.Producto;
import com.jdlsoft.facturacion.helper.BaseDatos;
import com.jdlsoft.facturacion.integration.DAOServices.DAO;

public class ProductoDAO implements DAO<Producto>{
	private BaseDatos baseDatos = new BaseDatos();
	
	@Override
	public void create(Producto producto) {
		this.baseDatos.getProductos().add(producto);
		
	}

	@Override
	public Producto read(int id) {
		Producto producto = null;
		for(Producto c : this.baseDatos.getProductos()){
			if (c.getId() == id){
				producto = c;
			}
		}
		return producto;
	}

	@Override
	public void update(Producto producto) {
		if(this.baseDatos.getProductos().contains(producto)){
			this.baseDatos.getProductos().add(producto);
		}
		
	}

	@Override
	public void delete(int id) {
		Producto producto = new Producto();
		producto.setId(id);
		this.baseDatos.getProductos().remove(producto);
		
	}

	@Override
	public Set<Producto> getAll() {
		return this.baseDatos.getProductos();
	}

}
