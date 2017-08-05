package com.jh.emp.bs;

import java.util.List;

import com.jh.emp.vo.EmployVO;

public interface EmployBs {

	public void createTable();
	public int InsertEmpInfo(EmployVO employVO);
	public EmployVO getLoginInfo(String email, String password);
	public int updateEmpInfoLocationByEmpId(int empId,String location);
	public EmployVO  getEmpInfobyEmpId(int empId);
    public List<EmployVO> getAllEmpInfo();	
}
