package fr.eni.formation.ENIEncheres.dal;

import fr.eni.formation.ENIEncheres.dal.jdbc.ArticleDAOImpl;

public class ArticleFact {
	public static ArticleDAO getInstance() {
		return new ArticleDAOImpl();
		
	}
}
