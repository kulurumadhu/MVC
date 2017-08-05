package com.jh.emp.bs.bean;

import java.util.List;

import com.jh.emp.bs.EmployBs;
import com.jh.emp.ps.EmployPs;
import com.jh.emp.util.EmpFactory;
import com.jh.emp.vo.EmployVO;

public class EmployBsBean implements EmployBs{
EmployVO  empvo;
int result;
	@Override
	public void createTable() {
		EmployPs employPs = EmpFactory.getEmployPsBeanInstance();
		employPs.createTable();
		
	}

	@Override
	public int InsertEmpInfo(EmployVO employVO) {

        EmployPs employPs = EmpFactory.getEmployPsBeanInstance();
   result = employPs.InsertEmpInfo(employVO);
		return result;
	}

	
		
	
	@Override
	public EmployVO getLoginInfo(String email, String password) {
		EmployPs employPs = EmpFactory.getEmployPsBeanInstance();
		return empvo = employPs.getLoginInfo(email, password);
		
	}

	@Override
	public int updateEmpInfoLocationByEmpId(int empId, String location) {
		
		EmployPs  employPs = EmpFactory.getEmployPsBeanInstance();
  result=employPs.updateEmpInfoLocationByEmpId(empId, location);
		return result;
	}

	@Override
	public EmployVO getEmpInfobyEmpId(int empId) {
		EmployPs employPs = EmpFactory.getEmployPsBeanInstance();
		empvo=employPs.readEmpInfobyEmpId(empId);
		return empvo;
	}

	@Override
	public List<EmployVO> getAllEmpInfo() {
		EmployPs employPs = EmpFactory.getEmployPsBeanInstance();
	List<EmployVO>	employVOs	=employPs.readAllEmpInfo();
	return employVOs;
	}

}
