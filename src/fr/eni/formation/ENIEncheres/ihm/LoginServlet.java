package fr.eni.formation.ENIEncheres.ihm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nextPage = "/WEB-INF/login.jsp";

		if (request.getParameter("nom") != null && request.getParameter("password") != null) {
			// mise en session du nom si non vide
			if ("".equals(request.getParameter("nom"))) {
				request.setAttribute("message", "le nom ne peux pas être vide");
				if ("".equals(request.getParameter("password"))) {
					request.setAttribute("message", "Veuillez indiquer un nom d'utilisateur et un mot de passe");
				}
			} else {
				request.getSession().setAttribute("nom", request.getParameter("nom"));
				request.getSession().setAttribute("password", request.getParameter("password"));
				if ("".equals(request.getParameter("password"))) {
					request.setAttribute("message", "Veuillez indiquer un mot de passe");
				}
				if (request.getParameter("password") == null) {
					nextPage = "/GuessServlet";
				}
			}
		}
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
