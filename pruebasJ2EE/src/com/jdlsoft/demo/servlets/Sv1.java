package com.jdlsoft.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdlsoft.demo.model.Queja;


@WebServlet("/Sv1")
public class Sv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		//System.out.println("entramos en el init");
		super.init(config);
	}
	
	public Sv1(){
		super();
		//System.out.println("entramos en constructor de Sv1");
	}



	@Override
	public void destroy() {
		
		super.destroy();
		//System.out.println("cedo mi colecci�n de CDs a mi primo...");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("doGet de Sv1");
		String recurso = "error.jsp";
		//1.- Recogida/validaci�n de par�metros que vienen de un formulario
		boolean ok = true;
		String error = "";
		String strId = request.getParameter("ID");
		String strNivelEnfado = request.getParameter("NivelEnfado");
		int id = -1;
		int nivelEnfado = -1;
		try{
			id = Integer.parseInt(strId);
		}catch(NumberFormatException e){
			ok = false;
		}
		try{
			nivelEnfado = Integer.parseInt(strNivelEnfado);
		}catch(NumberFormatException e){
			ok = false;
		}
		String strMotivo = request.getParameter("Motivo");
		String strUsuario = request.getParameter("Usuario");
		
		if(id==-1){
			ok = false;
			error += "El id tiene que ser un n�mero<br/>";
		}
		if(strUsuario == ""){
			ok = false;
			error += "Usuario vac�o<br/>";
		}
		if(strMotivo == ""){ 
			ok = false;
			error += "Motivo vac�o<br/>";
		}
		if(nivelEnfado<1 || nivelEnfado>10){
			ok = false;
			error += "El nivel de enfado tiene que ser un n�mero entre 1 y 10<br/>";
		}
		
		//System.out.println("ID: " + strId + ", Enfado: " + strNivelEnfado + ", Motivo: " + strMotivo + ", Usuario: " + strUsuario + ", ok: " + ok);
		
		if(ok){
			recurso = "respuesta.jsp";
		}
			//2.- Instancia Queja
			Queja queja = new Queja(id, strMotivo, nivelEnfado, strUsuario);

			//3.- Setea el objeto al request
			if(ok){
				request.setAttribute("que", queja);
			}else{
				request.setAttribute("error", error);
			}
			
			//4.- Hace forward a la p�gina respuesta.jsp
			//System.out.println("El recurso al que vamos es: " + recurso);
			RequestDispatcher rd = request.getRequestDispatcher(recurso);
			rd.forward(request, response);
			
			
			//Si los par�metros faltan o no correctos la respuesta es error.jsp
			//alta.html ser� un formulario
			
			
			//rd.forward(request, response);
			//System.out.println("No nos hab�amos ido?");
		
	}

}
