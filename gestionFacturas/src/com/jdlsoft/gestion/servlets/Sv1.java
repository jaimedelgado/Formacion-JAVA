package com.jdlsoft.gestion.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SvAlta")
public class Sv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Recogemos parámetros y los validamos
		
		//2.- Instanciamos el Producto
		
		//3.- Hacemos uso del DAO para guardar el producto en la BD
		
		//4.- Enviamos como respuesta un html con el listado de productos actualizado
	}

}
