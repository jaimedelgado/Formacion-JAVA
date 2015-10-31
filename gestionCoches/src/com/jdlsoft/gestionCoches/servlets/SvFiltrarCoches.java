package com.jdlsoft.gestionCoches.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdlsoft.gestionCoches.domain.Coche;
import com.jdlsoft.gestionCoches.utils.GCDataConnection;
import com.jdlsoft.gestionCoches.utils.GCDbQuery;

/**
 * Servlet que crea la lista de coches que cumplen con los requisitos convenientes
 * @author Jaime Delgado
 *
 */
@WebServlet("/SvFiltrarCoches")
public class SvFiltrarCoches extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Realiza la petición get al recurso pasandole la lista de coches que cumplen con los requisitos
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strDiesel = request.getParameter("diesel");
		String strGasolina = request.getParameter("gasolina");
		String strHibrido = request.getParameter("hibrido");
		String strtodos = request.getParameter("todos");
		String strSiniestrado = request.getParameter("siniestrado");
		String strFecha1 = request.getParameter("fecha1");
		String strFecha2 = request.getParameter("fecha2");
		
		Map<String, Object> filtros = new LinkedHashMap<String,Object>();
		if(strDiesel!=null){
			filtros.put(GCDbQuery.COCHES_DIESEL, GCDbQuery.COCHES_DIESEL);
		}
		if(strGasolina!=null){
			filtros.put(GCDbQuery.COCHES_GASOLINA, GCDbQuery.COCHES_GASOLINA);
		}
		if(strHibrido!=null){
			filtros.put(GCDbQuery.COCHES_HIBRIDOS, GCDbQuery.COCHES_HIBRIDOS);
		}
		if(strtodos!=null){
			filtros.put(GCDbQuery.COCHES_DIESEL, GCDbQuery.COCHES_DIESEL);
			filtros.put(GCDbQuery.COCHES_GASOLINA, GCDbQuery.COCHES_GASOLINA);
			filtros.put(GCDbQuery.COCHES_HIBRIDOS, GCDbQuery.COCHES_HIBRIDOS);
		}
		if(strSiniestrado!=null){
			filtros.put(GCDbQuery.COCHES_SINIESTRADOS, GCDbQuery.COCHES_SINIESTRADOS);
		}
		
		if(strFecha1!=null && strFecha1!=""){
			Calendar calendar = Calendar.getInstance();
			String[] fecha = strFecha1.split("-");
			calendar.set(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
			filtros.put(GCDbQuery.COCHES_FECHA_INICIO, new Date(calendar.getTimeInMillis()));
		}
		if(strFecha2!=null && strFecha2!=""){
			Calendar calendar = Calendar.getInstance();
			String[] fecha = strFecha2.split("-");
			calendar.set(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
			filtros.put(GCDbQuery.COCHES_FECHA_INICIO, new Date(calendar.getTimeInMillis()));
		}
		List<Coche> coches = new ArrayList<Coche>();
		try {
			Coche coche = null;
			
			String query = GCDbQuery.generarQuery(filtros);
			Connection con = GCDataConnection.getConnection();
			PreparedStatement preparedstatement = con.prepareStatement(query);
			ResultSet resultSet = preparedstatement.executeQuery();
			con.commit();
			while(resultSet.next()){
				coche = new Coche();
				coche.setFechaMatriculacion(resultSet.getDate(1));
				coche.setNumeroBastidor(resultSet.getString(2));
				coche.setMatricula(resultSet.getString(3));
				coche.setMarca(resultSet.getString(4));
				coche.setModelo(resultSet.getString(5));
				coche.setNumeroPuertas(resultSet.getInt(6));
				coche.setTipoMotor(resultSet.getString(7));
				coche.setSiniestrado(resultSet.getBoolean(8));
				
				coches.add(coche);				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//System.out.println("Lista de coches: " + coches);
		request.setAttribute("listaCoches", coches);
		String recurso = "WEB-INF/listaCoches.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(recurso);
		//5.- Hacer un forward a factura.jsp que será la respuesta
		rd.forward(request, response);
	}

}
