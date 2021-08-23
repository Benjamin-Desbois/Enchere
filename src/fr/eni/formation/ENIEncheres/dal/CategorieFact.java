package fr.eni.formation.ENIEncheres.dal;

import fr.eni.formation.ENIEncheres.dal.jdbc.CategorieDAOImpl;

public class CategorieFact {
	
	
		public static CategorieDAO getInstance() {
			return new CategorieDAOImpl();
			
		
		}
}
