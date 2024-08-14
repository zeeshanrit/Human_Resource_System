<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.emp.Employee"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Employee</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0; /* Light grey background */
        }
        .container {
            width: 400px;
            margin: 20px auto;
            background-color: #fff; /* White background for form */
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1); /* Box shadow for depth */
        }
        input[type="number"], input[type="text"], input[type="date"] {
            width: 100%;
            padding: 8px;
            margin: 5px 0;
            box-sizing: border-box;
        }
        input[type="number"]:read-only {
            background-color: #f2f2f2;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 5px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Update Employee</h2>
        <form action="edit" method="get">
            <% Employee emp = (Employee) request.getAttribute("emp"); %>
            <input type="number" name="empno" placeholder="Enter empno" value="<%= emp.getEmpno() %>" readonly>
            <br>
            <input type="text" name = "ename" placeholder="Enter ename" value="<%= emp.getEname() %>">
            <br>
            <input type="text" name = "job" placeholder="Enter job" value="<%= emp.getJob() %>">
            <br>
            <input type="text" name = "mgr" placeholder="Enter mgr" value="<%= emp.getMgr() %>">
            <br>
            <input type="date" name = "hiredate" placeholder="Enter hiredate" value="<%= emp.getHiredate() %>">
            <br>
            <input type="text" name = "sal" placeholder="Enter salary" value="<%= emp.getSal() %>">
            <br>
            <input type="number" name = "comm" placeholder="Enter comm" value="<%= emp.getComm() %>">
            <br>
            <input type="number" name = "deptno" placeholder="Enter deptno" value="<%= emp.getDeptno() %>">
            <br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
