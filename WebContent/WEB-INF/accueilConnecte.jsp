<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="fr">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<!-- <link rel="stylesheet" href="./css/bootstrap.min.css"> -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<title>ENI Enchère | Accueil Connecté</title>
<link rel="icon" type="image/png" href="./images/logo.png" />
<style>


li {
	display: inline;
}
a{
  text-decoration: none;
  font-size:25px;
  padding:6px;
  color:black;
}

.btn-outline-primary {
	style: transparent !important;
}
</style>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
	integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<link
	href="https://fonts.googleapis.com/css2?family=Nunito:wght@600&display=swap"
	rel="stylesheet">
<style>
body {
	background-color:#2A9D8F;
	/* background-image: linear-gradient(rgb(104, 145, 162),rgb(59, 115, 89));   */
}
h1{
	color:#264653;
}
a:hover {
  color: white;
}


.txt-ombre {
	text-shadow: 1px 1px 6px #000;
}

.my-navbar {
	background-color: transparent !important;
	/* background-color: none !important ; */
}

.bg-search{
background-color:#e76f51;
}

.btn-jinyan {
	background-color: rgb(121, 165, 184);
	transition: all 0.3s;
	color: #fff;
}

.btn-jinyan:hover, .btn-jinyan:active, .btn-jinyan:focus {
	background-color: rgba(104, 145, 162);
	color: #fff;
	transition: all 0.3s;
}

