<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	
	<h2>Queja: </h2>
	<h4>Id:           ${que.id} </h4>
	<h4>Usuario:      ${que.usuario}  </h4>
	<h4>Motivo:       ${que.motivo} </h4>
	<h4>Nivel enfado: ${que.nivelEnfado} </h4>
	${noexisto}
</body>
</html>