<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String nombre=request.getParameter("nombre");
	 double precioTotal=(double)request.getAttribute("presupuesto");
	 %>
	 <h1><%=nombre%>  su presupuesto es <%=precioTotal %>  euros</h1>
	 
	 <br/>
	 <a href="volver">Nuevo presupuesto</a>
</body>
</html>