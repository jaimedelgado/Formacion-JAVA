<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buscar productos</title>
</head>
<body>
	<form action="buscarProducto">
		codigo <input type = "text" name="codigo"/>
		<input type="submit" value="BUSCAR"/>
	</form>
	<c:if test="${producto!=null}">
		<p> Codigo: ${producto.codigo} <br/>
			Nombre: ${producto.nombre} <br/>
			Fecha: ${producto.fechaAlta} <br/>
			Precio: ${producto.precio} <br/>
			Stock: ${producto.stock} <br/>
		</p>
	</c:if>
</body>
</html>