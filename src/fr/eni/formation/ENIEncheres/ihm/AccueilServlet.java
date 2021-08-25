package fr.eni.formation.ENIEncheres.ihm;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.formation.ENIEncheres.bll.ArticleManager;
import fr.eni.formation.ENIEncheres.bll.ArticleManagerSingl;
import fr.eni.formation.ENIEncheres.bo.Article;

/**
 * Servlet implementation class AcceuilServlet
 */
@WebServlet({ "/AccueilServlet" })
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArticleManager manager = ArticleManagerSingl.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccueilServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nextPage = "/WEB-INF/accueilConnecte.jsp";
		ArticleModel model = null;
		ArticleModel deuxiemeModel = null;
		ArticleModel troisiemeModel = null;
		try {
			model = new ArticleModel(new Article(), manager.getAllArticles());
			deuxiemeModel = new ArticleModel(new Article(), manager.getAllArticles());
			troisiemeModel = new ArticleModel(new Article(), manager.getAllArticles());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Article premierArticle = manager.getRandomArticle();
			Article deuxiemeArticle = manager.getRandomArticle();
			Article troisiemeArticle = manager.getRandomArticle();
			while (premierArticle.getNoArticle() == deuxiemeArticle.getNoArticle()) {
				deuxiemeArticle = manager.getRandomArticle();
			}
			while (premierArticle.getNoArticle() == troisiemeArticle.getNoArticle()
					|| troisiemeArticle.getNoArticle() == deuxiemeArticle.getNoArticle()) {
				troisiemeArticle = manager.getRandomArticle();
			}

			model.getArticle().setNomArticle(premierArticle.getNomArticle());
			model.getArticle().setDateFinEncheres(premierArticle.getDateFinEncheres());
			model.getArticle().setMiseAPrix(premierArticle.getMiseAPrix());
			model.getArticle().getVendeur().setPseudo(premierArticle.getVendeur().getPseudo());
			request.setAttribute("nomarticle", model.getArticle().getNomArticle());
			request.setAttribute("datefin", model.getArticle().getDateFinEncheres());
			request.setAttribute("prix", model.getArticle().getMiseAPrix());
			request.setAttribute("nomutilisateur", model.getArticle().getVendeur().getPseudo());
			deuxiemeModel.getArticle().setNomArticle(deuxiemeArticle.getNomArticle());
			deuxiemeModel.getArticle().setDateFinEncheres(deuxiemeArticle.getDateFinEncheres());
			deuxiemeModel.getArticle().setMiseAPrix(deuxiemeArticle.getMiseAPrix());
			deuxiemeModel.getArticle().getVendeur().setPseudo(deuxiemeArticle.getVendeur().getPseudo());
			request.setAttribute("nomarticle2", deuxiemeModel.getArticle().getNomArticle());
			request.setAttribute("datefin2", deuxiemeModel.getArticle().getDateFinEncheres());
			request.setAttribute("prix2", deuxiemeModel.getArticle().getMiseAPrix());
			request.setAttribute("nomutilisateur2", deuxiemeModel.getArticle().getVendeur().getPseudo());
			troisiemeModel.getArticle().setNomArticle(troisiemeArticle.getNomArticle());
			troisiemeModel.getArticle().setDateFinEncheres(troisiemeArticle.getDateFinEncheres());
			troisiemeModel.getArticle().setMiseAPrix(troisiemeArticle.getMiseAPrix());
			troisiemeModel.getArticle().getVendeur().setPseudo(troisiemeArticle.getVendeur().getPseudo());
			request.setAttribute("nomarticle3", troisiemeModel.getArticle().getNomArticle());
			request.setAttribute("datefin3", troisiemeModel.getArticle().getDateFinEncheres());
			request.setAttribute("prix3", troisiemeModel.getArticle().getMiseAPrix());
			request.setAttribute("nomutilisateur3", troisiemeModel.getArticle().getVendeur().getPseudo());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher(nextPage).forward(request, response);
	}

	/**

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
