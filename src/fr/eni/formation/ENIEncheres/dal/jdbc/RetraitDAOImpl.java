package fr.eni.formation.ENIEncheres.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Retrait;
import fr.eni.formation.ENIEncheres.dal.RetraitDAO;

public class RetraitDAOImpl implements RetraitDAO {
	private final String INSERT = "INSERT INTO retraits(rue, code_postal, ville) VALUES (?,?,?)";
	private final String SELECTALL = "SELECT * FROM RETRAITS";

	public void insert(Retrait retrait) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Projet", "sa",
				"Pa$$w0rd");
		PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1, retrait.getRue());
		stmt.setString(2, retrait.getCode_postal());
		stmt.setString(3, retrait.getVille());
	}

	public List<Retrait> getAll() throws SQLException {
		List<Retrait> result = new ArrayList<Retrait>();
		Connection con = JdbcTools.getConnection();
		PreparedStatement stmt = con.prepareStatement(SELECTALL, Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Retrait retrait = new Retrait();
			retrait.setRue(rs.getString("rue"));
			retrait.setCode_postal(rs.getString("code_postal"));
			retrait.setVille(rs.getString("ville"));
			result.add(retrait);
		}
		return result;
	}
}