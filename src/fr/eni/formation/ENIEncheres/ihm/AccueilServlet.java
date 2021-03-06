package fr.eni.formation.ENIEncheres.ihm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		try {

			request.setAttribute("lstArticle", manager.getAllArticles());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher(nextPage).forward(request, response);
	}

	/**
	 * 
	 * /**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nextPage = "/WEB-INF/accueilConnecte.jsp";
		try {
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//			for (Article art : manager.getAllArticles()) {
//				art.setDateFinEncheres(LocalDateTime.parse(art.getDateDebutEncheres().format(formatter)));
//			}
			List<Article> lstArticle = new ArrayList<>();
			String parameter = null;
			parameter = request.getParameter("type");
			if ("achats".equals(parameter)) {
				for (Article article : manager.getAllArticles()) {
					if (article.getVendeur()
							.getNoUtilisateur() != (int) request.getSession().getAttribute("NoUtilisateur")) {
						lstArticle.add(article);
					}
				}
			} else if ("vente".equals(parameter)) {
				for (Article article : manager.getAllArticles()) {
					if (article.getVendeur()
							.getNoUtilisateur() == (int) request.getSession().getAttribute("NoUtilisateur")) {
						lstArticle.add(article);
					}
				}
			} else {
				lstArticle = manager.getAllArticles();
			}
			request.setAttribute("lstArticle", lstArticle);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher(nextPage).forward(request, response);
	}

}
