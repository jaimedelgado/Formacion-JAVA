package com.jdlsoft.gestionCoches.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Realiza la conexión con una base de datos en localhost en el puerto 3306
 * @author Jaime Delgado
 *
 */
public class GCDataConnection {
	
	// Este es el JDBC Helper, el que conecta Java con la base de datos MySql	
	
		private static Connection con;
		
		private GCDataConnection(){
			
		}
		/**
		 * Instancia la conexión con la base de datos
		 * @return
		 */
		public static Connection getConnection(){
			if (con == null){
			
					try {
						Class.forName("com.mysql.jdbc.Driver");
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestioncoches?user=root&password=1111");
						//con = DriverManager.getConnection("jdbc:mysql://192.168.200.18:3306/gestioncoches?user=root&password=1111");
						
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


