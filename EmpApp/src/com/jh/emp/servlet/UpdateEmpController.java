package com.jh.emp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jh.emp.bs.EmployBs;
import com.jh.emp.bs.bean.EmployBsBean;

public class UpdateEmpController extends HttpServlet{

	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int result;
		
		int empId = Integer.parseInt(req.getParameter("empId"));
		String location = req.getParameter("location");
		EmployBs employBs = new EmployBsBean();
		result = employBs.updateEmpInfoLocationByEmpId(empId, location);
		ServletContext context = this.getServletContext();
		
		if(result>0){
			System.out.println(result+"Record updated");
			RequestDispatcher rd = context.getRequestDispatcher("/success.jsp");
			rd.include(req, resp);
		}
		else {
			RequestDispatcher rd = context.getRequestDispatcher("/failure.jsp");
			System.out.println(result+"Record updated");
			rd.include(req, resp);
		}
		
		
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
