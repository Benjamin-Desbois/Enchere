package fr.eni.formation.ENIEncheres.dal;

import java.sql.SQLException;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Article;

public interface ArticleDAO {

	public void insert(Article article) throws SQLException;

	public List<Article> getAll() throws SQLException;
}
