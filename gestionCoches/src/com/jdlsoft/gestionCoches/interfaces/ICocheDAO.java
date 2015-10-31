package com.jdlsoft.gestionCoches.interfaces;

import java.util.List;

import com.jdlsoft.gestionCoches.domain.Coche;
import com.jdlsoft.gestionCoches.exceptions.DAOException;
/**
 * Interfaz con las funciones que tiene que tener un cocheDAO
 * @author Jaime Delgado
 *
 */
public interface ICocheDAO {
	//Comentado con javadoc
	public void create(Coche coche) throws DAOException;
	public Coche read(String matricula) throws DAOException;
	public void update(Coche coche) throws DAOException;
	public void delete(String matricula) throws DAOException;
	public List<Coche> getAll() throws DAOException;
		
	
}
