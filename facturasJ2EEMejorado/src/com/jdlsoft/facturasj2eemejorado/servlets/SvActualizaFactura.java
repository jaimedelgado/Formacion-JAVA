package com.jdlsoft.facturasj2eemejorado.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.jdlsoft.facturasj2eemejorado.dao.IProductoDAO;
import com.jdlsoft.facturasj2eemejorado.model.Factura;
import com.jdlsoft.facturasj2eemejorado.model.Producto;

@WebServlet("/SvActualizaFactura")
public class SvActualizaFactura extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private IProductoDAO productoDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String strIdProducto = request.getParameter("idProducto");
		String strCantidad = request.getParameter("cantidad");
		String strPrecio = request.getParameter("precio");
		
		HttpSession session = request.getSession();
		Factura factura = (Factura) session.getAttribute("factura");
		int idProducto = 0;
		Producto producto = null;
		try{
			idProducto = Integer.parseInt(strIdProducto);
			producto = productoDAO.read(idProducto);
			System.out.println("El producto es: " + producto);
			if(producto == null){
				//error = error + "La id del producto no existe";
				
				//ok = false;
		
			}
		} catch (NumberFormatException e){
			//ok = false;
			//error = error + "La id del producto tiene que ser un número <br/>";
		}
			/*	}
		try{
			
		}catch(){
			
		}
		factura.addLineaDetalle(producto, cantidad, precio);
*/


	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	
	
}
