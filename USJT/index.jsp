<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Russo+One&display=swap" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Cartório</title>

<style type="text/css">
	h1,h3 { 
		text-align: center
	 }
	body{
		font-family: 'Russo One', sans-serif;
	}
	#botao{
		margin-left:650px;
	}
	
</style>
</head>
<body>
	
	<h1>Sistema Cartório</h1>
	
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
	    
	    <td>
	        <a class="btn btn-warning" href="/view/${list.id}">Visualizar</a>
	        <a class="btn btn-danger" href="/delete/${list.id}">Deletar</a>
	        <a class="btn btn-warning" href="/edit/${list.id}">Editar</a>
	    </td>
	  </tr>
	 </c:forEach>
	  
	</table>
	<hr/>
	<form method="post" action="/save">
		<input  type="hidden" name="id" value=""/>
		 <h3> CADASTRAR NOVO CARTÓRIO:</h3><br>
		  <input class="form form-control" type="text" name="name"/>
		
		  <br><br>
		  <input id="botao" class="btn btn-primary" type="submit" value="ADICIONAR">
	</form>
</body>
</html>