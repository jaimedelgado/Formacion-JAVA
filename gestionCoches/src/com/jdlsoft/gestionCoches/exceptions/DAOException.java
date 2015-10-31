package com.jdlsoft.gestionCoches.exceptions;
/**
 * 
 * @author Jaime Delgado
 *
 */
@SuppressWarnings("serial")
public class DAOException extends Exception{
	public DAOException(String message){
		super(message);
	}
	
	public DAOException(String message, Throwable cause){
		super(message, cause);
	}
}
