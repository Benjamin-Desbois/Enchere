package fr.eni.formation.ENIEncheres.dal;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Utilisateur;

public interface UtilisateurDAO {

	public void insert(Utilisateur utilisateur) throws SQLException;
	
	public void update (Utilisateur utilisateur) throws SQLException;
	
	public void delete (Utilisateur utilisateur) throws SQLException;
	
	public List<Utilisateur> getAll() throws SQLException;
	
	
}
