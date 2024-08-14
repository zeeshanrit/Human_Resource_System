<!DOCTYPE html>
<html>
<head>
    <title>Login Success</title>
    <!-- Custom CSS -->
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            /* Add background image */
            background-image: url('https://img.freepik.com/free-photo/painting-mountain-lake-with-mountain-background_188544-9126.jpg');
            background-size: cover;
            background-position: center;
        }
        .container {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            max-width: 400px; /* Adjust as needed */
            width: 100%;
        }
        h1 {
            color: green;
            text-align: center;
            margin-bottom: 20px;
        }
        p {
            color: green;
            text-align: center;
            margin-bottom: 30px;
        }
        .btn-container {
            display: flex;
            justify-content: center;
        }
        .btn-container a {
            text-decoration: none;
        }
        .btn-container button {
            padding: 10px 20px;
            border: none;
            background-color: #007bff;
            color: #fff;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .btn-container button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Login Successful!</h1>
        <p>Welcome, <%= request.getAttribute("fname") %>!</p>
        <div class="btn-container">
            <a href="view"><button>View Employee Record</button></a>
        </div>
    </div>
</body>
</html>
