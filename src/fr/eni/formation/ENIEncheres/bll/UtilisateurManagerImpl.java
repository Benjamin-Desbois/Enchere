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
		if(utilisateur.getPseudo().equals(utilisateur.getPseudo())) {
			throw new UtilisateurManagerException("Le pseudo est déjà pris");
		}
		try {
			dao.insert(utilisateur);
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
