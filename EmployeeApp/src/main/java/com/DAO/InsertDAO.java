package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.db.DAO.DBCon;
import com.emp.Employee;

public class InsertDAO {
	public int insert(Employee emp)
	{
		int k=0;
		try {
			Connection con=DBCon.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
		    ps.setInt(1,emp.getEmpno() );
			ps.setString(2,emp.getEname());
		    ps.setString(3, emp.getJob());
		    ps.setInt(4, emp.getMgr());
		    ps.setDate(5, emp.getHiredate());
		    ps.setDouble(6, emp.getSal());
		    ps.setDouble(7, emp.getComm());
		    ps.setInt(8, emp.getDeptno());
		    k=ps.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return k;
	}
}

