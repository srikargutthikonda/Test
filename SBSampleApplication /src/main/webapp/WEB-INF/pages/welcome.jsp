<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Employee extention form</title>
	<link href="css/sample.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <form action="submitExt" method="POST">
           Employee ID : <input type="text" name="empId"><br><br>
           Employee Name : <input type="text" name="empName"><br><br>
           Employee ExtNo : <input type="text" name="extNo"><br><br>
           <input type="submit" value="Submit">
        </form>
        <script src="js/sample.js"></script>
    </div>
</body>
</html>