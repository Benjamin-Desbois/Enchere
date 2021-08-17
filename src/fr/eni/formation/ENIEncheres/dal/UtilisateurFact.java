package fr.eni.formation.ENIEncheres.dal;

public class UtilisateurFact {
	public static UtilisateurDAO getInstance() {
		return new UtilisateurDAOMock();
		
	}

}
