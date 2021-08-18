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
			for (Utilisateur util : dao.getAll()) {
				System.out.println("boucle");
				if (util.getPseudo().equals(utilisateur.getPseudo())) {
					valide = false;
					System.out.println("Pas deux fois le m�me pseudo");
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

}
