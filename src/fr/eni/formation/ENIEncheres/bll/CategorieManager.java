package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Categorie;

public interface CategorieManager {

	public void addCategories(Categorie categorie) throws BLLException;

	public List<Categorie> getAllCategories() throws SQLException;

}
