package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.EmployeeDAO;
import com.emp.Employee;

@SuppressWarnings("serial")
@WebServlet("/view")
public class EmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Employee> employee = new EmployeeDAO().retriveEmployee();
	   Cookie[] c=req.getCookies();
	   String value=c[0].getValue();
	   System.out.println(value);
	   if(value.equalsIgnoreCase("y"))
	   {
		req.setAttribute("empList", employee);
		req.getRequestDispatcher("Admin.jsp").forward(req, resp);

	   }
	   else
	   {
	
		   req.setAttribute("empList", employee);
			req.getRequestDispatcher("Employee.jsp").forward(req, resp);
		   
	   }
	}

}
