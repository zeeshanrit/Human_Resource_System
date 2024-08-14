

package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DAO.DBCon;
import com.user.User;

public class UserDAO {
	User user ;

	public User retrieveUser(String email, String pword) throws SQLException {
		user=new User();
		Connection con = DBCon.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from users where email = ? and password = ?");
		ps.setString(1, email);
		ps.setString(2, pword);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			user.setFname(rs.getString(4));
			user.setIsAdmin(rs.getString(9));
		}
		System.out.println(user);
		return user;
	}
}
