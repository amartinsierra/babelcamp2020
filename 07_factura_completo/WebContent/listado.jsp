<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,com.curso.model.Descuento"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Productos y descuentos</h1>
	<%List<Descuento> descuentos=(List<Descuento>)request.getAttribute("descuentos");%>
	<table border="1">
		<tr><th>Producto</th><th>Descuento</th></tr>
		<%for(Descuento d:descuentos){ %>
			<tr><td><%=d.getProducto()%></td><td><%=d.getDescuento()%></td></tr>					
		<%} %>
	</table>
	<br/><br/>
	
	<a href="volver">Volver</a>
</body>
</html>