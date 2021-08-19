package fr.eni.formation.ENIEncheres.bll;

public class ArticleManagerSingl {
	public static ArticleManager instance;
	
	public static ArticleManager getInstance() {
		if(instance== null) {
			instance = new ArticleManagerImpl();
		}
		return instance;
	}

}
