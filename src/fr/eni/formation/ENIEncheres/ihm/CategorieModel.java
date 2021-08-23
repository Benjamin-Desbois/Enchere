package fr.eni.formation.ENIEncheres.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Categorie;

public class CategorieModel {
	private Categorie categorie;
	private List<Categorie> lstCategories = new ArrayList<>();
	
public CategorieModel() {
	// TODO Auto-generated constructor stub
}

public CategorieModel(Categorie categorie, List<Categorie> lstCategories) {
	super();
	this.categorie = categorie;
	this.lstCategories = lstCategories;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public List<Categorie> getLstCategories() {
		return lstCategories;
	}

	public void setLstCategories(List<Categorie> lstCategories) {
		this.lstCategories = lstCategories;
	}

	@Override
	public String toString() {
		return "CategorieModel [categorie=" + categorie + ", lstCategories=" + lstCategories + "]";
	}
	
}
