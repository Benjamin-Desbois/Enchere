package fr.eni.formation.ENIEncheres.ihm;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.formation.ENIEncheres.bll.ArticleManager;
import fr.eni.formation.ENIEncheres.bll.ArticleManagerSingl;
import fr.eni.formation.ENIEncheres.bo.Article;
import fr.eni.formation.ENIEncheres.bo.Retrait;

/**
 * Servlet implementation class VenteArticleServlet
 */
@WebServlet("/VenteArticleServlet")
public class VenteArticleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArticleManager manager = ArticleManagerSingl.getInstance();

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
		boolean valide = true;
		try {
			model = new ArticleModel(new Article(), manager.getAllArticles());
			//retraitModel = new RetraitModel(new Retrait(),managerRetrait.getAllRetraits());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (request.getParameter("nom") != null) {
			model.getArticle().setNomArticle(request.getParameter("nom"));
			model.getArticle().setDescription(request.getParameter("description"));
			model.getArticle().setDateDebutEncheres(LocalDate.parse(request.getParameter("dateDebut")));
			model.getArticle().setDateFinEncheres(LocalDate.parse(request.getParameter("dateFin")));
			model.getArticle().setMiseAPrix(Integer.parseInt(request.getParameter("prix")));
			retraitModel.getRetrait().setRue(request.getParameter("adresse"));
			retraitModel.getRetrait().setCode_postal(request.getParameter("codePostal"));
			retraitModel.getRetrait().setVille(request.getParameter("ville"));
		}

		model.getArticle().setNomArticle(request.getParameter("nom"));
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
