package com.jh.emp.ps.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jh.emp.ps.EmployPs;
import com.jh.emp.util.DBConnectionUtil;
import com.jh.emp.util.DBQuery;
import com.jh.emp.vo.EmployVO;


public class EmployPsBean implements EmployPs{
private Connection con = null;
private PreparedStatement ps =null;
private int count=0;
private EmployVO employVO =null;
private ResultSet rs = null;


	@Override
	public void createTable() {
		try {
			con = DBConnectionUtil.getConnectionInstance();
			ps =con.prepareStatement(DBQuery.CREATE_EMP_TABLE);
			ps.executeUpdate();
			System.out.println("create table successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public int InsertEmpInfo(EmployVO employVO) {
		try {
			con= DBConnectionUtil.getConnectionInstance();
			ps = con.prepareStatement(DBQuery.INSERT_EMP_INFO);
			ps.setInt(1, employVO.getEmpId());
			ps.setString(2, employVO.getEmployName());
			ps.setString(3, employVO.getEmail());
			ps.setString(4, employVO.getDepartment());
			ps.setString(5, employVO.getPassword());
			ps.setString(6, employVO.getLocation());
			count = ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}

	@Override
	public EmployVO  getLoginInfo(String email, String password) {
		try {
			con = DBConnectionUtil.getConnectionInstance();
			ps =con.prepareStatement(DBQuery.GET_LOGIN_INFO);
			ps.setString(1, email);
			ps.setString(2, password);
		   rs = ps.executeQuery();
			if(rs.next()){
				employVO  = new EmployVO();
				employVO.setEmpId(rs.getInt(1));
				employVO.setEmployName(rs.getString(2));
				employVO.setEmail(rs.getString(3));
				employVO.setDepartment(rs.getString(4));
				employVO.setPassword(rs.getString(5));
				employVO.setLocation(rs.getString(6));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employVO;
		
	}

	@Override
	public int updateEmpInfoLocationByEmpId(int empId, String location) {
		try {
			con = DBConnectionUtil.getConnectionInstance();
			ps = con.prepareStatement(DBQuery.UPDATE_EMP_INFO_LOCATION_BY_ENPID);
			ps.setString(1, location);
			ps.setInt(2, empId);
			count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
		
	}

	@Override
	public EmployVO readEmpInfobyEmpId(int empId) {
		
		try {
			con = DBConnectionUtil.getConnectionInstance();
			ps = con.prepareStatement(DBQuery.READ_EMP_INFO_BY_EMPID);
			ps.setInt(1, empId);
		    rs =ps.executeQuery();
		    if(rs.next()){
		    	employVO = new EmployVO();
		    	employVO.setEmpId(rs.getInt(1));
		    	employVO.setEmployName(rs.getString(2));
		    	employVO.setEmail(rs.getString(3));
		    	employVO.setDepartment(rs.getString(4));
		    	
				employVO.setLocation(rs.getString(5));
		    	
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employVO;
	}

	@Override
	public List<EmployVO> readAllEmpInfo() {
		List<EmployVO>employVOs = new ArrayList<EmployVO>();
		try {
			con = DBConnectionUtil.getConnectionInstance();
			ps = con.prepareStatement(DBQuery.READ_ALL_EMP_INFO);
			rs =ps.executeQuery();
			while(rs.next()){
				employVO = new EmployVO();
				employVO.setEmpId(rs.getInt(1));
				employVO.setEmployName(rs.getString(2));
				employVO.setDepartment(rs.getString(3));
				employVO.setEmail(rs.getString(4));
				employVO.setLocation(rs.getString(5));
			   employVOs.add(employVO);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employVOs;
		
	}

}
