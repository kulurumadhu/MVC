<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RegisterEmp</title>
<style type="text/css">
form {
	padding-left: 30%;
	text-align: left;
	
}
label {
	display: inline-block;
	width: 100%;
}
h4 {
	padding-left: 30%;
   
}
div {
	color:navy;
}
</style>

</head>
<body >

<div id="container">

<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@ include file="slider.jsp" %>
<h4> Please Register here</h4>
<form action="insert" method="post">
<label>EmployId:</label><input type="text" name="empId"><br>
<label>EmployeeName:</label><input type="text" name="empName"><br>
<label>EmailId :</label><input type="text" name="email"><br>
<label>Department :</label><input type="text" name="department"><br>
<label>Password:</label><input type="password" name="password"><br>
<label>Location:</label><input type="text" name="location"><br>
<input type="submit" value="Register" >
</form>
<div>

<%@ include file="footer.jsp" %>
</div>
</div>

</body>
</html>