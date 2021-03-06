<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body>

	<table>
		<tr>
			<th>Codigo</th>
			<th>Nombre</th>
			<th>Fecha de alta</th>
			<th>Precio</th>
			<th>Stock</th>
		</tr>
		<c:forEach items="${productos}" var="producto">
			<tr>
				<td>${producto.codigo}</td>
				<td>${producto.nombre}</td>
				<td>${producto.fechaAlta}</td>
				<td>${producto.precio}</td>
				<td>${producto.stock}</td>
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>