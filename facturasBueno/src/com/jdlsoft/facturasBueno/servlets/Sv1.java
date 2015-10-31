package com.jdlsoft.facturasBueno.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdlsoft.facturasBueno.model.Cliente;
import com.jdlsoft.facturasBueno.model.Factura;
import com.jdlsoft.facturasBueno.model.Producto;

@WebServlet("/Sv1")
public class Sv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Vamos a crear una factura "hard coded"
		 * 
		 * En la vida real esa factura la obtendr�amos a partir de una id como 
		 * consulta a una base de datos.
		 * 
		 * El servlet podr�a establecer una conexi�n, realizar una query, 
		 * recorrer el resultset y "montar" el objeto.
		 * 
		 * Lo ideal es que el servlet disponga de un objeto especializado en la obtenci�n de objetos
		 * de la base de datos, es decir, un DAO.
		 * 
		 */
		
		Cliente cliente = new Cliente(1020, "Pepin G�lvez Ridruejo", "912203456", "467984152K");
		Producto producto1 = new Producto(1020, "Televisor Philips 21 inch", 840.50);
		Producto producto2 = new Producto(24333, "Adaptador Mac P-plus v.2", 24.50);
		Producto producto3 = new Producto(299, "Monitor NEC Ultravision 3", 1220.0);
		
		Factura factura = new Factura(45672, new Date(), "Se le entrega a domicilio", cliente);
		factura.addLineaDetalle(producto1, 1, 840.50);
		factura.addLineaDetalle(producto2, 10, 24.50);
		factura.addLineaDetalle(producto3, 1, 1220.0);
		
		//System.out.println("Subtotal factura: " + factura.getSubTotal());
		//System.out.println("IVA: " + factura.getIVA());
		//System.out.println("Total factura: " + factura.getTotal());
		
		//Enviamos datos (modelo) al JSP para montar la vista
		
		request.setAttribute("factura", factura);
		request.getRequestDispatcher("factura.jsp").forward(request, response);
		
		//System.out.println("entramos en servlet");
		//response.sendRedirect("index.jsp");
	}

}
