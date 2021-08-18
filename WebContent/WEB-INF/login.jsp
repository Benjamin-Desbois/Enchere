<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib prefix="fmt"
uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>ENI-Enchères | Se connecter</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap -->
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
      integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
      crossorigin="anonymous"
    />

    <!-- Custom styles for this template -->
    <link href="css/login.css" rel="stylesheet" />
  </head>

  <body>
	 
	 <form action="LoginServlet" method="post" class="d-flex justify-content-left">
          <input type="submit" value="ENI-Enchères"  />
        </form>
    <div class="container">
      <div class="card card-container d-flex justify-content-center ">
      <img id="profile-img" class="profile-img-card" src="images/user.png" />
        <form action="LoginServlet" method="post" class="form-signin mb-5">
          <div class="groupeFormulaire row mt-3">
            <div class="col-5 d-flex justify-content-center"><label>Identifiant :</label></div>
            <div class="col-7">
              <input
                type="email"
                name="nom"
                id="inputEmail"
                class="form-control"
                placeholder="Adresse mail"
                required
                autofocus
              />
            </div>
          </div>
          <div class="groupeFormulaire row mt-3">
            <div class="col-5 d-flex justify-content-center"><label>Mot de passe :</label></div>
            <div class="col-7">
              <input
                type="password"
                name="password"
                id="inputPassword"
                class="form-control"
                placeholder="******"
                required
              />
            </div>
          </div>
          <div class="groupeFormulaire row mt-3">
            <div class="col-5 d-flex justify-content-center">
              <input class="btn btn-lg btn-primary btn-block btn-signin" type="submit" value="Connexion" class="bouton text-center" />
            </div>
            <div class="col-7 divColumn ">
            <div>
              <label>
                <input type="checkbox" value="remember-me" /> Se souvenir de moi
              </label>
              </div>
              <div class="mt-2">
              <a href="#" class="forgot-password"> Mot de passe oublié? </a>
              </div>
            </div>
          </div>
        </form>
        <form action="InscriptionServlet" method="post" class="d-flex justify-content-center">
          <input type="submit" value="Créer un compte" class="btn btn-lg btn-primary btn-block btn-signin bouton" />
        </form>
        ${message}
      </div>
      <!-- /card-container -->
    </div>
    <!-- /container -->
	
  </body>
</html>
