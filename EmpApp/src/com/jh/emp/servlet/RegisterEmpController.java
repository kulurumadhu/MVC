package com.jh.emp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jh.emp.bs.EmployBs;
import com.jh.emp.bs.bean.EmployBsBean;
import com.jh.emp.vo.EmployVO;
//@WebServlet("/insert")
public class RegisterEmpController extends HttpServlet{
	
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int result;
		
		EmployVO employVO = new EmployVO();
		employVO.setEmpId(Integer.parseInt(req.getParameter("empId")));
		employVO.setEmployName(req.getParameter("empName"));
		employVO.setEmail(req.getParameter("email"));
		employVO.setDepartment(req.getParameter("department"));
		employVO.setPassword(req.getParameter("password"));
		employVO.setLocation(req.getParameter("location"));
		
		
		EmployBs employBs = new EmployBsBean();
		
		 result= employBs.InsertEmpInfo(employVO);
		 ServletContext context = this.getServletContext();
		 
		 if(result>0){
			 RequestDispatcher rd = context.getRequestDispatcher("/success.jsp");
			 rd.include(req, resp);
			 System.out.println(result+"Record inserted");
		 }else{
			 RequestDispatcher rd = context.getRequestDispatcher("/failure.jsp");
			 rd.include(req, resp);
			 System.out.println(result+"Record inserted");
		 }
	}
   @Override
public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	doGet(req, resp);
}
}
