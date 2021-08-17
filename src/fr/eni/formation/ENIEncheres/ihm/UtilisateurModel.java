package fr.eni.formation.ENIEncheres.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Utilisateur;

public class UtilisateurModel {
	private Utilisateur utilisateur;
	private List<Utilisateur> lstUtilisateurs = new ArrayList<>();

	public UtilisateurModel() {
	}

	public UtilisateurModel(Utilisateur utilisateur, List<Utilisateur> lstUtilisateurs) {
		super();
		this.utilisateur = utilisateur;
		this.lstUtilisateurs = lstUtilisateurs;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public List<Utilisateur> getLstUtilisateurs() {
		return lstUtilisateurs;
	}

	public void setLstUtilisateurs(List<Utilisateur> lstUtilisateurs) {
		this.lstUtilisateurs = lstUtilisateurs;
	}

	@Override
	public String toString() {
		return "UtilisateurModel [utilisateur=" + utilisateur + ", lstUtilisateurs=" + lstUtilisateurs + "]";
	}

}
