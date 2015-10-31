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

import com.jdlsoft.facturasBueno.dao.IClienteDAO;
import com.jdlsoft.facturasBueno.model.Cliente;


@WebServlet("/SvListadoClientes")
public class SvListadoClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IClienteDAO clientesDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Funciona!");
		
		List<Cliente> listaClientes = clientesDAO.getAll();
		request.setAttribute("listaClientes", listaClientes);
		String recurso = "WEB-INF/listaClientes.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(recurso);
		//5.- Hacer un forward a factura.jsp que ser� la respuesta
		rd.forward(request, response);
	}

}
