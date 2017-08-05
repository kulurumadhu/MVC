package com.jh.emp.util;

import java.sql.*;

public class DBConnectionUtil {

	private static Connection  con = null;
	
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnectionInstance() throws SQLException{
		if(con == null){
			con=DriverManager.getConnection(DBProperities.DB_URL, DBProperities.DB_USER_NAME, DBProperities.DB_PASSWORD);
			
		}
		return con;
	}
}
