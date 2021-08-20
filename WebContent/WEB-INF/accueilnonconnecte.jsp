<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil !</title>

</head>

<body>
<h1>Liste d'enchères non connecté</h1>
<form action="AccueilServlet" method="post">
		<button type="submit" name="connecter" value="connecter">Se connecter</button>
		<button type="submit" name="inscrit" value="inscrit">S'incrire</button>	
</form>

</body>
</html>