package com.DAO;

import java.sql.Connection;

import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import com.db.DAO.DBCon;



public class SignUpDAO {

	public int signUp(HttpServletRequest request)
	{
		int k=0;
		try {
			Connection con=DBCon.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?,?,?,?)");
			String username = request.getParameter("pword").replaceAll("@gmail.com", "");
			
			ps.setLong(1,0);
			ps.setString(2, username);
		    ps.setString(3, request.getParameter("pword"));
			ps.setString(4, request.getParameter("fname"));
		    ps.setString(5, request.getParameter("lname"));
		    ps.setString(6, request.getParameter("email"));
		    ps.setLong(7, Long.parseLong(request.getParameter("phno")));
		    ps.setString(8, request.getParameter("address"));
		    k=ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}
