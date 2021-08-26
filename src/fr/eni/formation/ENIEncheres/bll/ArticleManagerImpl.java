package fr.eni.formation.ENIEncheres.bll;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import fr.eni.formation.ENIEncheres.bo.Article;
import fr.eni.formation.ENIEncheres.dal.ArticleDAO;
import fr.eni.formation.ENIEncheres.dal.ArticleFact;

public class ArticleManagerImpl implements ArticleManager {
	public ArticleDAO dao = ArticleFact.getInstance();

	@Override
	public void addArticles(Article article) throws BLLException {
		Boolean valide = true;
		if (article.getDateDebutEncheres().isAfter(article.getDateFinEncheres())) {
			valide = false;
			throw new BLLException("L'enchère ne peut pas commencer après la fin de l'enchère !");
		}
		if (article.getMiseAPrix()<=0) {
			valide = false;
			throw new BLLException("Le prix ne peut pas être inférieur à 10 points");
		}
		if (article.getDateDebutEncheres().isBefore(LocalDateTime.now())) {
			valide = false;
			throw new BLLException("Cet horaire est déjà dépassé");
		}
		
		try {
			if (valide) {
				dao.insert(article);
			}
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
		int max = 12;
		int aleatoire = rdm.nextInt(max - min) + min;
		List<Article> lstArticles = dao.getAll();
		for (Article art : lstArticles) {
			if (aleatoire == art.getNoArticle()) {
				article = art;
			}
		}
		return article;

	}

	public Article getArticleById(int id) throws SQLException {
		Article article = new Article();
		List<Article> lstArticles = dao.getAll();
		for (Article art : lstArticles) {
			if (id == art.getNoArticle()) {
				article = art;
			}

		}
		return article;

	}

}
