<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="InscriptionServlet" method="post">
		pseudo : <input type="text" name="pseudo"/><br>
		nom : <input type="text" name="nom"/><br>
		prenom : <input type="text" name="prenom"/><br>
		email : <input type="text" name="email"/><br>
		telephone : <input type="number" name="telephone"/><br>
		rue : <input type="text" name="rue"/><br>
		code postal : <input type="number" name="cpt"/><br>
		ville : <input type="text" name="ville"/><br>
		mot de passe : <input type="text" name="password">
		<input type="submit" value="Inscription" class="bouton"/>
	</form>
	${message}
</body>
</html>