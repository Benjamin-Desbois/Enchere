<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ENI-Enchères | Vente Article</title>
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
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark my-navbar">
		<div class="container ">

			<!--<img class="mr-3" src="eni.jpg" width="50">-->
			<a class="navbar-brand" href="AccueilServlet"> <img
				class="logo-gris me-3" src="./images/auction.png" width="50">
				ENI Enchères
			</a>

		</div>
	</nav>
	<div class="container mt-3">
		<div class="card card-container d-flex justify-content-center ">
			<h1 class="text-center my-3">Nouvelle Vente</h1>
			<!-- Call to Action-->
			<div class="card text-white bg_nouvelleVente text-center">
				<!-- article catégoreie description -->
				<form action="VenteArticleServlet" method="post"> 
				<div class="row align-items-center mx-2">
					<div class="col-12 col-md-4 py-2">
					<label>Article :</label>
						<input class="form-control" aria-describedby="Recherche"
							type="text" name="nom">
					</div>
					<div class="col-12 col-md-4 ">
					<label>Catégorie :</label>
						<select class="form-select" aria-label="Default select example" name="categorie">
							<option selected>Toutes les Catégories</option>
							<option value="Mobilier">Mobilier</option>
							<option value="Vehicule">Véhicule</option>
							<option value="Electronique">Electronique</option>
							<option value="Autre">Autre (Précisez dans la description)</option>
						</select>
					</div>
					<div class="col-12 col-md-4 py-2">
						<label for="exampleFormControlTextarea1">Description :</label>
						<textarea type="text" class="form-control" name="description"
							rows="3"></textarea>
					</div>
				</div>
				<!-- fin article catégoreie description -->
				<!-- photo et upload photo -->
				<div class="row align-items-center mx-2 my-5">
					<div class="col-md-6 col-sm-12">
						​
						<picture>
						<source srcset="./images/switch.jpg" type="image/svg+xml">
						<img src="..." class="img-fluid img-thumbnail" alt="..."> </picture>
					</div>
					<div class="col-md-6 col-sm-12">
						<label class="form-label" for="customFile">Upload une photo :</label> <input type="file" class="form-control"
							id="customFile" />
					</div>

				</div>
				<!--fin  photo et upload photo -->
				<!-- prix initial dubut et fin de l'enchère -->
				<div class="row align-items-center mx-2 my-5">
				<div class="col-12 col-md-4 py-2">
					<label>Prix initial :</label>
						<input  class="form-control" type="number" name="prix" class="form-control" aria-describedby="Recherche"
							step="10">
					</div>
					<div class="col-12 col-md-4 py-2">
					<label>Début de l'enchère :</label>
						<input class="form-control" type="datetime-local" name="dateDebut" value="2021-08-20T19:30" min="2021-08-20T19:30" max="2021-12-31T00:00">
					</div>
					<div class="col-12 col-md-4 py-2">
						<label>Fin de l'enchère :</label>
					<input class="form-control" type="datetime-local" name="dateFin" value="2021-08-21T19:30" min="2021-08-21T19:30" max="2021-12-31T00:00">
					</div>
				
				</div>
				<!--fin  prix initial dubut et fin de l'enchère -->
				<!-- retrait -->
				<div class="row align-items-center mx-2 my-5">
				<h2 class="text-center text-dark">Retrait</h2>
				<div class="col-12 col-md-4 py-2">
					<label>Rue :</label>
						<input  class="form-control" type="text" name="adresse" class="form-control" aria-describedby="Recherche"
							step="10">
					</div>
					<div class="col-12 col-md-4 py-2">
					<label>Code Postal :</label>
						<input  class="form-control" type="number" name="codePostal" >
					</div>
					<div class="col-12 col-md-4 py-2">
						<label>Ville :</label>
					<input class="form-control" type="text" name="ville">
					</div>
				
				</div>
				<!-- fin retrait -->
				<div class="row align-items-center mx-2 my-5">
				<div class="col-6">
				<input type="submit" class="btn btn-success" name="Enregistrer" value="Enregistrer">
				</div>
				<div class="col-6">
				<button type="button" class="btn btn-danger">Annuler</button>
				</div>
				</div>
</form>
			</div>



		</div>
		<!-- /card-container -->
	</div>
	<!-- /container -->
		<!-- Footer-->
	<footer class="py-5  my-navbar mt-2">
		<div class="container  ">

			<p class="m-0  text-white text-center ">
				<!-- <img class="me-3" src="./images/eni.jpg" width="100">-->
				Copyright &copy; ENI Enchère ENI 2021
			</p>
		</div>
	</footer>

</body>

</html>