.btn-nav {
	background-color: transparent;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark my-navbar">
		<div class="container ">
        
			<!--<img class="mr-3" src="eni.jpg" width="50">-->
			<a class="navbar-brand" href="AccueilServlet"> <img class="logo-gris me-3"
				src="./images/auction.png" width="50"> ENI Enchère
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">

					<c:choose>
						<c:when test="${nom == null}">
							<li class="nav-item"><a href="LoginServlet">Se connecter</a></li>
							<li class="nav-item"><a href="InscriptionServlet">S'enregistrer</a></li>

						</c:when>
						<c:otherwise>
							<li class="nav-item"><a href="">Enchères</a></li>
							<li class="nav-item"><a href="VenteArticleServlet">Vendre
									un article</a></li>
							<li class="nav-item"><a href="MonProfilServlet">Mon profil</a></li>
							<li class="nav-item"><a href="deconnect">Déconnexion</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
				<!--
    <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Recherche" aria-label="Search">
        <button class="btn btn-outline-secondary" type="submit">Recherche</button>
    </form>
               -->
			</div>
		</div>
	</nav>
	<h1 class="text-center my-5">Liste des enchères</h1>

	<div class="container pt-3  px-4 px-lg-5 bg-white">

		<!-- Heading Row-->

		<!-- Call to Action-->
		<div class="card text-white bg-search my-5  text-center">

			<div class="row g-7 align-items-center mx-2 ">
				<div class="col-12 col-md-3 py-2">
					<label for="inputPassword6" class="col-form-label">Recherche</label>
				</div>
				<div class="col-12 col-md-3 py-2">
					<input name="s" class="form-control" aria-describedby="Recherche"
						placeholder="le nom de l'aricle contient">
				</div>
				<div class="col-12 col-md-3 py-2">
					<select class="form-select" aria-label="Default select example">
						<option selected>Toutes les Categories</option>
						<option value="Mobilier">Mobilier</option>
						<option value="Vehicule">Véhicule</option>
						<option value="Electronique">Electronique</option>
						<option value="Autre">Autre</option>
					</select>
				</div>
				<div class="col-12 col-md-3 py-2">
					<button class="btn btn-jinyan ">
						<i class="fas fa-search"></i>
					</button>
				</div>
			</div>

		</div>
		<!--checkbox et radio  -->
		
			<div class=" my-3 d-flex justify-content-between" >
            <div class="form-check">
            
                <input class="form-check-input" type="radio" id="achats" name="type" value="achats" checked>
                <label for="achats"><b>Achats</b></label>
                <div class="ml-4">
                    <div>
                        <input class="form-check-input" type="checkbox" id="encheresouvertes" name="encheres" value="encheresouvertes" checked>
                        <label for="encheresouvertes">Enchères ouvertes</label>
                    </div>
                    <div>
                        <input class="form-check-input" type="checkbox" id="encheresencours" name="encheres" value="encheresencours">
                        <label for="encheresencours">Mes enchères en cours</label>
                    </div>
                    <div>
                        <input class="form-check-input" type="checkbox" id="encheresremportees" name="encheres" value="encheresremportees">
                        <label for="encheresremportees">Mes enchères remportées</label>
                    </div>
                </div>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" id="ventes" name="type" value="vente">
                <label for="ventes"><b>Mes Ventes</b></label>
                <div id="ventesradio" class="ml-4">
                    <div>
                        <input class="form-check-input" type="checkbox" id="ventesencours" name="ventes" value="ventesencours" >
                        <label for="ventesencours">Mes ventes en cours</label>
                    </div>
                    <div>
                        <input class="form-check-input" type="checkbox" id="ventesnondebutees" name="ventes" value="ventesnondebutees">
                        <label for="ventesnondebutees">Ventes non débutées</label>
                    </div>
                    <div>
                        <input class="form-check-input" type="checkbox" id="ventesterminees" name="ventes" value="ventesterminees">
                        <label for="ventesterminees">ventes terminées</label>
                    </div>
                </div>
            </div>
        </div>
       
	<!-- fin checkbox et radio  -->
		<div class="row gx-4 gx-lg-5">

			<!--   1 cards-->
			<div class="col-md-6 col-lg-4  mb-5">
				<div class="card h-100">
					<div class="card-header">
						Prix : <b>${prix}</b> points
					</div>
					<a href="#"> <img src="https://dummyimage.com/300x200/ccc/555"
						class="card-img-top" alt="PC gamer pour travailler">
					</a>
					<div class="card-body">
						<h5 class="card-title">${nomarticle}</h5>
							
							
							<!--  
                        <p class="card-text">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, 
                            maxime minus quam molestias corporis quod, ea minima accusamus.</p>
                    -->
					</div>
					<ul class="list-group list-group-flush">
						<li class="list-group-item"><i class="fas fa-star"></i> <i
							class="fas fa-star"></i> <i class="far fa-star"></i> <i
							class="far fa-star"></i> <i class="far fa-star"></i></li>
						<li class="list-group-item">Fin de l'enchère : <span
							class="ms-5"><b>${datefin}</b></span></li>
						<li class="list-group-item"><i class="fas fa-map-marker-alt"></i>
							12 rue de la Poste 44100 Nantes</li>
						<li class="list-group-item"><i class="fas fa-user-alt me-3"></i>
							<a href="#">${nomutilisateur}</a></li>
					</ul>
					<div class="card-footer">
						<a class="btn btn-jinyan btn-sm" href="#!">Détail</a>
					</div>
				</div>
			</div>
			<!--   A supprimer -->
			<div class="col-md-6 col-lg-4  mb-3">
				<div class="card h-100">
					<div class="card-header">
						Prix : <b>${prix2}</b> points
					</div>
					<a href="#"> <img src="https://dummyimage.com/300x200/ccc/555"
						class="card-img-top" alt="PC gamer pour travailler">
					</a>
					<div class="card-body">
						<h5 class="card-title">${nomarticle2}</h5>
							<!--  
                            <p class="card-text">
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, 
                                maxime minus quam molestias corporis quod, ea minima accusamus.</p>
                        -->
					</div>
					<ul class="list-group list-group-flush">
						<li class="list-group-item"><i class="fas fa-star"></i> <i
							class="fas fa-star"></i> <i class="far fa-star"></i> <i
							class="far fa-star"></i> <i class="far fa-star"></i></li>
						<li class="list-group-item">Fin de l'enchère : <span
							class="ms-5"><b>${datefin2}</b></span></li>
						<li class="list-group-item"><i class="fas fa-map-marker-alt"></i>
							12 rue de la Poste 44100 Nantes</li>
						<li class="list-group-item"><i class="fas fa-user-alt me-3"></i>
							<a href="#">${nomutilisateur2}</a></li>
					</ul>
					<div class="card-footer">
						<a class="btn btn-jinyan btn-sm" href="#!">Détail</a>
					</div>
				</div>
			</div>
			<div class="col-md-6 col-lg-4  mb-5">
				<div class="card h-100">
					<div class="card-header">
						Prix : <b>${prix3}</b> points
					</div>
					<a href="#"> <img src="https://dummyimage.com/300x200/ccc/555"
						class="card-img-top" alt="PC gamer pour travailler">
					</a>
					<div class="card-body">
						<h5 class="card-title">${nomarticle3}</h5>
							<!--  
                                <p class="card-text">
                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, 
                                    maxime minus quam molestias corporis quod, ea minima accusamus.</p>
                            -->
					</div>
					<ul class="list-group list-group-flush">
						<li class="list-group-item"><i class="fas fa-star"></i> <i
							class="fas fa-star"></i> <i class="far fa-star"></i> <i
							class="far fa-star"></i> <i class="far fa-star"></i></li>
						<li class="list-group-item">Fin de l'enchère : <span
							class="ms-5"><b>${datefin}</b></span></li>
						<li class="list-group-item"><i class="fas fa-map-marker-alt"></i>
							12 rue de la Poste 44100 Nantes</li>
						<li class="list-group-item"><i class="fas fa-user-alt me-3"></i>
							<a href="#">${nomutilisateur}</a></li>
					</ul>
					<div class="card-footer">
						<a class="btn btn-jinyan btn-sm" href="#!">Détail</a>
					</div>
				</div>
			</div>

			<!--   A supprimer FIN -->
		</div>
		<!-- row -->
	</div>
	<!-- Footer-->
	<footer class="py-5  my-navbar mt-2">
		<div class="container  ">

			<p class="m-0  text-white text-center ">
				<!-- <img class="me-3" src="./images/eni.jpg" width="100">-->
				Copyright &copy; ENI Enchère ENI 2021
			</p>
		</div>
	</footer>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>


</body>
</html>