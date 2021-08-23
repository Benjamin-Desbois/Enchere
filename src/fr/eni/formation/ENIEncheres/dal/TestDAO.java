package fr.eni.formation.ENIEncheres.dal;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Article;
import fr.eni.formation.ENIEncheres.bo.Categorie;
import fr.eni.formation.ENIEncheres.bo.Retrait;
import fr.eni.formation.ENIEncheres.bo.Utilisateur;

public class TestDAO {

	public static void main(String[] args) throws SQLException {
		System.out.println("1");
		Utilisateur vendeur = new Utilisateur(1, "hezi", "Pourtaud" , "Gignac" , "pourtaud.gignac2021jajoutedestrucs@gmail.com" , "0682456978" , "30 allée des mimosas" , "44000", "Nantes", "mamoutte" , 0 , false);
		Utilisateur acheteur = new Utilisateur();
		Categorie cat = new Categorie(50, "oui");
		String date = "2021-11-05 10:50:05";
		String dateFin = "2021-11-07 10:50:05";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		LocalDateTime localDate = LocalDateTime.parse(date, formatter);
		LocalDateTime localDateFin = LocalDateTime.parse(dateFin, formatter);
		UtilisateurDAO dao = UtilisateurFact.getInstance();
		dao.insert(new Utilisateur("hezi", "Pourtaud" , "Gignac" , "pourtaud.gignac2021jajoutedestrucs@gmail.com" , "0682456978" , "30 allée des mimosas" , "44000", "Nantes", "mamoutte" , 0 , false));
		ArticleDAO articleDAO = ArticleFact.getInstance();
		articleDAO.insert(new Article("table", "C'est une table", localDate, localDateFin, 150, null, "Non-vendu", (List<Retrait>)null, vendeur, acheteur, cat));
		//System.out.println(dao.getAll());

	}
	

}