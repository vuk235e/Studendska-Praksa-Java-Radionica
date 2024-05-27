package Daos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Models.Administrator;
import Utilities.DBConnection;

public class AdministratorDAO {

	public void addAdministrator(Administrator a) {
		String sql = "INSERT INTO administrator (email, sifra) VALUES (?, ?)";
		Connection con;
		try {
			con = DBConnection.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, a.getEmail());
			st.setString(2, a.getSifra());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
	public List<Administrator> getAllAdministrators() {
		List<Administrator> admins = new ArrayList<>();
		String sql  ="SELECT * FROM administrator";
		try {
			Connection con = DBConnection.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Administrator a = new Administrator();
				a.setId(rs.getInt("id"));
				a.setEmail(rs.getString("email"));
				a.setSifra(rs.getString("sifra"));
				admins.add(a);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return admins;
	}
}

