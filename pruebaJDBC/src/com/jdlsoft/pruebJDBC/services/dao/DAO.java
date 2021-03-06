package com.jdlsoft.pruebJDBC.services.dao;

import java.util.List;

public interface DAO<T> {
	public void create(T t);
	public T read(int id);
	public void update (T t);
	public void delete (int id);
	public List<T> getAll();

}
