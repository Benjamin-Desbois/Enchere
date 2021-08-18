package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Utilisateur;
import fr.eni.formation.ENIEncheres.dal.UtilisateurDAO;
import fr.eni.formation.ENIEncheres.dal.UtilisateurFact;

public class UtilisateurManagerImpl implements UtilisateurManager {
	public UtilisateurDAO dao = UtilisateurFact.getInstance();

	@Override
	public void addUtilisateur(Utilisateur utilisateur) throws UtilisateurManagerException {

		Boolean valide = true;
		try {
			List<Utilisateur> lstUtilisateur = dao.getAll();

			for (Utilisateur util : lstUtilisateur) {
				if (util.getPseudo().equals(utilisateur.getPseudo())) {
					valide = false;
					System.out.println("Le pseudo est déjà attribué");
					// TODO Faire remonter l'erreur.
					break;
				}
				if (util.getEmail().equals(utilisateur.getEmail())) {
					valide = false;
					System.out.println("Cette adresse mail est déjà utilisée");
					// TODO Faire remonter l'erreur.
					break;
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			if (valide) {
				dao.insert(utilisateur);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Utilisateur> getAllUtilisateurs() throws UtilisateurManagerException {
		try {
			return dao.getAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean isExist(Utilisateur utilisateur) throws UtilisateurManagerException, SQLException {
		boolean existe = false;
		List<Utilisateur> lstUtilisateur = dao.getAll();
		for (Utilisateur util : lstUtilisateur) {
			if (util.getPseudo().equals(utilisateur.getPseudo())
					& util.getMotDePasse().equals(utilisateur.getMotDePasse())) {
				existe = true;
				
				break;
			}

		}
		return existe;

	}
}
