<%@page import="com.jh.emp.vo.EmployVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form {
	padding-left: 30%;
}

</style>
</head>
<body>
<div id="container">
<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@ include file="slider.jsp" %>
<form action="select" method="get">
EmployId :<input type="text" name="empId">
<input type="submit" value="Select">
</form>

<div>
<%@ include file="footer.jsp" %>
</div>
</div>

</body>
</html>
</body>
</html>