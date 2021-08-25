package fr.eni.formation.ENIEncheres.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Article;

public class ArticleModel {
	private Article article;
	private List<Article> lstArticles = new ArrayList<>();
	
	public ArticleModel() {
	}

	public ArticleModel(Article article, List<Article> lstArticles) {
		super();
		this.article = article;
		this.lstArticles = lstArticles;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public List<Article> getLstArticles() {
		return lstArticles;
	}

	public void setLstArticles(List<Article> lstArticles) {
		this.lstArticles = lstArticles;
	}

	@Override
	public String toString() {
		return "ArticleModel [article=" + article + ", lstArticles=" + lstArticles + "]";
	}
	
	
}
