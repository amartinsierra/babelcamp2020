<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String producto=request.getParameter("producto");
	//recuperamos el resultado generado por el controller
	//y que ha sido almacenado en un atributo de petición
	double resultado=(Double)request.getAttribute("factura");%>
	<h1>Ha comparado  <%=producto%>  por un precio total de <%=resultado%></h1>
	<br/><br/>
	<a href="volver">Volver</a>
</body>
</html>