<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%for(int i=1;i<=6;i++){ %>
			<h<%=i%>>Bienvenido a JSP en Java EE</h<%=i%>>
		<%} %>
	</center>
</body>
</html>