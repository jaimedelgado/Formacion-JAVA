package com.jdlsoft.pruebJDBC.main;

import java.util.List;

import com.jdlsoft.pruebJDBC.model.Factura;
import com.jdlsoft.pruebJDBC.model.Producto;
import com.jdlsoft.pruebJDBC.services.dao.DAO;
import com.jdlsoft.pruebJDBC.services.dao.impl.FacturaDAO;
import com.jdlsoft.pruebJDBC.services.dao.impl.ProductoDAO;

public class MainTest {
	
	public static void main(String [] args){
		//pruebaCREATE();
		//pruebaREAD();
		//pruebaUPDATE();
		//pruebaDELETE();
		pruebaREADALL();
		//pruebaREADFACTURA();
	}
	private static void pruebaREADFACTURA() {
		DAO<Factura> facturaDAO = new FacturaDAO();
		Factura factura = facturaDAO.read(201);
		System.out.println(factura);
		
	}
	private static void pruebaCREATE(){
		DAO<Producto> productoDAO = new ProductoDAO();
		productoDAO.create(new Producto(0, "Alicates", 5.8));
		pruebaREADALL();
	}
	private static void pruebaREAD(){
		DAO<Producto> productoDAO = new ProductoDAO();
		Producto producto = productoDAO.read(8);
		System.out.println(producto);
	}
	private static void pruebaUPDATE(){
		DAO<Producto> productoDAO = new ProductoDAO();
		productoDAO.update(new Producto(10, "Alicates", 555.0));
		//System.out.println(producto);
		pruebaREADALL();
	}
	private static void pruebaDELETE(){
		DAO<Producto> productoDAO = new ProductoDAO();
		productoDAO.delete(10);
		//System.out.println(producto);
		pruebaREADALL();
	}
	private static void pruebaREADALL(){
		DAO<Producto> productoDAO = new ProductoDAO();
		List<Producto> productos = productoDAO.getAll();
		System.out.println(productos);
	}
}
