package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import fr.eni.formation.ENIEncheres.bo.Utilisateur;
import fr.eni.formation.ENIEncheres.dal.UtilisateurDAO;
import fr.eni.formation.ENIEncheres.dal.UtilisateurFact;

public class UtilisateurManagerImpl implements UtilisateurManager {
	public UtilisateurDAO dao = UtilisateurFact.getInstance();

	@Override
	public void addUtilisateur(Utilisateur utilisateur) throws BLLException {

		Boolean valide = true;
		try {
			List<Utilisateur> lstUtilisateur = dao.getAll();

			for (Utilisateur util : lstUtilisateur) {
				if (util.getPseudo().equals(utilisateur.getPseudo())) {
					valide = false;
					throw new BLLException("Le pseudo est déjà attribué");
				}
				if (util.getEmail().equals(utilisateur.getEmail())) {
					valide = false;
					throw new BLLException("Cette adresse mail est déjà utilisée");
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
	public List<Utilisateur> getAllUtilisateurs() {
		try {
			return dao.getAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean isExist(Utilisateur utilisateur) throws SQLException {
		Boolean existe = false;
		List<Utilisateur> lstUtilisateur = dao.getAll();
		for (Utilisateur util : lstUtilisateur) {
			if (util.getPseudo().equals(utilisateur.getPseudo()) || util.getEmail().equals(utilisateur.getPseudo())) {
				if (util.getMotDePasse().equals(utilisateur.getMotDePasse())) {

					existe = true;

					break;
				}
			}
		}
		return existe;

	}

	public boolean isAlphanumeric(String pseudo) {
		boolean alpha = false;
		Pattern pattern;
		Matcher matcher;
		pattern = Pattern.compile("[^a-zA-Z0-9]");
		matcher = pattern.matcher(pseudo);
		if (matcher.find()) {
			alpha = true;
		}

		return alpha;

	}

	@Override
	public Utilisateur getSelectById(int id) throws SQLException {
		Utilisateur utilisateur = new Utilisateur();
		List<Utilisateur> lstUtilisateur = dao.getAll();
		for (Utilisateur user : lstUtilisateur) {
			if (id == user.getNoUtilisateur()) {
				utilisateur = user;
			}
		}
		return utilisateur;
	}

	@Override
	public void updateUtilisateur(Utilisateur utilisateur) throws BLLException {
		Boolean valide = true;
		try {
			List<Utilisateur> lstUtilisateur = dao.getAll();

			for (Utilisateur util : lstUtilisateur) {
				if (util.getPseudo().equals(utilisateur.getPseudo())) {
					valide = false;
					throw new BLLException("Le pseudo est déjà attribué");
				}
				if (util.getEmail().equals(utilisateur.getEmail())) {
					valide = false;
					throw new BLLException("Cette adresse mail est déjà utilisée");
				}
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			if (valide) {
				dao.update(utilisateur);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteUtilisateur(Utilisateur utilisateur) throws SQLException {
		dao.delete(utilisateur);
	}
}
