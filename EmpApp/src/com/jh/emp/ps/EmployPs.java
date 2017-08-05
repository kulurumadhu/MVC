package com.jh.emp.ps;

import java.util.List;

import com.jh.emp.vo.EmployVO;

public interface EmployPs {
	
	
	public void createTable();
	public int InsertEmpInfo(EmployVO employVO);
	public EmployVO  getLoginInfo(String email, String password);
	public int updateEmpInfoLocationByEmpId(int empId,String location);
    
	public EmployVO  readEmpInfobyEmpId(int empId);
	public List<EmployVO> readAllEmpInfo();
	
	
}
