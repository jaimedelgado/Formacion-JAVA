<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factura creada correctamente</title>
</head>
<body>
	<p> <%= session.getAttribute("nombreCliente") %></p>
	<h2>La factura ha sido creada correctamente!</h2>

</body>
</html>