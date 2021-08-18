package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Utilisateur;


public interface UtilisateurManager {
	public void addUtilisateur(Utilisateur utilisateur) throws UtilisateurManagerException;
	public List<Utilisateur> getAllUtilisateurs() throws UtilisateurManagerException;
}
