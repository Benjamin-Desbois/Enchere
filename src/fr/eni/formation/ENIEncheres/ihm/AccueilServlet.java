package fr.eni.formation.ENIEncheres.ihm;

import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

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
	
		try {
			model = new ArticleModel(new Article(), manager.getAllArticles());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		try {

			request.setAttribute("lstArticle",  manager.getAllArticles());
//			for (Article art : manager.getAllArticles()) {
//				
//				model.setArticle(manager.getArticleById((Integer) art.getNoArticle()));
//				String str1 = "nomarticle";
//				String srt2 = String.valueOf(i);
//				String result = str1+srt2;
//				request.setAttribute(result, model.getArticle().getNomArticle());
//				str1 = "datefin";
//				result = str1+srt2;
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//				request.setAttribute(result, model.getArticle().getDateFinEncheres().format(formatter));
//				str1 = "prix";
//				result = str1+srt2;
//				request.setAttribute(result, model.getArticle().getMiseAPrix());
//				str1 = "nomutilisateur";
//				result = str1+srt2;
//				request.setAttribute(result, model.getArticle().getVendeur().getPseudo());
//				i++;
//				
//			}
			
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
