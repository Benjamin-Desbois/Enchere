package fr.eni.formation.ENIEncheres.bll;

public class RetraitManagerSingl {
	public static RetraitManager instance;
	
	public static RetraitManager getInstance() {
		if(instance== null) {
			instance = new RetraitManagerImpl();
		}
		return instance;
	}
}
