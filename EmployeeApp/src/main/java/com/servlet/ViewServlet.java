package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.UpdateDAO;
import com.emp.Employee;
@WebServlet("/show")
public class ViewServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try
		{
			Employee emp = new UpdateDAO().update(Integer.parseInt(req.getParameter("id")));
			System.out.println(emp);
			if (emp!=null) {
				req.setAttribute("emp", emp);
			//	req.setAttribute("isAdmin", resp);
				req.getRequestDispatcher("EmployeeView.jsp").include(req, resp);
			}
		}
		catch (Exception e) {

		e.printStackTrace();
		}
	
	}
}
