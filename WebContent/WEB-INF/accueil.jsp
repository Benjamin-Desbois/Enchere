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
<h1>Liste d'enchères</h1>
<form action="AccueilServlet" method="post">
<c:choose>
	<c:when test="${session.getAttribute == null}">	
		<button type="submit" name="connecter" value="connecter">Se connecter</button>
		<button type="submit" name="inscrit" value="inscrit">S'incrire</button>	
	</c:when>
	<c:otherwise>
		<button type="submit" name="profil" value="profil">Mon Profil</button>
	</c:otherwise>
</c:choose>
</form>

</body>
</html>