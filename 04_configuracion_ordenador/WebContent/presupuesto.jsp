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
	 double precioMemoria=Double.parseDouble(request.getParameter("memoria"));
	 int descuento=Integer.parseInt(request.getParameter("pago"));
	 double precioAccesorios=0;
	 String [] accesorios=request.getParameterValues("accesorio");
	 if(accesorios!=null){
		 for(String v:accesorios){
			 precioAccesorios+=Double.parseDouble(v);
		 }
	 }
	 double precioTotal=400;
	 precioTotal=precioTotal+precioMemoria+precioAccesorios;
	 precioTotal=precioTotal*((100-descuento)/100.0);
	 %>
	 <h1><%=nombre%>  su presupuesto es <%=precioTotal %>  euros</h1>
	 
	 <br/>
	 <a href="configuracion.html">Nuevo presupuesto</a>
</body>
</html>