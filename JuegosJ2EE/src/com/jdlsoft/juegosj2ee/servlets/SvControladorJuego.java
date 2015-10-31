package com.jdlsoft.juegosj2ee.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdlsoft.juegosj2ee.model.Jugable;
import com.jdlsoft.juegosj2ee.model.MasterMind1;
import com.jdlsoft.juegosj2ee.model.MasterMind3;
import com.jdlsoft.juegosj2ee.model.MasterMind4;
import com.jdlsoft.juegosj2ee.model.MasterMind5;

@WebServlet("/SvControladorJuego")
public class SvControladorJuego extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Jugable juego = (Jugable) session.getAttribute("juego");
		
		if(juego == null){
			juego = new MasterMind3();
			session.setAttribute("juego", juego);
			
			request.setAttribute("hplay", "disabled");
			request.setAttribute("hpause", "disabled");
			request.setAttribute("hresume", "disabled");
			request.setAttribute("hreset", "disabled");
		}
		
				
		String boton = request.getParameter("boton");
		
		String jugada = request.getParameter("jugada");
		
		System.out.println(jugada);
		
		
		
		String respuesta = "";
		int numeroBlancas = 0;
		int numeroNegras = 0;
		
		boolean reset = false;
		System.out.println("Boton pulsado: " + boton);
		switch(boton){
			case "start": 	juego.start();
							request.setAttribute("hstart", "disabled");
							request.setAttribute("hresume", "disabled");
							break;
			case "reset":	juego.reset();
							reset = true;
							request.setAttribute("hplay", "disabled");
							request.setAttribute("hpause", "disabled");
							request.setAttribute("hresume", "disabled");
							break;
			case "pause":	juego.pause();
							request.setAttribute("hstart", "disabled");
							request.setAttribute("hpause", "disabled");
							request.setAttribute("hplay", "disabled");
							break;
			case "resume":	juego.resume();
							request.setAttribute("hstart", "disabled");
							request.setAttribute("hresume", "disabled");
							break;
			case "play":	request.setAttribute("hstart", "disabled");
							request.setAttribute("hresume", "disabled");
								
							respuesta = juego.play(jugada);
							List<String> jugadas = (List<String>) session.getAttribute("jugadas");
							List<Integer> listaNegras = (List<Integer>) session.getAttribute("listaNegras");
							List<Integer> listaBlancas = (List<Integer>) session.getAttribute("listaBlancas");
							
							if (jugadas == null) {
								jugadas = new ArrayList<String>();
							} 
							jugadas.add(jugada);
							
							
							String parse = "Numero de negras: ";
							//int pos = respuesta.indexOf(parse) + parse.length();
							
							numeroNegras = ((MasterMind3) juego).getNumCorrectas();
							
							parse = "Numero de blancas: ";
							//pos = respuesta.indexOf(parse) + parse.length();
							numeroBlancas = ((MasterMind3) juego).getNumDescolocadas();
							
							if (listaNegras == null) {
								listaNegras = new ArrayList<Integer>();
								
							} 
							listaNegras.add(numeroNegras);
							
							
							if (listaBlancas == null) {
								listaBlancas = new ArrayList<Integer>();
								
							}
							listaBlancas.add(numeroBlancas);
							
							System.out.println("Jugadas: " + jugadas);
							System.out.println("listaNegras: " + listaNegras);
							System.out.println("listaBlancas: " + listaBlancas);
							session.setAttribute("jugadas", jugadas);
							session.setAttribute("listaNegras", listaNegras);
							session.setAttribute("listaBlancas", listaBlancas);
							
							if (juego.getEstado().equals("WIN") || juego.getEstado().equals("LOSE")) {
								request.setAttribute("hstart", "disabled");
								request.setAttribute("hplay", "disabled");
								request.setAttribute("hpause", "disabled");
								request.setAttribute("hresume", "disabled");
							}
							
							break;
		}
		System.out.println("Estado del juego: " + juego.getEstado());
		
		// AQU� TODA LA L�GICA DE CONTROL
		
		// AQU� INVOCAMOS LA VISTA
		session.setAttribute("estado", juego.getEstado());
		//request.setAttribute("chivato", juego.getChivato());
		session.setAttribute("help", juego.getHelp());
		
		if(reset){
			session.setAttribute("jugadas", new ArrayList<String>());
			session.setAttribute("listaNegras", new ArrayList<Integer>());
			session.setAttribute("listaBlancas", new ArrayList<Integer>());
			juego = new MasterMind3();
		}
		
		session.setAttribute("juego", juego);
		request.getRequestDispatcher("consola.jsp").forward(request, response);
	}
	
}
