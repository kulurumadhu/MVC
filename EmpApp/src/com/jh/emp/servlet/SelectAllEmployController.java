package com.jh.emp.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jh.emp.bs.EmployBs;
import com.jh.emp.bs.bean.EmployBsBean;
import com.jh.emp.vo.EmployVO;

public class SelectAllEmployController extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<EmployVO>employVOs;
		EmployBs employBs = new EmployBsBean();
		employVOs = employBs.getAllEmpInfo();
		
		ServletContext context = this.getServletContext();
		request.setAttribute("empList", employVOs);
		if(employVOs.size() > 0){
			RequestDispatcher rd = context.getRequestDispatcher("/selectall.jsp");
			rd.include(request, response);
		}
		else{
			RequestDispatcher rd = context.getRequestDispatcher("/failure.jsp");
			rd.include(request, response);
			
			
		}
	}

}
