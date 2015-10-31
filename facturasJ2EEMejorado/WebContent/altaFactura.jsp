<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ALTA DE LA FACTURA</title>
	</head>
	<body>
		<h2>Alta de la factura</h2>
		
		<form action="SvAltaFactura">
			<table>
			
				<tr>
					<td>ID CLIENTE: </td>
					<td><input type="text" name="idCliente"/></td>
				</tr>
				<tr>
				
					<!--<td>ID PRODUCTO: </td>
					<td><input type="text" name="idProducto"/></td>
				</tr>
				<tr>
					<td>CANTIDAD: </td>
					<td><input type="text" name="cantidad"/></td>
				</tr>
				<tr>
					<td>PRECIO L�NEA DETALLE: </td>
					<td><input type="text" name="precioLineaDetalle"/></td>
				</tr>
				<tr>-->
					<td>OBSERVACIONES: </td>
					<td><input type="text" name="observaciones"/></td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="submit" value="ACEPTAR"/>	
					</td>
				</tr>
			</table><br/>
		</form>	
			
		<c:forEach items="${factura.detalles}" var="detalle">
		
			Detalle:
	 	
		 	<ul>
		 		<li>
		 			ID PRODUCTO <input type="text" name="idProducto" value="${detalle.producto.id}"/>
		 		</li>
		 		<li>
		 			CANTIDAD <input type="text" name="cantidad" value="${detalle.cantidad}"/>
		 		</li>
		 		<li>
		 			PRECIO <input type="text" name="precio" value="${detalle.precio}"/>
		 		</li>
		 		<li>
		 			IMPORTE <input type="text" name="importe" value="${detalle.importe}"/>
		 		</li>			 					 				 				 				 	
		 	</ul>		 	
		
		</c:forEach>
		 	
			
			
	 	<form action="SvActualizaFactura">
	 		<table>
	 			<tr>
	 				<td>Detalle:</td>
	 			</tr>
			 	<tr>
			 		<td>
			 			ID PRODUCTO <input type="text" name="idProducto"/>
			 		</td>
			 	</tr>
			 	<tr>
			 		<td>
			 			CANTIDAD <input type="text" name="cantidad"/>
			 		</td>
		 		</tr>
			 	<tr>
			 		<td>
			 			PRECIO <input type="text" name="precio"/>
			 		</td>
			 	</tr>
			 	<tr>
			 		<td>
			 			<input type="submit" name="nueva" value="NUEVA"/><br/><br/><br/>
			 		</td>
	 			</tr>
			</table>
		</form>
		
		
			
		
		
		
		
		<br/>
		<a href="index.jsp">index</a>
	</body>
</html>