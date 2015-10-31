package com.crismirjai.gestionproductosspring.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 29/10/2015 Clase que establece una conexión con la base de datos alojada en
 * la ip 192.168.200.14:3306. Usuario: root, password: 1111
 * 
 * @author Miriam del Río
 * @author Jaime Delgado
 * @author Christian Sánchez
 * 
 * 
 */
public class JDBCHelper {
	private static Connection con;

	/**
	 * Constructor sin argumentos
	 */
	private JDBCHelper() {

	}

	/**
	 * Este método devuelve una conexión con la base de datos
	 * 
	 * @return Conexión con la base de datos
	 */
	public static Connection getConnection() {
		if (con == null) {

			try {
				// System.out.println("1");
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager
						.getConnection("jdbc:mysql://192.168.200.14:3306/producto?user=root&password=1111");
				// con =
				// DriverManager.getConnection("jdbc:mysql://192.168.200.18:3306/facturacion?user=root&password=1111");

				// System.out.println("2");
				con.setAutoCommit(false);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return con;
	}
}
