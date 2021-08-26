package fr.eni.formation.ENIEncheres.ihm;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.formation.ENIEncheres.bll.BLLException;
import fr.eni.formation.ENIEncheres.bll.UtilisateurManager;
import fr.eni.formation.ENIEncheres.bll.UtilisateurManagerSingl;
import fr.eni.formation.ENIEncheres.bo.Utilisateur;

/**
 * Servlet implementation class ModifierMonProfilServlet
 */
@WebServlet("/ModifierMonProfilServlet")
public class ModifierMonProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UtilisateurManager manager = UtilisateurManagerSingl.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierMonProfilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage = "/WEB-INF/modifierMonProfil.jsp";

		request.getRequestDispatcher(nextPage).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextPage = "ModifierMonProfilServlet";
		UtilisateurModel model = null;
		boolean isForward = false;
		boolean valide = true;
		
		HttpSession session = request.getSession();
	
		try {
			model = new UtilisateurModel(new Utilisateur(), manager.getAllUtilisateurs());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			model.setUtilisateur(manager.getSelectById((Integer) session.getAttribute("NoUtilisateur")));
			System.out.println(session.getAttribute("NoUtilisateur"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (request.getParameter("pseudo") != null) {
			model.getUtilisateur().setPseudo(request.getParameter("pseudo"));
			model.getUtilisateur().setNom(request.getParameter("nom"));
			System.out.println(model.getUtilisateur().getNom());
			model.getUtilisateur().setPrenom(request.getParameter("prenom"));
			model.getUtilisateur().setEmail(request.getParameter("email"));
			model.getUtilisateur().setTelephone(request.getParameter("telephone"));
			model.getUtilisateur().setRue(request.getParameter("rue"));
			model.getUtilisateur().setCodePostal(request.getParameter("codepostal"));
			model.getUtilisateur().setVille(request.getParameter("ville"));
			model.getUtilisateur().setMotDePasse(request.getParameter("motdepasse"));

			if (manager.isAlphanumeric(request.getParameter("pseudo"))) {
				request.setAttribute("message", "Le pseudo ne peut contenir de caractères spéciaux");
				isForward = true;

			} else {
				if (request.getParameter("pseudo") == null) {
					request.setAttribute("message", "Veuillez remplir tous les champs");
					isForward = true;
				} else {
					try {
						manager.updateUtilisateur(model.getUtilisateur());
					} catch (BLLException e) {
						request.setAttribute("message", e.getMessage());
						System.out.println("pas mis à jour");
						isForward = true;
						valide = false;

					}
					if (valide) {
						try {
							model.setLstUtilisateurs(manager.getAllUtilisateurs());
							nextPage = "MonProfilServlet";
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

		
		request.setAttribute("model", model);
		if (isForward) {
			request.getRequestDispatcher("/WEB-INF/modifierMonProfil.jsp").forward(request, response);
		} else {
			response.sendRedirect(nextPage);
		}
	}
	}

}
