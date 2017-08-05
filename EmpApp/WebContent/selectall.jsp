<%@page import="java.util.ArrayList"%>
<%@page import="com.jh.emp.vo.EmployVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table,th,td {
	border: 1px solid black;
	border-collapse: collapse;
	text-align:center;
	vertical-align: middle;
	margin-left: 20%;
}
</style>
</head>
<body>
<div>
<table>
<tr>
<th>EmployId</th>
<th>EmployName</th>
<th>EmailId</th>
<th>Department</th>
<th>EmployLocation</th>
</tr>
<% List<EmployVO>emList =(ArrayList<EmployVO>)request.getAttribute("empList");%>
<%for(EmployVO employVO:emList){%>
	<tr>
	<td><% out.println(employVO.getEmpId()); %></td>
<td><%out.println(employVO.getEmployName()); %></td>
<td><%out.println(employVO.getEmail()); %></td>
<td><%out.println(employVO.getDepartment()); %></td>
<td><% out.println(employVO.getLocation()); %></td>
</tr>
<%} %>



</table>


</div>
</body>
</html>