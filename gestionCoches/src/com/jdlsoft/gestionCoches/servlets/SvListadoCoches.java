package com.jdlsoft.gestionCoches.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdlsoft.gestionCoches.daos.CocheDAO;
import com.jdlsoft.gestionCoches.domain.Coche;

/**
 * Servlet que crea la lista de coches que se van a tener que mostrar en el jsp de listaCoches
 * @author Jaime Delgado
 *
 */
@WebServlet("/SvListadoCoches")
public class SvListadoCoches extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Realiza una petici�n get pasandole un objeto listaCoches
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CocheDAO cochesDAO = new CocheDAO(); 
		List<Coche> listaCoches = cochesDAO.getAll();
		//System.out.println("Lista de coches: " + listaCoches);
		request.setAttribute("listaCoches", listaCoches);
		String recurso = "WEB-INF/listaCoches.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(recurso);
		//5.- Hacer un forward a factura.jsp que ser� la respuesta
		rd.forward(request, response);
	}

}
