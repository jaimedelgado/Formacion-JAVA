package com.jdlsoft.facturasj2eemejorado.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.jdlsoft.facturasj2eemejorado.dao.IClienteDAO;
import com.jdlsoft.facturasj2eemejorado.model.Cliente;

@WebServlet("/SvAltaCliente")
public class SvAltaCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private IClienteDAO clientesDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Funciona!");
		
		String strId = request.getParameter("id");
		String strNombre = request.getParameter("nombre");
		String strTelefono = request.getParameter("telefono");
		String strCIF = request.getParameter("cif");
		boolean ok = true;
		String recurso = "WEB-INF/altaCliente.jsp";
		int id = 0;
		
		try{
			id = Integer.parseInt(strId);
		} catch (NumberFormatException e){
			ok = false;
		}
		
		
		if (strNombre == "" || strTelefono== "" || strCIF == ""){
			ok = false;
		}
		
		if (!ok){
			//request.setAttribute("listaProductos", listaProductos);
			RequestDispatcher rd = request.getRequestDispatcher(recurso);
			System.out.println(ok);
			rd.forward(request, response);
		}else{
			clientesDAO.create(new Cliente(id, strNombre, strTelefono, strCIF));
			System.out.println(clientesDAO.getAll());
			recurso = "WEB-INF/clienteCorrecto.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(recurso);
			System.out.println(ok);
			rd.forward(request, response);
		} 
			
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	

}
