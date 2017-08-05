<%@page import="com.jh.emp.vo.EmployVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style type="text/css">
table,th,td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align:center;
	vertical-align: middle;
	margin-left: 20%;


}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="container">
<%@ include file="header.jsp" %>
<%@ include file="menu.jsp" %>
<%@ include file="slider.jsp" %>
<% EmployVO emVo =(EmployVO)request.getAttribute("empVO"); %>
<table>
<tr>
<th>EmployId</th>
<th>EmployName</th>
<th>EmailId</th>
<th>Department</th>
<th>EmployLocation</th>
</tr>
<tr>
<td><% out.println(emVo.getEmpId()); %></td>
<td><%out.println(emVo.getEmployName()); %></td>
<td><%out.println(emVo.getEmail()); %></td>
<td><%out.println(emVo.getDepartment()); %></td>
<td><%out.println(emVo.getLocation()); %></td>
</tr>
</table>
</div>
<div>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>