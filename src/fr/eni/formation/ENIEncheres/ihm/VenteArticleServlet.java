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
import fr.eni.formation.ENIEncheres.bll.CategorieManager;
import fr.eni.formation.ENIEncheres.bll.CategorieManagerSingl;
import fr.eni.formation.ENIEncheres.bll.RetraitManager;
import fr.eni.formation.ENIEncheres.bll.RetraitManagerSingl;
import fr.eni.formation.ENIEncheres.bll.UtilisateurManager;
import fr.eni.formation.ENIEncheres.bll.UtilisateurManagerSingl;
import fr.eni.formation.ENIEncheres.bo.Article;
import fr.eni.formation.ENIEncheres.bo.Categorie;
import fr.eni.formation.ENIEncheres.bo.Retrait;
import fr.eni.formation.ENIEncheres.bo.Utilisateur;

/**
 * Servlet implementation class VenteArticleServlet
 */
@WebServlet("/VenteArticleServlet")
public class VenteArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArticleManager manager = ArticleManagerSingl.getInstance();
	private RetraitManager retraitManager = RetraitManagerSingl.getInstance();
	private CategorieManager categorieManager = CategorieManagerSingl.getInstance();
	private UtilisateurManager Utilisateurmanager = UtilisateurManagerSingl.getInstance();

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
		String nextPage = "/WEB-INF/venteArticle.jsp";
		ArticleModel model = null;
		RetraitModel retraitModel = null;
		CategorieModel categorieModel = null;
		UtilisateurModel utilisateurModel = null;
		boolean valide = true;
		try {
			model = new ArticleModel(new Article(), manager.getAllArticles());
			retraitModel = new RetraitModel(new Retrait(), retraitManager.getAllRetraits());
			categorieModel = new CategorieModel(new Categorie(), categorieManager.getAllCategories());
			utilisateurModel = new UtilisateurModel(new Utilisateur(), Utilisateurmanager.getAllUtilisateurs());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (request.getParameter("nom") != null) {
			HttpSession session = request.getSession();
			model.getArticle().setNomArticle(request.getParameter("nom"));
			model.getArticle().setDescription(request.getParameter("description"));
			model.getArticle().setDateDebutEncheres(LocalDateTime.parse(request.getParameter("dateDebut")));
			model.getArticle().setDateFinEncheres(LocalDateTime.parse(request.getParameter("dateFin")));
			model.getArticle().setMiseAPrix(Integer.parseInt(request.getParameter("prix")));
			categorieModel.getCategorie().setLibelle(request.getParameter("categorie"));
			retraitModel.getRetrait().setRue(request.getParameter("adresse"));
			retraitModel.getRetrait().setCode_postal(request.getParameter("codePostal"));
			retraitModel.getRetrait().setVille(request.getParameter("ville"));
			utilisateurModel.getUtilisateur().setNoUtilisateur(Integer.parseInt((String) session.getAttribute("NoUtilisateur")));

			nextPage = "/WEB-INF/accueil.jsp";
			try {
				model.setLstArticles(manager.getAllArticles());
				manager.addArticles(model.getArticle());
				System.out.println("je tente");
			} catch (SQLException | BLLException e) {
				e.printStackTrace();
			}
		}

		request.setAttribute("model", model);
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
