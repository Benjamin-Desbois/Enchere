package fr.eni.formation.ENIEncheres.bo;

import java.time.LocalDate;

public class Enchere {

	private LocalDate dateEnchere;
	private String montant_enchere;
	private Utilisateur acheteur;
	private Article article;

	public Enchere() {
	}

	public Enchere(LocalDate dateEnchere, String montant_enchere) {
		super();
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
	}

	public LocalDate getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public String getMontant_enchere() {
		return montant_enchere;
	}

	public void setMontant_enchere(String montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	public Utilisateur getAcheteur() {
		return acheteur;
	}

	public void setAcheteur(Utilisateur acheteur) {
		this.acheteur = acheteur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "Enchere [dateEnchere=" + dateEnchere + ", montant_enchere=" + montant_enchere + ", acheteur=" + acheteur
				+ ", article=" + article + "]";
	}

}
