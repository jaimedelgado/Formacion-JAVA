package com.crismirjai.gestionproductosspring.exceptions;

/**
 * 29/10/2015 Excepci�n que se lanza cuando se produce un fallo al usar la base
 * de datos de productos en tiempo de ejecuci�n
 * 
 * @author Miriam del R�o
 * @author Jaime Delgado
 * @author Christian S�nchez
 * 
 * 
 */
public class DAOException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructora con mensaje
	 * 
	 * @param message
	 *            Mensaje de error
	 */
	public DAOException(String message) {
		super(message);
	}

	/**
	 * Constructora con mensaje y causa del error
	 * 
	 * @param message
	 *            Mensaje de error
	 * @param cause
	 *            Causa del error
	 */
	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

}