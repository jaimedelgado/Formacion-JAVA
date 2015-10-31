package com.jdlsoft.facturacion.integration.DAOImpl;

import java.util.Set;

import com.jdlsoft.facturacion.business.model.Factura;
import com.jdlsoft.facturacion.helper.BaseDatos;
import com.jdlsoft.facturacion.integration.DAOServices.DAO;

public class FacturaDAO implements DAO<Factura>{
	private BaseDatos baseDatos = new BaseDatos();
	
	@Override
	public void create(Factura factura) {
		this.baseDatos.getFacturas().add(factura);
	}

	@Override
	public Factura read(int id) {
		Factura factura = null;
		for(Factura c : this.baseDatos.getFacturas()){
			if (c.getId() == id){
				factura = c;
			}
		}
		return factura;
	}

	@Override
	public void update(Factura factura) {
		if(this.baseDatos.getFacturas().contains(factura)){
			this.baseDatos.getFacturas().add(factura);
		}
		
	}

	@Override
	public void delete(int id) {
		Factura factura =new Factura();
		factura.setId(id);
		this.baseDatos.getFacturas().remove(factura);
	}

	@Override
	public Set<Factura> getAll() {
		return this.baseDatos.getFacturas();
	}

}
