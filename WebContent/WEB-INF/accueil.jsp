<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Acceuil connecte</h1>
<form action="AccueilServlet" method="post">
		<button type="submit" name="idUtilisateur" value="idUtilisateur">Se deconnecter</button>
		<button type="submit" name="profil" value="profil">Mon Profil</button>
</form>

</body>
</html>