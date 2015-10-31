package com.jdlsoft.demo.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdlsoft.demo.model.Queja;


@WebServlet("/Sv2")
public class Sv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Queja q1 = new Queja(10, "no me gusta la comida", 9, "Pepin Gálvez Ridruejo");
		Queja q2 = new Queja(12, "no me gusta nada", 9, "Pepin Gálvez Ridruejo");
		Queja q3 = new Queja(16, "la cama es pequeña", 9, "Pepin Gálvez Ridruejo");
		Queja q4 = new Queja(20, "internet no funciona", 9, "Marcos Gálvez Ridruejo");
		
		List<Queja> quejas = new ArrayList<Queja>();
		quejas.add(q1);
		quejas.add(q2);
		quejas.add(q3);
		quejas.add(q4);
		
		request.setAttribute("quejas",quejas);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/listaquejas.jsp");
		rd.forward(request, response);
		
		
	}

}
