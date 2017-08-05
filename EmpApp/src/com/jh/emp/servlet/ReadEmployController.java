package com.jh.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jh.emp.bs.EmployBs;
import com.jh.emp.bs.bean.EmployBsBean;
import com.jh.emp.vo.EmployVO;

public class ReadEmployController extends HttpServlet {
	
	@Override
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployVO  employVO;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int empId = Integer.parseInt(request.getParameter("empId"));
		
	EmployBs employBs = new EmployBsBean();
	employVO = employBs.getEmpInfobyEmpId(empId);
	ServletContext context =this.getServletContext();
	request.setAttribute("empVO",employVO);
	
	if(employVO!=null){
		RequestDispatcher rd = context.getRequestDispatcher("/read.jsp");
		rd.include(request, response);
	}
	else{
		RequestDispatcher rd = context.getRequestDispatcher("/failure.jsp");
		out.println(employVO+"Record fetched");
		rd.include(request, response);
	}
	//	out.close();
	}

}
