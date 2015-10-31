<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>LISTA DE FACTURAS</title>
	</head>
	<body>
		<h2>Lista de facturas</h2>
		
		
		<c:forEach items="${listaFacturas}" var="factura">
			<ul>
				<li>Factura ${factura.codigo}<br/><br/>
					<table>
						<tr>
							<td>CLIENTE</td>
						</tr>
						<tr>
							<th>Id</th><th>Nombre</th><th>Teléfono</th><th>CIF</th>
						</tr>
						
						<tr>
							<td>${factura.cliente.id}</td>
							<td>${factura.cliente.nombre}</td>
							<td>${factura.cliente.telefono}</td>
							<td>${factura.cliente.CIF}</td>
						</tr>
						
					</table>
					<br/>
					<table>
						<tr>
							<td>FACTURA</td>
						</tr>
						<tr>
							<th>Cantidad</th><th>Nombre Producto</th><th>Precio</th><th>Importe</th>
						</tr>
						<c:forEach items="${factura.detalle}" var="detalle">
							<tr>
								<td>${detalle.cantidad}</td>
								<td>${detalle.producto.nombre}</td>
								<td>${detalle.precio}</td>
								<td>${detalle.importe}</td>
							</tr>
						</c:forEach>
						<tr>
							<td>TOTAL</td><td></td><td></td><td>${factura.total}</td>
						</tr>
					</table>
				</li>
			</ul>
		</c:forEach>
		
		<br/>
		<a href="index.jsp">index</a>
	</body>
</html>