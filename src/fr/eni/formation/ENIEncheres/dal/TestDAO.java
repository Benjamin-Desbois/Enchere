package fr.eni.formation.ENIEncheres.dal;

import java.sql.SQLException;

import fr.eni.formation.ENIEncheres.bo.Utilisateur;

public class TestDAO {

	public static void main(String[] args) throws SQLException {
		System.out.println("1");
		UtilisateurDAO dao = UtilisateurFact.getInstance();
		dao.insert(new Utilisateur("hezi", "Pourtaud" , "Gignac" , "pourtaud.gignac2021jajoutedestrucs@gmail.com" , "0682456978" , "30 all�e des mimosas" , "44000", "Nantes", "mamoutte" , 0 , false));
		
		//System.out.println(dao.getAll());

	}

}