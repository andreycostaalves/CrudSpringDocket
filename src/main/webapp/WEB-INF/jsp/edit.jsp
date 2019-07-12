<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/css?family=Russo+One&display=swap" rel="stylesheet">

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Cartório</title>

<style type="text/css">
	body{
			font-family: 'Russo One', sans-serif;
		}
</style>

</head>
<body>
	<hr/>
	<h1>EDITAR CARTÓRIO</h1>
		<form method="post" action="/save">
		  <input type="hidden" name="id" value="${lists.id}"/><br/>
		  NOME CARTÓRIO:<br>
		  <input class="form form-control"  type="text" name="name" value="${lists.name}"/>
		  <br>
		 
		  <input class="btn btn-danger" type="submit" value="Editar-Voltar">
		</form>
</body>
</html>