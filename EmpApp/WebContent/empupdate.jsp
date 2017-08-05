<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style type="text/css">
form {
	padding-left: 30%;
	text-align: left;
	
}
label {
	display: inline-block;
	width: 100%;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="container">
<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@include file="slider.jsp" %>
<form action="update" method="post">
<label>EmployId :</label><input type="text" name="empId"><br>
<label>EmployLocation:</label><input type="text" name="location"><br>
<input type="submit" value="Update">

</form>
<div>

<%@ include file="footer.jsp" %>
</div>
</div>
</body>
</html>