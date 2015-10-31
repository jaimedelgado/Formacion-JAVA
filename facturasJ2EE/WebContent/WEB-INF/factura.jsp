<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factura JSP</title>
</head>
<body>
	<%-- <%
		//Esto es un scriptlet. Código java dentro de un docuemtno jsp
		System.out.println("Informacion generada por respuesta.jsp");
		for(int i=0; i<10; i++){
			out.println("<p>" + i + "</p>");
		}
	%> --%>
	
	<%--private int codigo;
	private Date fecha;
	private String observaciones;
	private Cliente cliente; 
	private List<DetalleFactura> detalles;
	--%>
	<h2>Esto es la factura JSP</h2>
	<p>${factura.codigo}</p>
	<p>${factura.fecha}</p>
	<p>${factura.cliente}</p>
	<p>${factura.observaciones}</p>
	<h2>Listado de detalles</h2>
	<table>
	<tr>
		<th>CODIGO_FACTURA</th><th>ID_PRODUCTO</th><th>NOMBRE_PRODUCTO</th><th>PRECIO_PRODUCTO</th><th>CANTIDAD</th><th>PRECIO</th>
	</tr>
	<c:forEach items="${factura.detalles}" var="detalles" >
	<tr>
		<td>${detalles.codigo_factura}</td><td>${detalles.id_producto}</td><td>${detalles.producto.nombre}</td><td>${detalles.producto.precio}</td><td>${detalles.cantidad}</td><td>${detalles.precio}</td>
	</tr>
	</c:forEach>
	</table>
	<%--<p>${factura.detalles}</p>
	%-->
	<%--private int codigo_factura;
	private int id_producto;
	private int cantidad;
	private double precio;--%>
	
	<%--private int id;
	private String nombre;
	private double precio;
	--%>
</body>
</html>