<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Soy la respuesta JSP</title>
</head>
<body>
	<%-- <%
		//Esto es un scriptlet. Código java dentro de un docuemtno jsp
		System.out.println("Informacion generada por respuesta.jsp");
		for(int i=0; i<10; i++){
			out.println("<p>" + i + "</p>");
		}
	%> --%>
	
	<h2>Parámetros incorrectos</h2>
	<h4>Los detalles del error son los siguientes: </h2>
	<p> ${error}</p>
</body>
</html>