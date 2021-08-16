<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<body>
	<form action="LoginServlet" method="post">
		<input type="text" name="nom"/><br>
		<input type="text" name="password">
		<input type="submit" value="Connexion" class="bouton"/>
	</form>
	${message}
</body>

</html>