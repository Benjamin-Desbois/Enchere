package fr.eni.formation.ENIEncheres.ihm;

import java.util.ArrayList;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Retrait;

public class RetraitModel {
	private Retrait retrait;
	private List<Retrait> lstRetraits = new ArrayList<>();
	
	public RetraitModel() {
		// TODO Auto-generated constructor stub
	}

	public RetraitModel(Retrait retrait, List<Retrait> lstRetraits) {
		super();
		this.retrait = retrait;
		this.lstRetraits = lstRetraits;
	}

	public Retrait getRetrait() {
		return retrait;
	}

	public void setRetrait(Retrait retrait) {
		this.retrait = retrait;
	}

	public List<Retrait> getLstRetraits() {
		return lstRetraits;
	}

	public void setLstRetraits(List<Retrait> lstRetraits) {
		this.lstRetraits = lstRetraits;
	}

	@Override
	public String toString() {
		return "RetraitModel [retrait=" + retrait + ", lstRetraits=" + lstRetraits + "]";
	}
	
	

}
