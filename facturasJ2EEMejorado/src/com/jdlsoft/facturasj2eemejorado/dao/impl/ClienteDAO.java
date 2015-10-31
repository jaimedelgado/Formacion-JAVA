package com.jdlsoft.facturasj2eemejorado.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdlsoft.facturasj2eemejorado.dao.IClienteDAO;
import com.jdlsoft.facturasj2eemejorado.helpers.JDBCHelper;
import com.jdlsoft.facturasj2eemejorado.model.Cliente;

public class ClienteDAO implements IClienteDAO {

	@Override
	public void create(Cliente cliente) {
		
		if(cliente!=null){
			Connection con = JDBCHelper.getConnection();
			try {
				String strSQL = "INSERT INTO `facturacion`.`clientes` (`nombre`, `telefono`, `cif`) VALUES (?, ?, ?)";
				PreparedStatement preparedstatement = con.prepareStatement(strSQL);
				preparedstatement.setString(1, cliente.getNombre());
				preparedstatement.setString(2, cliente.getTelefono());
				preparedstatement.setString(3, cliente.getCIF());
				System.out.println(strSQL);
				preparedstatement.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	public Cliente read(int id) {
		Connection con = JDBCHelper.getConnection();
		final String selectSQL="SELECT * FROM CLIENTES WHERE ID=?";
		Cliente cliente=null;
		try {
			PreparedStatement preparedStatement= con.prepareStatement(selectSQL);
			preparedStatement.setInt(1, id);
			ResultSet resultSet= preparedStatement.executeQuery();
			if(resultSet.next()){
				cliente = new Cliente();
				cliente.setId(resultSet.getInt(1));
				cliente.setNombre(resultSet.getString(2));
				cliente.setTelefono(resultSet.getString(3));
				cliente.setCIF(resultSet.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return cliente;
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
	public void update(Cliente cliente) {
		//DELETE FROM `facturacion`.`productos` WHERE `id`='4';
		//UPDATE `facturacion`.`productos` SET `id`='4', `nombre`='f', `precio`='27' WHERE `id`='3';
		if(cliente!=null){
			int id = cliente.getId();
			this.delete(id);
			Connection con = JDBCHelper.getConnection();
			try {
				String strSQL = "INSERT INTO `facturacion`.`clientes` (`nombre`, `telefono`, `cif`) VALUES (?,?,?)";
				PreparedStatement statement = con.prepareStatement(strSQL);
				statement.setInt(1, id);
				statement.setString(2, cliente.getNombre());
				statement.setString(3, cliente.getTelefono());
				statement.setString(3, cliente.getCIF());
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
				String strSQL = "DELETE FROM `facturacion`.`clientes` WHERE `id`=?;";
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
	public List<Cliente> getAll() {
		Connection con = JDBCHelper.getConnection();
		Cliente cliente = null;
		List<Cliente> clientes = new ArrayList<Cliente>();
		try {
			
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from clientes");
			
			
			while(resultSet.next()){
				cliente=new Cliente();
				cliente.setId(resultSet.getInt(1));
				cliente.setNombre(resultSet.getString(2));
				cliente.setTelefono(resultSet.getString(3));
				cliente.setCIF(resultSet.getString(4));
				clientes.add(cliente);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientes;
	}
}
