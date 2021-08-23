package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Categorie;
import fr.eni.formation.ENIEncheres.dal.CategorieDAO;
import fr.eni.formation.ENIEncheres.dal.CategorieFact;

public class CategorieManagerImpl implements CategorieManager {
	public CategorieDAO dao = CategorieFact.getInstance();

	@Override
	public void addCategories(Categorie categorie) throws BLLException {
		try {
			dao.insert(categorie);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Categorie> getAllCategories() throws SQLException {
		return dao.getAll();	}

}
