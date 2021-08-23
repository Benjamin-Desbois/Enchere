package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Retrait;

public interface RetraitManager {
	public void addRetraits(Retrait retrait) throws BLLException;

	public List<Retrait> getAllRetraits() throws SQLException;
}
