package fr.eni.formation.ENIEncheres.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Categorie;
import fr.eni.formation.ENIEncheres.dal.CategorieDAO;

public class CategorieDAOImpl implements CategorieDAO {
	private final String INSERT = "INSERT INTO CATEGORIES(libelle) VALUES(?)";
	private final String SELECTALL = "SELECT * FROM CATEGORIES";

	@Override
	public void insert(Categorie categorie) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Projet", "sa",
				"Pa$$w0rd");
		PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1, categorie.getLibelle());
		int nb = stmt.executeUpdate();
		System.out.println("nb=" + nb);
		if (nb > 0) {
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				categorie.setNoCategorie(rs.getInt(1));
			}
		}
	}

	@Override
	public List<Categorie> getAll() throws SQLException {
		List<Categorie> result = new ArrayList<Categorie>();
		Connection con = JdbcTools.getConnection();
		PreparedStatement stmt = con.prepareStatement(SELECTALL, Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Categorie categorie = new Categorie();
			categorie.setLibelle(rs.getString("pseudo"));
			result.add(categorie);
			
		}

		return result;
	}

}
