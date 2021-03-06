package com.jdlsoft.gestionCoches.servlets;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdlsoft.gestionCoches.daos.CocheDAO;
import com.jdlsoft.gestionCoches.domain.Coche;

/**
 * Servlet que crea el coche con las características deseadas
 * @author Jaime Delgado
 *
 */

@WebServlet("/SvAltaCoche")
public class SvAltaCoche extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Realiza la creación del coche con las características deseadas e informa al usuario si se ha creado correctamente
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CocheDAO cochesDAO = new CocheDAO();  
		String strAnyo = request.getParameter("anyo");
		String strMes = request.getParameter("mes");
		String strDia = request.getParameter("dia");
		String strNumeroBastidor = request.getParameter("numeroBastidor");
		String strMatricula = request.getParameter("matricula");
		String strMarca = request.getParameter("marca");
		String strModelo = request.getParameter("modelo");
		String str3puertas = request.getParameter("3puertas");
		String str5puertas = request.getParameter("5puertas");
		String strDiesel = request.getParameter("diesel");
		String strGasolina = request.getParameter("gasolina");
		String strHibrido = request.getParameter("hibrido");
		String strSiniestrado = request.getParameter("siniestrado");
		int numPuertas = 0;
		int anyo = 0;
		int mes = 0;
		int dia = 0;
		anyo = Integer.parseInt(strAnyo);
		mes = Integer.parseInt(strMes);
		dia = Integer.parseInt(strDia);
		if(str3puertas != null && str3puertas.equals("3")){
			numPuertas = 3;
		}else if(str5puertas != null && str5puertas.equals("5")){
			numPuertas = 5;
		}
		//System.out.println("Numpuertas vale: " + str3puertas + " o " + str5puertas); 
		//System.out.println("Int numpuertas vale: " + numPuertas);
		String tipoMotor = "";
		if(strDiesel != null && strDiesel.equals("Diesel")){
			tipoMotor = strDiesel;
		}else if(strGasolina != null && strGasolina.equals("Gasolina")){
			tipoMotor = strGasolina;
		}else if(strHibrido != null && strHibrido.equals("Hibrido")){
			tipoMotor = strHibrido;
		}
		boolean siniestrado = false;
		if(strSiniestrado != null && strSiniestrado.equals("1")){
			siniestrado = true;
		}
		Calendar calendar = Calendar.getInstance();
		calendar.set(anyo,mes,dia);
		cochesDAO.create(new Coche(new Date(calendar.getTimeInMillis()), strNumeroBastidor, strMatricula, strMarca, strModelo, numPuertas , tipoMotor, siniestrado));
		//System.out.println(cochesDAO.getAll());
		String recurso = "WEB-INF/cocheCorrecto.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(recurso);
		//System.out.println(ok);
		rd.forward(request, response);
		
			
	}

}
