package fr.eni.formation.ENIEncheres.dal;

import fr.eni.formation.ENIEncheres.dal.jdbc.UtilisateurDAOImpl;

public class UtilisateurFact {
	public static UtilisateurDAO getInstance() {
		return new UtilisateurDAOImpl();
		
	}

}
