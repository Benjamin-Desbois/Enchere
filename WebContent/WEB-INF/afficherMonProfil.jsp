<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<title>ENI-Enchères | Mon profil</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous" />


<!-- Custom styles for this template -->
<link href="css/inscription.css" rel="stylesheet" />
</head>


<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark my-navbar mb-5">
		<div class="container ">

			<!--<img class="mr-3" src="eni.jpg" width="50">-->
			<a class="navbar-brand" href="AccueilServlet"> <img
				class="logo-gris me-3" src="./images/auction.png" width="50">
				ENI Enchères
			</a>

		</div>
	</nav>
	<div class="container d-flex justify-content-center">
		<div class="card card-container mt-5 ">



			
				<h1 class="text-center mb-5">Mon Profil</h1>

				<!-- ----------------------------------------------------------------- -->

				<div class="container mt-3">
					<!--bigger container open -->
					<div class="row">


						<div class="col-lg-6 col-md-12 mb-3">
							<!--bigger col open(1st)-->


							<!-- ---------1----------- -->
							<div class="container-fluid">
								<!-- small container open -->
								<div class="groupeFormulaire row">

									<div class="col-5">
										<p>Pseudo :</p>
									</div>

									<div class="col-7">
										<p>${pseudo}</p>
									</div>

								</div>
							</div>
							<!--small container close-->
							<!-- -----------1--------- -->


						</div>
						<!-- bigger col close(1st) -->



						<div class="col-lg-6 col-md-12 mb-3">
							<!-- bigger col open(2nd) -->
							<!-- ----------2---------- -->
							<div class="container-fluid">
								<!--small container open  -->
								<div class="groupeFormulaire row">

									<div class="col-5">
										<p>Nom :</p>
									</div>

									<div class="col-7">
										<p>${nom}</p>
									</div>

								</div>
							</div>
							<!-- small container close -->
							<!-- -----------2--------- -->
						</div>
						<!-- bigger col close(2nd) -->

					</div>
				</div>
				<!-- ----------------------------------------------------------------- -->

				<!-- ----------------------------------------------------------------- -->
				<div class="container mt-3">
					<!--bigger container open -->
					<div class="row">


						<div class="col-lg-6 col-md-12 mb-3">
							<!--bigger col open(1st)-->


							<!-- ---------1----------- -->
							<div class="container-fluid">
								<!-- small container open -->
								<div class="groupeFormulaire row">

									<div class="col-5">
										<p>Prénom :</p>
									</div>

									<div class="col-7">
										<p>${prenom}</p>
									</div>

								</div>
							</div>
							<!--small container close-->
							<!-- -----------1--------- -->


						</div>
						<!-- bigger col close(1st) -->



						<div class="col-lg-6 col-md-12 mb-3">
							<!-- bigger col open(2nd) -->
							<!-- ----------2---------- -->
							<div class="container-fluid">
								<!--small container open  -->
								<div class="groupeFormulaire row">

									<div class="col-5">
										<p>Email :</p>
									</div>

									<div class="col-7">
										<p>${email}</p>
									</div>

								</div>
							</div>
							<!-- small container close -->
							<!-- -----------2--------- -->
						</div>
						<!-- bigger col close(2nd) -->

					</div>
				</div>
				<!-- ----------------------------------------------------------------- -->

				<!-- ----------------------------------------------------------------- -->
				<div class="container mt-3">
					<!--bigger container open -->
					<div class="row">


						<div class="col-lg-6 col-md-12 mb-3">
							<!--bigger col open(1st)-->


							<!-- ---------1----------- -->
							<div class="container-fluid">
								<!-- small container open -->
								<div class="groupeFormulaire row">
									<div class="col-5">
										<p>Téléphone :</p>
									</div>

									<div class="col-7">
										<p>${telephone}</p>
									</div>

								</div>
							</div>
							<!--small container close-->
							<!-- -----------1--------- -->


						</div>
						<!-- bigger col close(1st) -->



						<div class="col-lg-6 col-md-12 mb-3">
							<!-- bigger col open(2nd) -->
							<!-- ----------2---------- -->
							<div class="container-fluid">
								<!--small container open  -->
								<div class="groupeFormulaire row">

									<div class="col-5">
										<p>Rue :</p>
									</div>

									<div class="col-7">
										<p>${rue}</p>
									</div>

								</div>
							</div>
							<!-- small container close -->
							<!-- -----------2--------- -->
						</div>
						<!-- bigger col close(2nd) -->
					</div>

				</div>
				<!-- ----------------------------------------------------------------- -->
				<!-- ----------------------------------------------------------------- -->
				<div class="container mt-3">
					<!--bigger container open -->
					<div class="row">


						<div class="col-lg-6 col-md-12 mb-3">
							<!--bigger col open(1st)-->


							<!-- ---------1----------- -->
							<div class="container-fluid">
								<!-- small container open -->
								<div class="groupeFormulaire row">

									<div class="col-5">
										<p>Code Postal :</p>
									</div>

									<div class="col-7">
										<p>${codepostal}</p>
									</div>

								</div>
							</div>
							<!--small container close-->
							<!-- -----------1--------- -->


						</div>
						<!-- bigger col close(1st) -->



						<div class="col-lg-6 col-md-12 mb-3">
							<!-- bigger col open(2nd) -->
							<!-- ----------2---------- -->
							<div class="container-fluid">
								<!--small container open  -->
								<div class="groupeFormulaire row">

									<div class="col-5">
										<p>Ville :</p>
									</div>

									<div class="col-7">
										<p>${ville}</p>
									</div>

								</div>
							</div>
							<!-- small container close -->
							<!-- -----------2--------- -->
						</div>
						<!-- bigger col close(2nd) -->
					</div>

				</div>
				<!-- ----------------------------------------------------------------- -->
				<div class="text-center mt-3">
				
					<a href="ModifierMonProfilServlet" class="btn btn-info text-center">Modifier</a>
				
				</div>
			

		</div>
	</div>
	<!-- /card-container -->
		<!-- Footer-->
	<footer class="py-5  my-navbar mt-5">
		<div class="container  ">

			<p class="m-0  text-white text-center ">
				<!-- <img class="me-3" src="./images/eni.jpg" width="100">-->
				Copyright &copy; ENI Enchères ENI 2021
			</p>
		</div>
	</footer>


</body>

</html>