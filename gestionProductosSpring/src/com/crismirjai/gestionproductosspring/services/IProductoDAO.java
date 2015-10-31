package com.crismirjai.gestionproductosspring.services;

import java.util.List;

import com.crismirjai.gestionproductosspring.domain.Producto;
import com.crismirjai.gestionproductosspring.exceptions.DAOException;

/**
 * 29/10/2015 Interfaz que ofrece servicios para crear, buscar y listar
 * productos
 * 
 * @author Miriam del R�o
 * @author Jaime Delgado
 * @author Christian S�nchez
 * 
 * 
 */
public interface IProductoDAO {
	/**
	 * Este m�todo devuelve el producto cuyo c�digo coincida con el par�metro
	 * 
	 * @param id
	 *            C�digo del producto a buscar
	 * @return Producto buscado
	 */
	public Producto getProductoById(String id) throws DAOException;

	/**
	 * Este m�todo devuelve la lista de productos
	 * 
	 * @return Lista de productos
	 */
	public List<Producto> getProductos() throws DAOException;

	/**
	 * Este m�todo guarda un producto
	 * 
	 * @param producto
	 *            Producto a guardar
	 */
	public void guardarProducto(Producto producto) throws DAOException;
}
