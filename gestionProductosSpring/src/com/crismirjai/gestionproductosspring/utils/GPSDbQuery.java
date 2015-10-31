package com.crismirjai.gestionproductosspring.utils;

public class GPSDbQuery {
	/**
	 * 
	 */
	public static final String PRODUCTOS_BUSCAR_POR_CODIGO = "SELECT * FROM `PRODUCTO`.`PRODUCTO` WHERE CODIGO=?";
	public static final String PRODUCTOS_BUSCAR_TODOS = "SELECT * FROM `PRODUCTO`.`PRODUCTO`";
	public static final String PRODUCTOS_CREAR = "INSERT INTO `PRODUCTO`.`PRODUCTO` (`codigo`, `nombre`, `fechaAlta`, `precio`, `stock`) VALUES (?, ?, ?, ?, ?)";

}
