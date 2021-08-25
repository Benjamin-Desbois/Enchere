package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Utilisateur;

public interface UtilisateurManager {
	public void addUtilisateur(Utilisateur utilisateur) throws BLLException;

	public List<Utilisateur> getAllUtilisateurs() throws SQLException;

	public boolean isExist(Utilisateur utilisateur) throws SQLException;

	public boolean isAlphanumeric(String pseudo);

	public Utilisateur getSelectById(int id) throws SQLException;
}
