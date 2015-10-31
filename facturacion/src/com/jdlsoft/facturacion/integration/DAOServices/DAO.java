package com.jdlsoft.facturacion.integration.DAOServices;

import java.util.Set;


public interface DAO<T> {
	
	//OPERACIONES CRUD - create, read, update, delete
	public void create(T t);
	
	public T read(int id);
	
	public void update(T t);
	
	public void delete(int id);
	
	//OPERACIONES PARA OBTENER COLECCIONES
	public Set<T> getAll();
	
	
}
