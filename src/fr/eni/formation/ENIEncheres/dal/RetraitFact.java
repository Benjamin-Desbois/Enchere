package fr.eni.formation.ENIEncheres.dal;

import fr.eni.formation.ENIEncheres.dal.jdbc.RetraitDAOImpl;

public class RetraitFact {
	public static RetraitDAO getInstance() {
		return new RetraitDAOImpl();
		
	}
}
