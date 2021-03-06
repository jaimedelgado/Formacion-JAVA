package com.jdlsoft.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Sv1")
public class Sv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private List<String> nombres = new ArrayList<String>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		System.out.println(nombre);
		
		HttpSession session = request.getSession();
		
		List<String> nombres = (List<String>) session.getAttribute("nombres");
		// Cuando la sesi�n sea nueva no habr� en ella ninguna lista de nombres!
		if(nombres == null){
			nombres = new ArrayList<String>();
			session.setAttribute("nombres", nombres);
		}
		
		ServletContext sc = request.getServletContext();
		List<String> allNames = (List<String>) sc.getAttribute("allNames");
		if(allNames == null){
			allNames = new ArrayList<String>();
			sc.setAttribute("allNames", allNames);
		}
		
		nombres.add(nombre);
		request.setAttribute("nombres", nombres);
		request.getRequestDispatcher("respuesta.jsp").forward(request, response);;
	}

}
