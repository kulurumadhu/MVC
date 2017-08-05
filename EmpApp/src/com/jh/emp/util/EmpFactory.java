package com.jh.emp.util;

import com.jh.emp.ps.EmployPs;
import com.jh.emp.ps.bean.EmployPsBean;

public class EmpFactory {
	
	private static EmployPs employPs =null;
	
	public static EmployPs  getEmployPsBeanInstance(){
		if(employPs==null){
			employPs=new EmployPsBean();
			
		}
		return employPs;
	}

}
