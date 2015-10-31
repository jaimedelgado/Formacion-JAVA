package com.jdlsoft.pruebJDBC.services.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdlsoft.pruebJDBC.helper.JDBCHelper;
import com.jdlsoft.pruebJDBC.model.Cliente;
import com.jdlsoft.pruebJDBC.model.DetalleFactura;
import com.jdlsoft.pruebJDBC.model.Factura;
import com.jdlsoft.pruebJDBC.services.dao.DAO;

public class FacturaDAO implements DAO<Factura>{

	@Override
	public void create(Factura t) {
		// TODO Auto-generated method stub
		
	}
/*
	@Override
	public Factura read(int id) {
		//select F.codigo, F.fecha, F.observaciones, F.id_cliente, C.nombre, C.telefono, C.cif, DF.id,DF.id_producto,DF.cantidad, DF.precio, DF.cantidad*DF.precio AS Total
//from Facturas F, Clientes C ,detalle_facturas DF 
//where F.codigo = 201 and F.id_cliente = C.id AND F.codigo = DF.codigo_factura;

		
		Connection con = JDBCHelper.getConnection();
		Factura factura = null;
		try {
			Statement statement = con.createStatement();
			String strSQL = "select F.codigo, F.fecha, F.observaciones, F.id_cliente, C.nombre, C.telefono, C.cif,DF.id,DF.id_producto,DF.cantidad, DF.precio, DF.cantidad*DF.precio AS Total from Facturas F, Clientes C,detalle_facturas DF where F.codigo = "+id+" and F.id_cliente = C.id AND F.codigo = DF.codigo_factura;";
			ResultSet resultSet = statement.executeQuery(strSQL);
			System.out.println(strSQL);
			factura=new Factura();
			List<DetalleFactura> listaDetalles = new ArrayList<DetalleFactura>();
			int i=0;
			while(resultSet.next()){
				factura.setCodigo(resultSet.getInt(i+1));
				factura.setFecha(resultSet.getDate(i+2));
				factura.setObservaciones(resultSet.getString(i+3));
				factura.setCliente(new Cliente(resultSet.getInt(i+4), resultSet.getString(i+5), resultSet.getString(i+6), resultSet.getString(i+7)));
				
				listaDetalles.add(new DetalleFactura(resultSet.getInt(i+8), resultSet.getInt(i+9), resultSet.getInt(i+10), resultSet.getDouble(i+11)));
				resultSet.getInt(i+12);
				factura.setDetalles(listaDetalles);
								
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factura;
	}*/
	@Override
	public Factura read(int id) {
		//select F.codigo, F.fecha, F.observaciones, F.id_cliente, C.nombre, C.telefono, C.cif, DF.id,DF.id_producto,DF.cantidad, DF.precio, DF.cantidad*DF.precio AS Total
		//from Facturas F, Clientes C ,detalle_facturas DF 
		//where F.codigo = 201 and F.id_cliente = C.id AND F.codigo = DF.codigo_factura;

		
		Connection con = JDBCHelper.getConnection();
		Factura factura = null;
		try {
			final String strSQL = "select F.codigo, F.fecha, F.observaciones, F.id_cliente, C.nombre, C.telefono, C.cif,DF.id,DF.id_producto,DF.cantidad, DF.precio, DF.cantidad*DF.precio AS Total "
								+ "from Facturas F, Clientes C,detalle_facturas DF "
								+ "where F.codigo = ? and F.id_cliente = C.id AND F.codigo = DF.codigo_factura;";
			PreparedStatement preparedStatement = con.prepareStatement(strSQL);
			preparedStatement.setInt(1, id);
			ResultSet resultSet= preparedStatement.executeQuery();
			System.out.println(strSQL);
			factura=new Factura();
			List<DetalleFactura> listaDetalles = new ArrayList<DetalleFactura>();
			int i=0;
			
			while(resultSet.next()){
				factura.setCodigo(resultSet.getInt(i+1));
				factura.setFecha(resultSet.getDate(i+2));
				factura.setObservaciones(resultSet.getString(i+3));
				factura.setCliente(new Cliente(resultSet.getInt(i+4), resultSet.getString(i+5), resultSet.getString(i+6), resultSet.getString(i+7)));
				
				listaDetalles.add(new DetalleFactura(resultSet.getInt(i+8), resultSet.getInt(i+9), resultSet.getInt(i+10), resultSet.getDouble(i+11)));
				resultSet.getInt(i+12);
				factura.setDetalles(listaDetalles);
								
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factura;
	}
	@Override
	public void update(Factura t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Factura> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
