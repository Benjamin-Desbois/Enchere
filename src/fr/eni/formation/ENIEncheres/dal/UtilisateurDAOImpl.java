package fr.eni.formation.ENIEncheres.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.formation.ENIEncheres.bo.Utilisateur;

public class UtilisateurDAOImpl implements UtilisateurDAO {
	private final String INSERT = "INSERT INTO utilisateurs(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	private final String SELECTALL = "SELECT pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur FROM utilisateurs";

	@Override
	public void insert(Utilisateur utilisateur) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Projet", "sa",
				"Pa$$w0rd");
		PreparedStatement stmt = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
		stmt.setString(1, utilisateur.getPseudo());
		stmt.setString(2, utilisateur.getNom());
		stmt.setString(3, utilisateur.getPrenom());
		stmt.setString(4, utilisateur.getEmail());
		stmt.setString(5, utilisateur.getTelephone());
		stmt.setString(6, utilisateur.getRue());
		stmt.setString(7, utilisateur.getCodePostal());
		stmt.setString(8, utilisateur.getVille());
		stmt.setString(9, utilisateur.getMotDePasse());
		stmt.setInt(10, 0);
		stmt.setBoolean(11, false);
		int nb = stmt.executeUpdate();
		System.out.println("nb=" + nb);
		if (nb > 0) {
			ResultSet rs = stmt.getGeneratedKeys();
			if (rs.next()) {
				utilisateur.setNoUtilisateur(rs.getInt(1));
			}
		}
	}

	@Override
	public List<Utilisateur> getAll() throws SQLException {
		List<Utilisateur> result = new ArrayList<Utilisateur>();
		Connection con = JdbcTools.getConnection();
		PreparedStatement stmt = con.prepareStatement(SELECTALL, Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Utilisateur utilisateur = new Utilisateur();
			utilisateur.setPseudo(rs.getString("pseudo"));
			utilisateur.setNom(rs.getString("nom"));
			utilisateur.setPrenom(rs.getString("prenom"));
			utilisateur.setEmail(rs.getString("email"));
			utilisateur.setTelephone(rs.getString("telephone"));
			utilisateur.setRue(rs.getString("rue"));
			utilisateur.setCodePostal(rs.getString("code_postal"));
			utilisateur.setVille(rs.getString("ville"));
			utilisateur.setMotDePasse(rs.getString("mot_de_passe"));
			utilisateur.setCredit(rs.getInt("credit"));
			utilisateur.setAdministrateur(rs.getBoolean("administrateur"));
		}

		return result;
	}
}
