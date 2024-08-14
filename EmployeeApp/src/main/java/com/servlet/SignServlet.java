package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.*;
@WebServlet("/Sign")
public class SignServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		int k=new SignUpDAO().signUp(request);
		if(k>0)
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("Signupsuccess.jsp");
			rd.include(request, response);
		}else {
			pw.println("Not registered");
			RequestDispatcher rd=request.getRequestDispatcher("notregister.jsp");
			rd.include(request, response);
		}
	}

}
