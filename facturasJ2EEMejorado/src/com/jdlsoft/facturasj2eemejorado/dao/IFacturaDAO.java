package com.jdlsoft.facturasj2eemejorado.dao;

import java.util.List;

import com.jdlsoft.facturasj2eemejorado.model.Factura;

public interface IFacturaDAO {
	public void create(com.jdlsoft.facturasj2eemejorado.model.Factura factura);
	public Factura read(int id);
	public void update (Factura factura );
	public void delete (int id);
	public List<Factura> getAll();

}
