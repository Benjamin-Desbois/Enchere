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

import fr.eni.formation.ENIEncheres.bll.ArticleManager;
import fr.eni.formation.ENIEncheres.bll.ArticleManagerSingl;
import fr.eni.formation.ENIEncheres.bo.Article;

/**
 * Servlet implementation class DetailVenteServlet
 */
@WebServlet("/DetailVenteServlet")
public class DetailVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArticleManager manager = ArticleManagerSingl.getInstance();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DetailVenteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArticleModel model = null;

		

		try {
			model = new ArticleModel(new Article(), manager.getAllArticles());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int id =Integer.parseInt(request.getParameter("id"));
		
        try {
			model.setArticle(manager.getArticleById(id));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("nom", model.getArticle().getNomArticle());
		request.setAttribute("description", model.getArticle().getDescription());
		request.setAttribute("categorie", model.getArticle().getCategorieArticle());
		request.setAttribute("rue", model.getArticle().getVendeur().getRue());
		request.setAttribute("codePostal", model.getArticle().getVendeur().getCodePostal());
		request.setAttribute("ville", model.getArticle().getVendeur().getVille());
		request.setAttribute("miseAprix", model.getArticle().getMiseAPrix());
		request.setAttribute("finDate", model.getArticle().getDateFinEncheres());
		request.setAttribute("retrait", model.getArticle().getLieuRetrait());
		request.setAttribute("vendeur", model.getArticle().getVendeur().getPseudo());
		

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/detailVente.jsp");
		rd.forward(request, response);
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
