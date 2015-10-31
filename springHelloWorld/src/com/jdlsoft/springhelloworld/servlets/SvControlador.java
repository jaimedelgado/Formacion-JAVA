package com.jdlsoft.springhelloworld.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.jdlsoft.springhelloworld.model.Cliente;
import com.jdlsoft.springhelloworld.services.IClienteDAO;

@WebServlet("/SvControlador")
public class SvControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Autowired
	private IClienteDAO clienteDAO; 
	
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cliente cliente = clienteDAO.getClienteById(4);
		clienteDAO.create(new Cliente());
		response.sendRedirect("index.html");
	}

}
