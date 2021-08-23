package fr.eni.formation.ENIEncheres.dal;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Categorie;

public interface CategorieDAO {

	public void insert(Categorie categorie) throws SQLException;
	
	public List<Categorie> getAll() throws SQLException;
}
