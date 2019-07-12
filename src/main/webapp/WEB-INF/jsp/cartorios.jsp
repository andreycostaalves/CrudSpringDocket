<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Russo+One&display=swap" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
	body{
		font-family: 'Russo One', sans-serif;
	}
</style>
</head>
<body>
	<table class="table table-striped">
		  <tr>
		    <th scope="col">ID</th>
		    <th scope="col">CARTORIO</th>
		    <th></th>
		  </tr>
		  <c:forEach var = "list" items = "${lists}">
			  <tr scope="row">
		    <td>${list.id}</td>
		    <td>${list.name}</td>
		  </tr>
	 </c:forEach>
	  
	</table>
	 <a class="btn btn-warning" href="/">VOLTAR</a>

</body>
</html>