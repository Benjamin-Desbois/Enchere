
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ENI-EnchÃ¨res | Se connecter</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous" />

<!-- Custom styles for this template -->
<link href="css/login.css" rel="stylesheet" />
</head>

<body>

	<div class="container">
		<div class="card card-container d-flex justify-content-center ">


			<form action="InscriptionServlet" method="post"
				class="form-inscription mb-5">
				<h1 class="text-center mb-5">Mon Profil</h1>
				
<!-- ----------------------------------------------------------------- -->
<div class="container"><!--bigger container open -->
<div class="row">

<div class="col col-md-6"><!--bigger col open(1st)-->

<!-- ---------1----------- -->
<div class="container"><!-- small container open -->
<div class="groupeFormulaire row">
				
<div class="col-5 ">
<label>Pseudo :</label>
</div>
					
<div class="col-7">
<input type="text" name="pseudo" id="inputPseudo"
class="form-control" placeholder="JeanMichMich" required autofocus />
</div>
					
</div>
</div><!--small container close-->
<!-- -----------1--------- -->

</div><!-- bigger col close(1st) -->


<div class="col col-md-6"><!-- bigger col open(2nd) -->
<!-- ----------2---------- -->
<div class="container"><!--small container open  -->
<div class="groupeFormulaire row">
				
<div class="col-5 ">
<label>Pseudo :</label>
</div>
					
<div class="col-7">
<input type="text" name="pseudo" id="inputPseudo"
class="form-control" placeholder="JeanMichMich" required autofocus />
</div>
					
</div>
</div><!-- small container close -->
<!-- -----------2--------- -->
</div><!-- bigger col close(2nd) -->

<div>
</div>

<!-- ----------------------------------------------------------------- -->			


			</form>

		</div>
		<!-- /card-container -->

	</div>
	<!-- /container -->


	${message}
</body>
</html>