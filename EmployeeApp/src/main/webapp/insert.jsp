<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert Employee Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        form {
            margin: 20px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            width: 400px;
        }
        label {
            display: block;
            margin-bottom: 10px;
        }
        input[type="text"], input[type="email"], input[type="date"], input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border-radius: 3px;
            border: 1px solid #ccc;
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
            border-radius: 3px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h2>Insert Employee Details</h2>
    <form action="add" method="post">
        <label for="empNumber">Employee Number:</label>
        <input type="text" id="empNumber" name="empNumber" required><br>
        
        <label for="empName">Employee Name:</label>
        <input type="text" id="empName" name="empName" required><br>
        
        <label for="empDesignation">Employee Designation:</label>
        <input type="text" id="empDesignation" name="empDesignation" required><br>
        
        <label for="mgrNumber">Manager Number:</label>
        <input type="text" id="mgrNumber" name="mgrNumber"><br>
        
        <label for="hireDate">Hire Date:</label>
        <input type="date" id="hireDate" name="hireDate" required><br>
        
        <label for="empSalary">Employee Salary:</label>
        <input type="number" id="empSalary" name="empSalary" required><br>
        
        <label for="comm">Commission:</label>
        <input type="number" id="comm" name="comm"><br>
        
        <label for="deptNo">Department Number:</label>
        <input type="text" id="deptNo" name="deptNo" required><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
