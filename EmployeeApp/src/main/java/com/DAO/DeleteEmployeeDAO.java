package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.db.DAO.DBCon;

public class DeleteEmployeeDAO {

	public int delete(int empno) throws SQLException
	{
		Connection con=DBCon.getConnection();
		PreparedStatement ps = con.prepareStatement("delete from emp where empno=?");
		ps.setLong(1, empno);
		int executeUpdate = ps.executeUpdate();
		return executeUpdate;
		
		
		
	}
}
