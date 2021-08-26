package fr.eni.formation.ENIEncheres.ihm;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.formation.ENIEncheres.bll.ArticleManager;
import fr.eni.formation.ENIEncheres.bll.ArticleManagerSingl;
import fr.eni.formation.ENIEncheres.bll.BLLException;
import fr.eni.formation.ENIEncheres.bll.RetraitManager;
import fr.eni.formation.ENIEncheres.bll.RetraitManagerSingl;
import fr.eni.formation.ENIEncheres.bo.Article;
import fr.eni.formation.ENIEncheres.bo.Retrait;

/**
 * Servlet implementation class VenteArticleServlet
 */
@WebServlet("/VenteArticleServlet")
public class VenteArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArticleManager manager = ArticleManagerSingl.getInstance();
	private RetraitManager retraitManager = RetraitManagerSingl.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VenteArticleServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nextPage = "/WEB-INF/ventearticle.jsp";
		request.getRequestDispatcher(nextPage).forward(request, response);
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nextPage = "/WEB-INF/ventearticle.jsp";
		ArticleModel model = null;
		RetraitModel retraitModel = null;
		boolean isForward = false;
		try {
			model = new ArticleModel(new Article(), manager.getAllArticles());
			retraitModel = new RetraitModel(new Retrait(), retraitManager.getAllRetraits());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		String today = String.valueOf(LocalDateTime.now());
		request.setAttribute("dateDebutEnchere", today);
		request.setAttribute("dateFinEnchere", today);
		if (request.getParameter("nom") != null) {
			HttpSession session = request.getSession();
			
			model.getArticle().setNomArticle(request.getParameter("nom"));
			model.getArticle().setDescription(request.getParameter("description"));
			model.getArticle().setDateDebutEncheres(LocalDateTime.parse(request.getParameter("dateDebut")));
			model.getArticle().setDateFinEncheres(LocalDateTime.parse(request.getParameter("dateFin")));
			model.getArticle().setMiseAPrix(Integer.parseInt(request.getParameter("prix")));
			retraitModel.getRetrait().setRue(request.getParameter("adresse"));
			retraitModel.getRetrait().setCode_postal(request.getParameter("codePostal"));
			retraitModel.getRetrait().setVille(request.getParameter("ville"));
			model.getArticle().getVendeur().setNoUtilisateur((Integer) session.getAttribute(("NoUtilisateur")));
			switch (request.getParameter("categorie")) {
			case "Mobilier":
				model.getArticle().getCategorieArticle().setNoCategorie(1);
				break;
			case "Vehicule":
				model.getArticle().getCategorieArticle().setNoCategorie(2);
				break;
			case "Electronique":
				model.getArticle().getCategorieArticle().setNoCategorie(3);
				break;
			case "Autre":
				model.getArticle().getCategorieArticle().setNoCategorie(4);
				break;
			default:
				System.out.println("Sélectionnez une catégorie");
				isForward = true;

			}

			nextPage = "AccueilServlet";
			try {
				// Futures contraintes
				model.setLstArticles(manager.getAllArticles());
				// Ajout dans la BDD
				manager.addArticles(model.getArticle());
				System.out.println("Ajout réussi (j'espère)");
			} catch (SQLException | BLLException e) {
				e.printStackTrace();
			}
		}
		if (isForward) {
			request.getRequestDispatcher("WEB-INF/ventearticle.jsp").forward(request, response);
		} else {
			response.sendRedirect(nextPage);
		}
	}

}
