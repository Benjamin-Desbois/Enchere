package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Article;
import fr.eni.formation.ENIEncheres.dal.ArticleDAO;
import fr.eni.formation.ENIEncheres.dal.ArticleFact;

public class ArticleManagerImpl implements ArticleManager {
	public ArticleDAO dao = ArticleFact.getInstance();

	@Override
	public void addArticles(Article article) throws BLLException {
		try {
			dao.insert(article);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Article> getAllArticles() throws SQLException {
		
		return dao.getAll();
	}

}
