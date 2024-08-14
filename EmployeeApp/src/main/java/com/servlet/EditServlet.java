package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.EditDAO;
 
@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int k = new EditDAO().editEmployee(req);
		if(k>0) {
			req.getRequestDispatcher("view").forward(req, resp);
		}else {
			req.getRequestDispatcher("update").forward(req, resp);
		}
		
	}

	
}
