package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.UpdateDAO;
import com.emp.Employee;

/**
 * Servlet implementation class Update2
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try
		{
			Employee emp = new UpdateDAO().update(Integer.parseInt(req.getParameter("id")));
			System.out.println(emp);
			if (emp!=null) {
				req.setAttribute("emp", emp);
				req.getRequestDispatcher("Update.jsp").include(req, resp);
			}
		}
		catch (Exception e) {

		e.printStackTrace();
		}
	
	}	

}
