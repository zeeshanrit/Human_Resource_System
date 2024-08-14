<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.emp.Employee"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit Employee</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0; /* Light grey background */
        }
        .container {
            margin-top: 50px;
        }
        .row {
            margin-bottom: 10px;
        }
        .card-body {
            display: flex;
            flex-wrap: wrap;
        }
        .card-item {
            flex: 1 0 50%; /* Two items per row */
            padding-right: 20px; /* Space between items */
        }
        .btn-container {
            margin-top: 20px;
        }
        .card-title{
        	font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <% Employee emp = (Employee) request.getAttribute("emp"); %>
        <div class="text-center">
            <h2>Employee Details</h2>
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="card">
                        <div class="card-body">
                            <div class="card-item">
                                <h5 class="card-title">Employee Number:</h5>
                                <p class="card-text"><%= emp.getEmpno() %></p>
                            </div>
                            <div class="card-item">
                                <h5 class="card-title">Employee Name:</h5>
                                <p class="card-text"><%= emp.getEname() %></p>
                            </div>
                            <div class="card-item">
                                <h5 class="card-title">Employee Job:</h5>
                                <p class="card-text"><%= emp.getJob() %></p>
                            </div>
                            <div class="card-item">
                                <h5 class="card-title">Employee Manager:</h5>
                                <p class="card-text"><%= emp.getMgr() %></p>
                            </div>
                            <div class="card-item">
                                <h5 class="card-title">Employee Hiredate:</h5>
                                <p class="card-text"><%= emp.getHiredate() %></p>
                            </div>
                            <div class="card-item">
                                <h5 class="card-title">Employee Salary:</h5>
                                <p class="card-text"><%= emp.getSal() %></p>
                            </div>
                            <div class="card-item">
                                <h5 class="card-title">Employee Commission:</h5>
                                <p class="card-text"><%= emp.getComm() %></p>
                            </div>
                            <div class="card-item">
                                <h5 class="card-title">Employee Department Number:</h5>
                                <p class="card-text"><%= emp.getDeptno() %></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="text-center btn-container">
            <a href="view" class="btn btn-success"><i class="fas fa-arrow-left"></i> Back</a>
           
        </div>
    </div>
</body>
</html>
