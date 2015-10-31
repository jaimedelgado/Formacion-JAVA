package com.jdlsoft.helloworld.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sv1")
public class Sv2 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Mundo Animal</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Pagina construida dinámicamente por el Servlet!!</p>");
		out.println("<p>Como prueba de ello te informo de la hora en el servidor:"+new Date()+"</p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
