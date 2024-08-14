package com.DAO;

import java.beans.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.db.DAO.DBCon;
import com.emp.Employee;

public class EmployeeDAO {
	public List<Employee> retriveEmployee() {
		List<Employee> employees = new ArrayList<Employee>();

		Connection con = DBCon.getConnection();

		try {

			PreparedStatement ps = con.prepareStatement("select * from emp");
			ResultSet rs = ps.executeQuery();

	
			while (rs.next()) {
				Integer empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				Integer mgr = rs.getInt("mgr");
				Date hrdate = rs.getDate("hiredate");
				Double sal = rs.getDouble("sal");
				Double comm = rs.getDouble("comm");
				Integer deptno = rs.getInt("deptno");
				System.out.println(empno + " " + ename + " " + job + " " + mgr + " " + hrdate + " " + sal + " " + comm
						+ " " + deptno);
				Employee employee = new Employee(empno, ename, job, mgr, hrdate, sal, comm, deptno);
				employees.add(employee);

			}

		} catch (Exception e) {
			e.printStackTrace();
			// Handle except

		}
		return employees;
	}
}
