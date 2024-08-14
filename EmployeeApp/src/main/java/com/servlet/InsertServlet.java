package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.InsertDAO;
import com.emp.Employee;

/**
 * Servlet implementation class InserSErvlet
 */
@WebServlet("/add")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/jsp");
		Employee emp = new Employee();
		
		emp.setEmpno(Integer.parseInt(request.getParameter("empNumber")));
		emp.setEname(request.getParameter("empName"));
	    emp.setJob(request.getParameter("empDesignation"));
	    emp.setMgr(Integer.parseInt(request.getParameter("mgrNumber")));
	    String date = request.getParameter("hireDate");
	    String[] dt = date.split("-");
	    @SuppressWarnings("deprecation")
		Date date2 = new Date(Integer.parseInt(dt[0]), Integer.parseInt(dt[1]), Integer.parseInt(dt[2]));
	    emp.setHiredate(date2);
	    emp.setSal(Double.parseDouble(request.getParameter("empSalary")));
	    emp.setComm(Double.parseDouble(request.getParameter("comm")));
	    emp.setDeptno(Integer.parseInt(request.getParameter("deptNo")));
		int k=new InsertDAO().insert(emp);
		if(k>0)
		{
			System.out.println("InsertServlet.doPost()");
//			RequestDispatcher rd = request.getRequestDispatcher("view");
	        response.sendRedirect("view");
//			rd.forward(request, response);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher("notregister.jsp");
		//	rd.include(request, response);
		}
	}

}
