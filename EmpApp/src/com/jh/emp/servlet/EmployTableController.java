package com.jh.emp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jh.emp.bs.EmployBs;
import com.jh.emp.bs.bean.EmployBsBean;
@WebServlet("/create")
public class EmployTableController extends HttpServlet{
	
	
	
	
	@Override
	public  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployBs employBs = new EmployBsBean();
		employBs.createTable();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
