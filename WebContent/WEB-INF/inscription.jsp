
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ENI-Enchères | Se connecter</title>
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
				
				
<div class="container">
<div class="row">
<div class="col col-sm-6">


<div class="container">
<div class="groupeFormulaire row mt-3">
				
					<div class="col-5 ">
						<label>Pseudo :</label>
					</div>
					
					<div class="col-7">
						<input type="text" name="pseudo" id="inputPseudo"
							class="form-control" placeholder="JeanMichMich" required
							autofocus />
					</div>
					
</div>
</div>


<div class="col col-sm-6">
				<div class="groupeFormulaire row mt-3">
					<div class="col-5 ">
						<label>Nom :</label>
					</div>
					<div class="col-7">
						<input type="text" name="nom" id="inputNom" class="form-control"
							placeholder="DUPONT" required autofocus />
					</div>
				</div>
</div>

<div>
</div>

				<div class="groupeFormulaire row mt-3">
					<div class="col-5 ">
						<label>Prénom :</label>
					</div>
					<div class="col-7">
						<input type="text" name="prenom" id="inputPrenom"
							class="form-control" placeholder="Jean-Michel" required autofocus />
					</div>
				</div>

				<div class="groupeFormulaire row mt-3">
					<div class="col-5 ">
						<label>Email : </label>
					</div>
					<div class="col-7">
						<input type="email" name="email" id="inputEmail"
							class="form-control" placeholder="jm-dupont@123.com" required
							autofocus />
					</div>
				</div>

				<div class="groupeFormulaire row mt-3">
					<div class="col-5 ">
						<label>Téléphone :</label>
					</div>
					<div class="col-7">
						<input type="text" name="telephone" id="inputTelephone"
							class="form-control" placeholder="06********" required autofocus />
					</div>
				</div>

				<div class="groupeFormulaire row mt-3">
					<div class="col-5 ">
						<label>Rue :</label>
					</div>
					<div class="col-7">
						<input type="text" name="rue" id="inputRue" class="form-control"
							placeholder="15 rue de la paix" required autofocus />
					</div>
				</div>
				<div class="groupeFormulaire row mt-3">
					<div class="col-5 ">
						<label>Code Postal :</label>
					</div>
					<div class="col-7">
						<input type="number" name="codePostal" id="inputCodePostal"
							class="form-control" placeholder="75000" required autofocus />
					</div>
				</div>

				<div class="groupeFormulaire row mt-3">
					<div class="col-5 ">
						<label>Ville :</label>
					</div>
					<div class="col-7">
						<input type="text" name="ville" id="inputVille"
							class="form-control" placeholder="Paris" required autofocus />
					</div>
				</div>

				<div class="groupeFormulaire row mt-3">
					<div class="col-5 ">
						<label>Mot de passe :</label>
					</div>
					<div class="col-7">
						<input type="password" name="motdepasse" id="inputMotDePasse"
							class="form-control" placeholder="******" required autofocus />
					</div>
				</div>

				<div class="groupeFormulaire row mt-3">
					<div class="col-5 ">
						<label>Confirmation :</label>
					</div>
					<div class="col-7">
						<input type="password" name="confirmation" id="inputConfirmation"
							class="form-control" placeholder="******" required autofocus />
					</div>
				</div>

				<div class="groupeFormulaire row mt-5">
					<div class="col-6 ">
						<form action="AccueilServlet" method="post">
							<input type="submit" value="Créer"
								class="btn btn-lg btn-primary btn-block btn-signin bouton" />
						</form>
					</div>
					<div class="col-6">
						<form action="AccueilServlet" method="post">
							<input type="submit" value="Annuler"
								class="btn btn-lg btn-primary btn-block btn-signin bouton" />
						</form>
					</div>
				</div>



			</form>

		</div>
		<!-- /card-container -->

	</div>
	<!-- /container -->


	${message}
</body>
</html>