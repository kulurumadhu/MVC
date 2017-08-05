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
	text-align: left;
	
}
label {
	display: inline-block;
	width: 100%;
}

div {
	color:navy;
}
</style>
</head>
<body>
<div id="container">
<%@ include file="header.jsp" %>
<%-- <%@ include file="menu.jsp" %>
 --%><%@ include file="slider.jsp" %>
<form action="login" method="get">
<label>Email :</label><input type="text" name="email"><br>
<label>Password:</label><input type="password" name="password"><br>
<input type="submit" value="Login">

</form>
<div>

<%@ include file="footer.jsp" %>
</div>
</div>
</body>
</html>