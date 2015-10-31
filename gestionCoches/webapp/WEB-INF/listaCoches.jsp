<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="css/estilo.css">
		<meta charset="UTF-8">
		<title>LISTA DE COCHES</title>
	</head>
	<body>
		<h2>Lista de coches</h2>
		
		<table>
			<tr>
				<th>Fecha matriculacion</th><th>N� bastidor</th><th>Matricula</th><th>Marca</th><th>Modelo</th><th>N� Puertas</th><th>Tipo Motor</th><th>Siniestrado</th>
			</tr>
			<c:forEach items="${listaCoches}" var="coche">
				<tr>
					<td>${coche.fechaMatriculacion}</td>
					<td>${coche.numeroBastidor}</td>
					<td>${coche.matricula}</td>
					<td>${coche.marca}</td>
					<td>${coche.modelo}</td>
					<td>${coche.numeroPuertas}</td>
					<td>${coche.tipoMotor}</td>
					<td>${coche.siniestrado}</td>
					
				</tr>
			</c:forEach>
		</table>
		<br/>
		<a href="index.jsp">index</a>
	</body>
</html>