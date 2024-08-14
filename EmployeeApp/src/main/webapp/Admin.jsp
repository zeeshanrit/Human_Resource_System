<%@ page import="java.util.List" %>
<%@ page import="com.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.emp.Employee" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Table</title>
<!-- Include Bootstrap CSS -->
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<!-- Include Font Awesome CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
</head>
<body>
	<h2>Employee Table</h2>
	<div class="container">
		<a href="insert.jsp" class="btn btn-primary mb-2"><i class="fas fa-plus"></i> Insert</a>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>empNumber</th>
					<th>empName</th>
					<th>empDesignation</th>
					<th>mgrNumber</th>
					<th>hireDate</th>
					<th>empSalary</th>
					<th>comm</th>
					<th>deptNo</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Employee> employees = (List<Employee>) request.getAttribute("empList");

				for (Employee employee : employees) {
				%>
				<tr>
					<td><%=employee.getEmpno()%></td>
					<td><%=employee.getEname()%></td>
					<td><%=employee.getJob()%></td>
					<td><%=employee.getMgr()%></td>
					<td><%=employee.getHiredate()%></td>
					<td><%=employee.getSal()%></td>
					<td><%=employee.getComm()%></td>
					<td><%=employee.getDeptno()%></td>
					<td><a href="update?id=<%=employee.getEmpno()%>" class="btn btn-warning"><i class="fas fa-edit"></i> Edit</a></td>
					<td><a href="delete?id=<%=employee.getEmpno()%>" class="btn btn-danger"><i class="fas fa-trash-alt"></i> Delete</a></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>
</body>
</html>