package fr.eni.formation.ENIEncheres.bll;

public class CategorieManagerSingl {
	public static CategorieManager instance;
	
	public static CategorieManager getInstance() {
		if(instance== null) {
			instance = new CategorieManagerImpl();
		}
		return instance;
	}
}
