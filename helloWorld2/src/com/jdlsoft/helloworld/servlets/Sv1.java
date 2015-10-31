package com.jdlsoft.helloworld.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sv1")
public class Sv1 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		//1.- Recogida de parametros
		String strNumero = request.getParameter("numero");
		int numero=-1;
		try{
			numero = Integer.parseInt(strNumero);
		}catch(NumberFormatException e){
			
		}finally{
			
		}
		//2.- En función de los parámetros construimos la respuesta
		String resultado = numero!=-1 ? new LetraNumero().cdu(numero): "" ;
		
		//3.- Enviamos la respuesta
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Resultado: " + resultado);
		out.close();
	}
}
