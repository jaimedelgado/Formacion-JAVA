package com.jdlsoft.facturasBueno.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCHelper {
	private static Connection con;
	
	private JDBCHelper(){
		
	}
	
	public static Connection getConnection(){
		if (con == null){
		
				try {
					//System.out.println("1");
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/facturacion?user=root&password=1111");
					//con = DriverManager.getConnection("jdbc:mysql://192.168.200.18:3306/facturacion?user=root&password=1111");
					
					//System.out.println("2");
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
