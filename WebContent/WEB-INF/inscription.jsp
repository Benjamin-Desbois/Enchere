<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<title>ENI-Enchères | Inscription</title>
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
				ENI Enchère
			</a>

		</div>
	</nav>
	<div class="container d-flex justify-content-center">
		<div class="card card-container mt-5 ">



			<form action="InscriptionServlet" method="post"
				class="form-inscription mb-5">
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
										<label>Pseudo :</label>
									</div>

									<div class="col-7">
										<input type="text" name="pseudo" id="inputPseudo"
											class="form-control" required autofocus />
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
										<label>Nom :</label>
									</div>

									<div class="col-7">
										<input type="text" name="nom" id="inputNom"
											class="form-control" required autofocus />
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

									<div class="col-5 ">
										<label>Prénom :</label>
									</div>

									<div class="col-7">
										<input type="text" name="prenom" id="inputPrenom"
											class="form-control" required autofocus />
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

									<div class="col-5 ">
										<label>Email :</label>
									</div>

									<div class="col-7">
										<input type="email" name="email" id="inputEmail"
											class="form-control" required autofocus />
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
										<label>Téléphone :</label>
									</div>

									<div class="col-7">
										<input type="number" name="telephone" id="inputPseudo"
											class="form-control" placeholder="06********" required
											autofocus />
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
										<label>Rue :</label>
									</div>

									<div class="col-7">
										<input type="text" name="rue" id="inputRue"
											class="form-control" required autofocus />
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
										<label>Code Postal :</label>
									</div>

									<div class="col-7">
										<input type="number" name="codepostal" id="inputCodePostal"
											class="form-control" required autofocus />
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
										<label>Ville :</label>
									</div>

									<div class="col-7">
										<input type="text" name="ville" id="inputVille"
											class="form-control" required autofocus />
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
										<label class="text-nowrap">Mot de passe :</label>
									</div>

									<div class="col-7">
										<input type="text" name="motdepasse" id="inputMotDePasse"
											class="form-control" placeholder="******" required autofocus />
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
										<label class="text-nowrap">Confirmation :</label>
									</div>

									<div class="col-7">
										<input type="text" name="confirmation" id="inputConfirmation"
											class="form-control" placeholder="******" required autofocus />
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



				<div class="container mt-3 d-flex justify-content-between">
					<!--bigger container open -->
					
						
							<form action="AccueilServlet" method="post">

								<button type="submit" class="btn btn-success">Créer</button>
							</form>
						
						
							<form action="AccueilServlet" method="post">

								<button type="submit" class="btn btn-danger">Annuler</button>
							</form>
						
			
				</div>
			
		
</div>
		</div>

	<!-- /card-container -->


	${message}
	<!-- Footer-->
	<footer class="py-5  my-navbar mt-5">
		<div class="container  ">

			<p class="m-0  text-white text-center ">
				<!-- <img class="me-3" src="./images/eni.jpg" width="100">-->
				Copyright &copy; ENI Enchère ENI 2021
			</p>
		</div>
	</footer>
</body>

</html>