<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ENI-Enchères | Détail Vente</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous" />

<!-- Custom styles for this template -->
<link href="css/login.css" rel="stylesheet" />
<style>
h2{
color:black;
}
.btn-encherir{
background-color:#e76f51;
}
</style>
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
			<h1 class="text-center my-3">Détail Vente</h1>
			<!-- Call to Action-->
			<div class="card text-white text-center" id="bg_detailVente">
				<!-- article catégoreie description -->

				<div class="row align-items-center mx-2">
					<div class="col-12 col-md-6 ">
						<picture>
						<source srcset="./images/camera.jpg" type="image/svg+xml">
						<img src="..." class="img-fluid img-thumbnail" alt="..."> </picture>

					</div>
					<div class="col-12 col-md-6 ">
						<h2 class="text-center">${nom}</h2>
						<p class="text-center">
			</p>
						<h4 class="text-center">${description}</h4>

					</div>

				</div>

				<div class="row align-items-center my-4">
				<div class="col-12">
					<form>
						<h5 class="text-center"><span class="detailHcolor">Meilleur offre: </span>210 pts par Bob</h5>
						<h5 class="text-center"><span class="detailHcolor">Mise à prix: </span>${miseAprix }</h5>
						<h5 class="text-center"><span class="detailHcolor">Fin de l'enchère: </span>${finDate }</h5>
						<h5 class="text-center">
							<span class="detailHcolor">Retrait: </span>${rue}<br>${codePostal}&nbsp;&nbsp;${ville}
						</h5>
						<h5 class="text-center"><span class="detailHcolor">Vendeur: </span>${vendeur}</h5>
						<div class="d-flex justify-content-between">
						<label><span class="detailHcolor"><b>Ma proposition :</b></span> <input class="form-control"
							type="number" name="prix" class="form-control"
							aria-describedby="maProposition" placeholder="220" step="10"></label>
							
						<button type="submit" class="btn-encherir"><b>Enchérir</b></button>
					</div>
					</form>

				</div>
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