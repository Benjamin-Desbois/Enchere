package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Article;

public interface ArticleManager {
	public Article getRandomArticle() throws SQLException;

	public void addArticles(Article article) throws BLLException;

	public List<Article> getAllArticles() throws SQLException;

}
