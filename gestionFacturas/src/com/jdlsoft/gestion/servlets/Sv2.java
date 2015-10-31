package com.jdlsoft.gestion.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SvListado")
public class Sv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*//1.- Obtener la colección de Producto haciendo uso del DAO
		
		//2.- Enviar ese objeto (coleccion de productos) a una página JSP que va a constituir la respuesta
		
		¿Qué es una página JSP? -> Es un Servlet "disfrazado" de HTML
		
		
		
		*/
	}

}
