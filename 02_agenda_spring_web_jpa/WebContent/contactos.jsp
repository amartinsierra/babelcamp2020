<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.curso.model.Contacto,java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Lista de contactos</h1>
		<table border="1">
			<tr><th>Nombre</th><th>Email</th><th>Edad</th><th></th></tr>
			<%List<Contacto> contactos=(List<Contacto>)request.getAttribute("contactos");
			for(Contacto c:contactos){%>
				<tr>
					<td><%=c.getNombre()%></td>
					<td><%=c.getEmail()%></td>
					<td><%=c.getEdad()%></td>
					<td><a href="eliminar?idContacto=<%=c.getIdContacto()%>">Eliminar</a></td>
				</tr>
			<%}%>
		</table>
		<br/><br/>
		
		<a href="toMenu">Volver</a>
	</center>
</body>
</html>