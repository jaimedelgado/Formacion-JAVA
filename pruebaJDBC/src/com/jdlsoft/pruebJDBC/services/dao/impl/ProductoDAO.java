package com.jdlsoft.pruebJDBC.services.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdlsoft.pruebJDBC.helper.JDBCHelper;
import com.jdlsoft.pruebJDBC.model.Producto;
import com.jdlsoft.pruebJDBC.services.dao.DAO;

public class ProductoDAO implements DAO <Producto> {

	@Override
	public void create(Producto producto) {
		if(producto!=null){
			Connection con = JDBCHelper.getConnection();
			try {
				String strSQL = "INSERT INTO `facturacion`.`productos` (`nombre`, `precio`) VALUES (?, ?)";
				PreparedStatement preparedstatement = con.prepareStatement(strSQL);
				preparedstatement.setString(1, producto.getNombre());
				preparedstatement.setDouble(2, producto.getPrecio());
				System.out.println(strSQL);
				preparedstatement.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public Producto read(int id) {
		Connection con = JDBCHelper.getConnection();
		final String selectSQL="SELECT * FROM PRODUCTOS WHERE ID=?";
		Producto producto=null;
		try {
			PreparedStatement preparedStatement= con.prepareStatement(selectSQL);
			preparedStatement.setInt(1, id);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()){
				producto = new Producto();
				producto.setId(resultSet.getInt(1));
				producto.setNombre(resultSet.getString(2));
				producto.setPrecio(resultSet.getDouble(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return producto;
	}
	//@Override
	/*public Producto read(int id) {
		Connection con = JDBCHelper.getConnection();
		Producto producto = null;
		try {
			Statement statement = con.createStatement();
			String strSQL = "select * from productos where id=" + id;
			ResultSet resultSet = statement.executeQuery(strSQL);
			System.out.println(strSQL);
			producto=new Producto();
			while(resultSet.next()){
				producto.setId(resultSet.getInt(1));
				producto.setNombre(resultSet.getString(2));
				producto.setPrecio(resultSet.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return producto;
	}*/

	
	
	
	@Override
	public void update(Producto producto) {
		//DELETE FROM `facturacion`.`productos` WHERE `id`='4';
		//UPDATE `facturacion`.`productos` SET `id`='4', `nombre`='f', `precio`='27' WHERE `id`='3';
		if(producto!=null){
			int id = producto.getId();
			this.delete(id);
			Connection con = JDBCHelper.getConnection();
			try {
				String strSQL = "INSERT INTO `facturacion`.`productos` (`id`, `nombre`, `precio`) VALUES (?,?,?)";
				PreparedStatement statement = con.prepareStatement(strSQL);
				statement.setInt(1, id);
				statement.setString(2, producto.getNombre());
				statement.setDouble(3, producto.getPrecio());
				System.out.println(strSQL);
				statement.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void delete(int id) {
		if(this.read(id)!=null){
			Connection con = JDBCHelper.getConnection();
			try {
				String strSQL = "DELETE FROM `facturacion`.`productos` WHERE `id`=?;";
				PreparedStatement statement = con.prepareStatement(strSQL);
				statement.setInt(1, id);
				System.out.println(strSQL);
				statement.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Producto> getAll() {
		Connection con = JDBCHelper.getConnection();
		Producto producto = null;
		List<Producto> productos = new ArrayList<Producto>();
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from productos");
			
			
			while(resultSet.next()){
				producto=new Producto();
				producto.setId(resultSet.getInt(1));
				producto.setNombre(resultSet.getString(2));
				producto.setPrecio(resultSet.getDouble(3));
				productos.add(producto);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productos;
	}

}
