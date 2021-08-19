<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil !</title>
</head>
<body>
<h1>C'est l'accueil</h1>
<form action="AcceuilServlet" method="post">
	pseudo :<input type="text" name="pseudo" value="${model.utilisateur.pseudo}"/>
</form>
</body>
</html>