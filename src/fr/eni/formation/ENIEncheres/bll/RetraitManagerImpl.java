package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Article;
import fr.eni.formation.ENIEncheres.bo.Retrait;
import fr.eni.formation.ENIEncheres.dal.RetraitDAO;
import fr.eni.formation.ENIEncheres.dal.RetraitFact;

public class RetraitManagerImpl implements RetraitManager {
	public RetraitDAO dao = RetraitFact.getInstance();

	@Override
	public void addRetraits(Retrait retrait) throws BLLException {
		try {
			dao.insert(retrait);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Retrait> getAllRetraits() throws SQLException {

		return dao.getAll();
	}

}
