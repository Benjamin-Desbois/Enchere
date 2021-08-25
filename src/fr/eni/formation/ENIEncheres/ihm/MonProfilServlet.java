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
 * Servlet implementation class MonProfilServlet
 */
@WebServlet("/MonProfilServlet")
public class MonProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurManager manager = UtilisateurManagerSingl.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MonProfilServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UtilisateurModel model = null;
		
		HttpSession session = request.getSession();

		try {
			model = new UtilisateurModel(new Utilisateur(), manager.getAllUtilisateurs());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			model.setUtilisateur(manager.getSelectById((Integer) session.getAttribute("NoUtilisateur")));
			request.setAttribute("pseudo",model.getUtilisateur().getPseudo());
			System.out.println(model.getUtilisateur().getPseudo());
			request.setAttribute("nom",model.getUtilisateur().getNom());
			System.out.println(model.getUtilisateur().getNom());
			request.setAttribute("prenom",model.getUtilisateur().getPrenom());
			request.setAttribute("email",model.getUtilisateur().getEmail());
			request.setAttribute("telephone",model.getUtilisateur().getTelephone());
			request.setAttribute("rue",model.getUtilisateur().getRue());
			System.out.println(model.getUtilisateur().getRue());
			request.setAttribute("codepostal",model.getUtilisateur().getCodePostal());
			request.setAttribute("ville",model.getUtilisateur().getVille());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/afficherMonProfil.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nextPage = "ModifierMonProfilServlet";
		request.getRequestDispatcher(nextPage).forward(request, response);
	}

}
