package fr.eni.formation.ENIEncheres.dal;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Retrait;

public interface RetraitDAO {
	public void insert(Retrait retrait) throws SQLException;
	
	public List<Retrait> getAll() throws SQLException;
	
}
