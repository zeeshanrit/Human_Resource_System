package com.DAO;

import java.sql.Connection;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.db.DAO.DBCon;
import com.emp.Employee;

public class UpdateDAO {

	
	public Employee update(int empno) throws SQLException
	{
		Employee emp = null;
		Connection con=DBCon.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from emp where empno = ?");
		ps.setInt(1, empno);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			
			Integer empno1 = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			Integer mgr = rs.getInt("mgr");
			Date hrdate = rs.getDate("hiredate");
			Double sal = rs.getDouble("sal");
			Double comm = rs.getDouble("comm");
			Integer deptno = rs.getInt("deptno");
			 emp = new Employee(empno1, ename, job, mgr, hrdate, sal, comm, deptno);
		}
		
		return emp ;
	}
		
	
	
	
}
