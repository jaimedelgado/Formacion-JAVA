<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="css/estilo.css">
		<meta charset="UTF-8">
		<title>LISTA DE PRODUCTOS</title>
	</head>
	<body>
		<h2>Lista de productos</h2>
		
		<table>
			<tr>
				<th>ID</th><th>NOMBRE</th><th>PRECIO</th>
			</tr>
			<c:forEach items="${listaProductos}" var="producto">
				<tr>
					<td>${producto.id}</td>
					<td>${producto.nombre}</td>
					<td>${producto.precio}</td>
				</tr>
			</c:forEach>
		</table>
		<br/>
		<a href="index.jsp">index</a>
	</body>
</html>