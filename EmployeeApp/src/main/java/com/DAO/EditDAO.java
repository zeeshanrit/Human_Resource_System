package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.db.DAO.DBCon;

public class EditDAO {

    public int editEmployee(HttpServletRequest req) {
        int empno = Integer.parseInt(req.getParameter("empno"));
        String ename = req.getParameter("ename");
        String job = req.getParameter("job");
        int mgr = Integer.parseInt(req.getParameter("mgr"));
        String hiredate = req.getParameter("hiredate");
        Double sal = Double.parseDouble(req.getParameter("sal"));
        Double comm = Double.parseDouble(req.getParameter("comm"));
        int deptno = Integer.parseInt(req.getParameter("deptno"));

        try {
        	Connection connection = DBCon.getConnection();
        	String query = "UPDATE emp SET ename=?, job=?, mgr=?, hiredate=TO_DATE(?, 'yyyy-MM-DD'), sal=?, comm=?, deptno=? WHERE empno=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, ename);
            preparedStatement.setString(2, job);
            preparedStatement.setInt(3, mgr);
            preparedStatement.setString(4, hiredate);
            preparedStatement.setDouble(5, sal);
            preparedStatement.setDouble(6, comm);
            preparedStatement.setInt(7, deptno);
            preparedStatement.setInt(8, empno);
            int rowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();

            return rowsAffected; // Return the number of rows updated
        } catch (SQLException e) {
            e.printStackTrace();
            return 0; // Return 0 if an error occurs
        }
    }
}
