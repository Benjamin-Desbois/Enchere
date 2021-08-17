package fr.eni.formation.ENIEncheres.bll;

public class UtilisateurManagerSingl {
	public static UtilisateurManager instance;
	
	public static UtilisateurManager getInstance() {
		if(instance== null) {
			instance = new UtilisateurManagerImpl();
		}
		return instance;
	}

}
