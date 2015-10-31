<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Alta del producto</title>
	</head>
	<body>
		<h2>Alta del producto</h2>
		
			<form action="altaProducto">
				<table>
					<tr><td>Codigo</td><td><input type="text" name="codigo"/></td></tr>
					<tr><td>Nombre</td><td><input type="text" name="nombre"/></td></tr>
					<tr><td>Fecha</td><td><input type="text" name="fecha"/></td></tr>
					<tr><td>Precio</td><td><input type="text" name="precio"/></td></tr>
					<tr><td>Stock</td><td><input type="text" name="stock"/></td></tr>
				</table>
			<input type="submit" value="Aceptar"/>
		</form>
	</body>
</html>