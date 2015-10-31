<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="css/estilo.css">
		<meta charset="UTF-8">
		<title>LISTA DE CLIENTES</title>
	</head>
	<body>
		<h2>Lista de clientes</h2>
		
		<table>
			<tr>
				<th>ID</th><th>NOMBRE</th><th>TELEFONO</th><th>CIF</th>
			</tr>
			<c:forEach items="${listaClientes}" var="cliente">
				<tr>
					<td>${cliente.id}</td>
					<td>${cliente.nombre}</td>
					<td>${cliente.telefono}</td>
					<td>${cliente.CIF}</td>
					
				</tr>
			</c:forEach>
		</table>
		<br/>
		<a href="index.jsp">index</a>
	</body>
</html>