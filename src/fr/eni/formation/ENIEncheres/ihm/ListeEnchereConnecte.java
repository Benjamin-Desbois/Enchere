package fr.eni.formation.ENIEncheres.ihm;

import java.io.IOException;
import java.sql.SQLException;

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
 * Servlet implementation class ListeEnchereConnecte
 */
@WebServlet("/ListeEnchereConnecte")
public class ListeEnchereConnecte extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArticleManager manager = ArticleManagerSingl.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeEnchereConnecte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage = "/WEB-INF/accueilConnecte.jsp";
		ArticleModel model = null;
		try {
			model = new ArticleModel(new Article(), manager.getAllArticles());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("t'es là ?");
			model.getArticle().setNomArticle(manager.getRandomArticle().getNomArticle());
			request.setAttribute("nomarticle", model.getArticle().getNomArticle());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session = request.getSession(true);
		
		if(session.getAttribute("NoUtilisateur") == null ){  
            this.getServletContext().getRequestDispatcher("/AccueilServlet").forward(request, response);
        }
		
		if (request.getParameter("profil") != null) {
			nextPage = "/WEB-INF/afficherMonProfil.jsp";
		}
		
		
		
		request.getRequestDispatcher(nextPage).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
