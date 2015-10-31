package com.jdlsoft.facturasBueno.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.jdlsoft.facturasBueno.dao.IProductoDAO;
import com.jdlsoft.facturasBueno.model.Producto;


@WebServlet("/SvListadoProductos")
public class SvListadoProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IProductoDAO productosDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Funciona!");
		
		List<Producto> listaProductos = productosDAO.getAll();
		request.setAttribute("listaProductos", listaProductos);
		String recurso = "WEB-INF/listaProductos.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(recurso);
		//5.- Hacer un forward a factura.jsp que ser� la respuesta
		rd.forward(request, response);
	}

}
