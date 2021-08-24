package fr.eni.formation.ENIEncheres.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Article;
import fr.eni.formation.ENIEncheres.bo.Utilisateur;
import fr.eni.formation.ENIEncheres.dal.ArticleDAO;
import fr.eni.formation.ENIEncheres.dal.UtilisateurDAO;
import fr.eni.formation.ENIEncheres.dal.UtilisateurFact;

public class ArticleDAOImpl implements ArticleDAO {
	private final String INSERT = "INSERT INTO ARTICLES_VENDUS(nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, no_utilisateur, no_categorie) VALUES (?,?,?,?,?,?,?)";
	private final String SELECTALL = "SELECT * FROM ARTICLES_VENDUS";
	public UtilisateurDAO dao = UtilisateurFact.getInstance();
	LocalDateTime lol;

	@Override
	public void insert(Article article) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Projet", "sa",
				"Pa$$w0rd");
		
		PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1, article.getNomArticle());
		stmt.setString(2, article.getDescription());
		stmt.setTimestamp(3, Timestamp.valueOf(article.getDateDebutEncheres()));
		stmt.setTimestamp(4, Timestamp.valueOf(article.getDateDebutEncheres()));
		stmt.setInt(5, article.getMiseAPrix());
		stmt.setInt(6, article.getVendeur().getNoUtilisateur());
		stmt.setInt(7, article.getCategorieArticle().getNoCategorie());
		int nb = stmt.executeUpdate();
		System.out.println("nb=" + nb);
		if (nb > 0) {
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				article.setNoArticle(rs.getInt(1));
			}
		}
	}

	@Override
	public List<Article> getAll() throws SQLException {
		List<Article> result = new ArrayList<Article>();
		Connection con = JdbcTools.getConnection();
		PreparedStatement stmt = con.prepareStatement(SELECTALL, Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Article article = new Article();
			article.setNoArticle(Integer.parseInt(rs.getString("no_article")));
			article.setNomArticle(rs.getString("nom_article"));
			article.setDescription(rs.getString("description"));
			article.setDateDebutEncheres((rs.getTimestamp("date_debut_encheres")).toLocalDateTime());
			article.setDateFinEncheres((rs.getTimestamp("date_fin_encheres")).toLocalDateTime());
			article.setMiseAPrix(rs.getInt("prix_initial"));
			article.setPrixVente(rs.getInt("prix_vente"));
			List<Utilisateur> lstUtilisateur = dao.getAll();
			for (Utilisateur util : lstUtilisateur) {
				if(util.getNoUtilisateur()==rs.getInt("No_utilisateur")) {
					article.setVendeur(util);
				}
			}
			/*for (Categorie cat : lstCategories) {
				if(cat.getNoCategorie()==rs.getInt("vendeur")) {
					article.setCategorieArticle(cat);
				}
			}*/

			result.add(article);

		}

		return result;
	}

}
