package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

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

	@Override
	public Article getRandomArticle() throws SQLException {
		Article article = new Article();
		Random rdm = new Random();
		int min = 3;
		int max = 5;
		int aleatoire = rdm.nextInt(max - min) + min;
		List<Article> lstArticles = dao.getAll();
		for (Article art : lstArticles) {
			System.out.println(art.getNoArticle());
			if (5 == art.getNoArticle()) {
				article = art;
			}
		}
		return article;

	}

}
