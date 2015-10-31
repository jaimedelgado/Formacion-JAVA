<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="css/estilo.css">
		<meta charset="UTF-8">
		<title>ALTA DEL PRODUCTO</title>
	</head>
	<body>
		<h2>Alta del producto</h2>
		
		<form action="SvAltaProducto">
			<table>
				<tr>
					<td>ID: </td>
					<td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<td>NOMBRE: </td>
					<td><input type="text" name="nombre"/></td>
				</tr>
				<tr>
					<td>PRECIO: </td>
					<td><input type="text" name="precio"/></td>
				</tr>	
				<tr>
					<td><input type="submit" name="submit"/></td>
				</tr>		
			</table>
		
		
		</form>
		<br/>
		<a href="index.jsp">index</a>
	</body>
</html>