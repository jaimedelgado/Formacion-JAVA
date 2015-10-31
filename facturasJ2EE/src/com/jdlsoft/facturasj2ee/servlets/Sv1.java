package com.jdlsoft.facturasj2ee.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdlsoft.facturasj2ee.model.Cliente;
import com.jdlsoft.facturasj2ee.model.DetalleFactura;
import com.jdlsoft.facturasj2ee.model.Factura;
import com.jdlsoft.facturasj2ee.model.Producto;

public class Sv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Funciona!");
		
		//response.sendRedirect("http://as.com");
		
		//1.- Crear 1 cliente
		Cliente cliente1 = new Cliente(1, "Marcos", "626521655", "651656165H");
		//2.- Crear 3 productos
		Producto producto1 = new Producto(1, "Lentejas", 10.8);
		Producto producto2 = new Producto(2, "Garbanzos", 15.6);
		Producto producto3 = new Producto(3, "Alubias", 18.0);
		//3.- Crear 1 factura
		List<DetalleFactura> detalles = new ArrayList<DetalleFactura>();
		detalles.add(new DetalleFactura(201, 1, 5, 10.5, producto1));
		Factura factura1 = new Factura(1, new Date(), "Me corto al afeitarme", cliente1, detalles); 
		//4.- Adjuntar la factura al request
		request.setAttribute("factura", factura1);
		String recurso = "WEB-INF/factura.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(recurso);
		//5.- Hacer un forward a factura.jsp que será la respuesta
		rd.forward(request, response);
	}

}
