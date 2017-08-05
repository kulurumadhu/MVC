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

public class LoginServlet extends HttpServlet {
	
	EmployVO   employVO;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		EmployBs employBs = new EmployBsBean();
	employVO = employBs.getLoginInfo(email, password);
		
		ServletContext context = this.getServletContext();
		request.setAttribute("empVO", employVO);
		if(employVO !=null){
			System.out.println(employVO+"Records fetch");
			RequestDispatcher rd = context.getRequestDispatcher("/logindetails.jsp");
			
			rd.include(request, resp);
		}else {
			
			RequestDispatcher rd = context.getRequestDispatcher("/register.jsp");
			
			rd.include(request, resp);
			
			System.out.println(employVO+"Records fetch");
		}
		
		
	}

}
