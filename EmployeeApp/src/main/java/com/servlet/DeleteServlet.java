package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.DeleteEmployeeDAO;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			try
			{
				int delete = new DeleteEmployeeDAO().delete(Integer.parseInt(request.getParameter("id")));
				request.getRequestDispatcher("view").forward(request, response);
			}
			catch (Exception e) {

			e.printStackTrace();
			}
	}

	


}
