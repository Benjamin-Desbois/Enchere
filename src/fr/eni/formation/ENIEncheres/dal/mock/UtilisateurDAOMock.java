package fr.eni.formation.ENIEncheres.dal.mock;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Utilisateur;
import fr.eni.formation.ENIEncheres.dal.UtilisateurDAO;

public class UtilisateurDAOMock implements UtilisateurDAO {
	public static List<Utilisateur> lst = new ArrayList<Utilisateur>();	
	
	@Override
	public void insert(Utilisateur utilisateur) {
		lst.add(utilisateur);
	}

	@Override
	public List<Utilisateur> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Utilisateur utilisateur) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Utilisateur utilisateur) throws SQLException {
		// TODO Auto-generated method stub
		
	}


}
