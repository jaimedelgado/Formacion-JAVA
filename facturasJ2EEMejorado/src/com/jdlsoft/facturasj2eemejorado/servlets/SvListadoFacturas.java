package com.jdlsoft.facturasj2eemejorado.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.jdlsoft.facturasj2eemejorado.dao.IFacturaDAO;
import com.jdlsoft.facturasj2eemejorado.model.Factura;


@WebServlet("/SvListadoFacturas")
public class SvListadoFacturas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private IFacturaDAO facturasDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Funciona!");
		
		List<Factura> listaFacturas = facturasDAO.getAll();
		System.out.println(listaFacturas);
		request.setAttribute("listaFacturas", listaFacturas);
		String recurso = "WEB-INF/listaFacturas.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(recurso);
		rd.forward(request, response);
	}

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	
}
