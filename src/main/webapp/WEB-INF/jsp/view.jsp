<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Russo+One&display=swap" rel="stylesheet">

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visualizar Cartório</title>

<style type="text/css">
	body{
		font-family: 'Russo One', sans-serif;
	}
</style>

</head>
<body>
<h1> Cartório</h1>
	<table class="table table-hover">
	  <tr>
	    <th>ID</th>
	    <td>${lists.id}</td>
	  </tr>
	  <tr>
	      <th>Cartório</th>
	      <td>${lists.name}</td>
	    </tr>
	    
	  </table>
	  <a class="btn btn-warning" href="/">VOLTAR</a>
</body>
</html>