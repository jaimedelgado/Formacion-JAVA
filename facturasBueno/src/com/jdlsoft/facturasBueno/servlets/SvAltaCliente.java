package com.jdlsoft.facturasBueno.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.jdlsoft.facturasBueno.dao.IProductoDAO;
import com.jdlsoft.facturasBueno.model.Producto;

@WebServlet("/SvAltaCliente")
public class SvAltaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IProductoDAO productosDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Funciona!");
		
		//DAO<Producto> productosDAO = new ProductoDAO();  // Declaramos "productosDAO"
		Producto producto = new Producto();
		String strId = request.getParameter("id");
		String strNombre = request.getParameter("nombre");
		String strPrecio = request.getParameter("precio");
		boolean ok = true;
		String recurso = "WEB-INF/altaProducto.jsp";
		double precio = 0.0;
		int id = 0;
		
		try{
			id = Integer.parseInt(strId);
		} catch (NumberFormatException e){
			ok = false;
		}
		
		try{
			precio = Double.parseDouble(strPrecio);
		} catch (NumberFormatException e){
			ok = false;
		}
		
		if (strNombre == ""){
			ok = false;
		}
		
		if (!ok){
			//request.setAttribute("listaProductos", listaProductos);
			RequestDispatcher rd = request.getRequestDispatcher(recurso);
			System.out.println(ok);
			rd.forward(request, response);
		}else{
			productosDAO.create(new Producto(id, strNombre, precio));
			System.out.println(productosDAO.getAll());
			recurso = "WEB-INF/productoCorrecto.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(recurso);
			System.out.println(ok);
			rd.forward(request, response);
		} 
			
	}

}
