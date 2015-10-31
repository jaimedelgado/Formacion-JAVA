package com.jdlsoft.facturasj2eemejorado.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.jdlsoft.facturasj2eemejorado.dao.IClienteDAO;
import com.jdlsoft.facturasj2eemejorado.dao.IFacturaDAO;
import com.jdlsoft.facturasj2eemejorado.dao.IProductoDAO;
import com.jdlsoft.facturasj2eemejorado.model.Cliente;
import com.jdlsoft.facturasj2eemejorado.model.Factura;
import com.jdlsoft.facturasj2eemejorado.model.Producto;

@WebServlet("/SvAltaFactura")
public class SvAltaFactura extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private IClienteDAO clienteDAO;
	
	@Autowired
	private IFacturaDAO facturaDAO;
	
	@Autowired
	private IProductoDAO productoDAO;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		Cliente cliente = null;
		Producto producto = null;
		Factura factura = null;

		String strCantidad = request.getParameter("cantidad");
		String strIdProducto = request.getParameter("idProducto");
		String strPrecioLineaDetalle = request.getParameter("precioLineaDetalle");
		String strCodigoFactura = request.getParameter("codigoFactura");
		String strObservaciones = request.getParameter("observaciones");
		String strIdCliente = request.getParameter("idCliente");


		boolean ok = true;
		String recurso = "WEB-INF/altaFactura.jsp";
		int cantidad = 0;
		int idProducto = 0;
		double precioLineaDetalle = 0;
		int codigoFactura = 0;
		int idCliente = 0;
		String error = "";
		
		try{
			cantidad = Integer.parseInt(strCantidad);
		} catch (NumberFormatException e){
			ok = false;
			error = error + "La cantidad tiene que ser un n�mero <br/>";
		}
		
		try{
			idProducto = Integer.parseInt(strIdProducto);
			producto = productoDAO.read(idProducto);
			System.out.println("El producto es: " + producto);
			if(producto == null){
				error = error + "La id del producto no existe";
				ok = false;
		
			}
		} catch (NumberFormatException e){
			ok = false;
			error = error + "La id del producto tiene que ser un n�mero <br/>";
		}
		
		try{
			precioLineaDetalle = Double.parseDouble(strPrecioLineaDetalle);
		} catch (NumberFormatException e){
			ok = false;
			error = error + "El precio tiene que ser un n�mero <br/>";

		}
		
		try{
			idCliente = Integer.parseInt(strIdCliente);
			cliente = clienteDAO.read(idCliente);
			if(cliente == null){
				error = error + "La id del cliente no existe";
				ok = false;
		
			}
		} catch (NumberFormatException e){
			ok = false;
			error = error + "La id del cliente tiene que ser un n�mero <br/>";

		}
		
		try{
			codigoFactura = Integer.parseInt(strCodigoFactura);
			factura = facturaDAO.read(codigoFactura);
			if(factura != null){
				error = error + "El c�digo de la factura ya existe";
				ok = false;
		
			}
		} catch (NumberFormatException e){
			ok = false;
			error = error + "El c�digo de la factura tiene que ser un n�mero <br/>";
		}
		
		
		if (!ok){
			recurso = "WEB-INF/facturaIncorrecta.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(recurso);
			request.setAttribute("error", error);
			System.out.println(ok);
			rd.forward(request, response);
		}else{
			
			factura = new Factura(codigoFactura, new Date(), strObservaciones, cliente);
			factura.addLineaDetalle(producto, cantidad, precioLineaDetalle);
			facturaDAO.create(factura);
			System.out.println(facturaDAO.getAll());
			recurso = "WEB-INF/facturaCorrecta.jsp";
			RequestDispatcher rd = request.getRequestDispatcher(recurso);
			
			// Creamos una sesi�n 
			HttpSession session = request.getSession();
			Factura f = (Factura) session.getAttribute("factura");
			if(f == null){
				session.setAttribute("factura", f);
			}
			System.out.println(ok);
			rd.forward(request, response);
		} 
			
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	

}