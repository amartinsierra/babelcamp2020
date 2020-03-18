<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date,java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%int num=Integer.parseInt(request.getParameter("numero")); %>
	
	<center>
		<h1>Tabla del <%=num%></h1>
		<table border="1">
			<%for(int i=1;i<=10;i++){ %>
				<tr>
					<td><%=num%>X<%=i%></td><td><%=num*i%></td>
				</tr>
			<%} %>	
		</table>
		<br/><br/>
		<%=new Date()%>
		
	</center>
</body>
</html>