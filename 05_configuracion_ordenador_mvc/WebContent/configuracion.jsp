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
		<h1>Presupuesto equipo</h1>
		<form action="calcular" method="POST" class="form-horizontal">
			<div class="form-group">
				<label class="control-label col-sm-2">Nombre:</label><input type="text" name="nombre" class="form-control" style="width:30%"/>
			</div>
			 <div class="form-group">
			  <label class="control-label col-sm-2">Configuración de memoria:</label>
			  <select class="form-control" style="width:30%" name="memoria">
			    <option value="25">4 GB</option>
			    <option value="50">8 GB</option>
			    <option value="100">16 GB</option>
			    <option value="180">32 GB</option>
			  </select>
			</div>
			<div class="form-group">
			  	<label >Accesorios:</label>
				 <div class="checkbox">
				  <label><input type="checkbox" value="170" name="accesorio">Monitor 27"</label>
				</div>
				<div class="checkbox">
				  <label><input type="checkbox" value="100" name="accesorio">Disco SSD</label>
				</div>
				<div class="checkbox disabled">
				  <label><input type="checkbox" value="80" name="accesorio">Lector Blue Ray</label>
				</div> 
			</div> 
			<div class="form-group">
				<label>Forma Pago</label>
				 <label class="radio-inline"><input type="radio" name="pago" checked value="5">Tarjeta</label>
				 <label class="radio-inline"><input type="radio" name="pago" value="10">Paypal</label>
				 <label class="radio-inline"><input type="radio" name="pago" value="0">Transferencia</label> 
			</div>
			<div class="form-group">
    			<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Enviar</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>