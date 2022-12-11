package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql = "select * from login where Uname=? and Pass=?";
String url ="jdbc:mysql://localhost:3306/backend";
String username= "root";
String password="914633";
public boolean check(String uname, String pass) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, uname);
		st.setString(2, pass);
		ResultSet rs = st.executeQuery();
		if(rs.next()){
			return true;
		}
	}catch(Exception e) {
		
	}
	
	
	return false;
	
}
}
