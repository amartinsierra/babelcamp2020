<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
</head>
<body>
	<div class="container">
		<h1>Factura</h1>
		<form action="facturar" method="POST" class="form-horizontal">
			<div class="form-group">
				<label class="control-label col-sm-2">Producto:</label><input type="text" name="producto" class="form-control" style="width:30%"/>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Precio:</label><input type="text" name="precio" class="form-control" style="width:30%"/>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2">Unidades:</label><input type="text" name="unidades" class="form-control" style="width:30%"/>
			</div>
			<div class="form-group">
    			<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Calcular</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>