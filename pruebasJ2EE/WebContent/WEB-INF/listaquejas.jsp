<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html">
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Listado de quejas</title>
</head>
<body>
	<h2>Listado de quejas</h2>
	<table>
	<tr>
		<th>ID</th><th>MOTIVO</th><th>NIVEL ENFADO</th><th>USUARIO</th>
	</tr>
	<c:forEach items="${quejas}" var="queja" >
	<tr>
		<td>${queja.id}</td><td>${queja.motivo}</td><td>${queja.nivelEnfado}</td><td>${queja.usuario}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>