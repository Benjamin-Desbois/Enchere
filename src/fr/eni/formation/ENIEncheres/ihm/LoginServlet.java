package fr.eni.formation.ENIEncheres.ihm;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.formation.ENIEncheres.bll.UtilisateurManager;
import fr.eni.formation.ENIEncheres.bll.UtilisateurManagerSingl;
import fr.eni.formation.ENIEncheres.bo.Utilisateur;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurManager manager = UtilisateurManagerSingl.getInstance();

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nextPage = "/WEB-INF/logIn.jsp";
		UtilisateurModel model = null;
		boolean existe = true;

		try {
			model = new UtilisateurModel(new Utilisateur(), manager.getAllUtilisateurs());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if ("".equals(request.getParameter("nom"))) {
			request.setAttribute("message", "le nom ne peux pas �tre vide");
			if ("".equals(request.getParameter("password"))) {
				request.setAttribute("message", "Veuillez indiquer un nom d'utilisateur et un mot de passe");
			}
		} else {
			request.getSession().setAttribute("nom", request.getParameter("nom"));
			request.getSession().setAttribute("password", request.getParameter("password"));
			if ("".equals(request.getParameter("password"))) {
				request.setAttribute("message", "Veuillez indiquer un mot de passe");
			}
			if (request.getParameter("password") == null) {
				nextPage = "/WEB-INF/logIn.jsp";
			}
		}
		model.getUtilisateur().setPseudo(request.getParameter("nom"));
		model.getUtilisateur().setMotDePasse(request.getParameter("password"));
		try {
			existe = manager.isExist(model.getUtilisateur());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (existe) {
			HttpSession session = request.getSession();
			request.getSession().setAttribute("NoUtilisateur", request.getParameter(""));
			session.setAttribute("NoUtilisateur", model.getUtilisateur());
			System.out.println("je passe par là");
			nextPage = "/WEB-INF/accueil.jsp";
		} else {
			request.setAttribute("message", "L'association du pseudo et du mot de passe n'existe pas");
		}

		if (request.getParameter("s'inscrire") != null) {
			nextPage = "/WEB-INF/inscription.jsp";
		}

		request.getRequestDispatcher(nextPage).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
