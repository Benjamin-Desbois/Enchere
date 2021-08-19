<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vendre un article</title>
</head>
<body>
	<form action="VenteArticleServlet" method="post">
		Nom de l'article <input type="text" name="nom"><br>
		Description <input type="text" name="description"><br>
		Date de mise en enchère<input type="datetime-local" name="dateDebut" value="2021-08-20T19:30" min="2021-08-20T19:30" max="2021-12-31T00:00"><br>
		Date de fin de l'enchère<input type="datetime-local" name="dateFin" value="2021-08-21T19:30" min="2021-08-21T19:30" max="2021-12-31T00:00"><br>
		Prix initial <input type="number" name="prix"><br>
		Adresse de retrait <input type="text" name="adresse"><br>
		Code Postal <input type="number" name="codePostal"><br>
		Ville <input type="text" name="ville"><br>
		<input type="submit" value="Mettre en vente">
		
		
	</form>

</body>
</html>