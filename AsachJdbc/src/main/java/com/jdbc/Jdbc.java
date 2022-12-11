package com.jdbc;
import java.sql.*;

import org.w3c.dom.UserDataHandler;
public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/backend";
		String uname = "root";
		String pwd ="914633";
		String query = "create table emp_details( Name varchar(20), City varchar(20), Number int(50)) ";
Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, uname, pwd);
	System.out.println("Connection estalisehd");
	Statement st = con.createStatement();
	int count = st.executeUpdate(query);
//	while(rs.next()) {
//		String userData = rs.getString(1) + " " + rs.getInt(2) +" "+ rs.getString(3) + " " + rs.getString(5) + " " + rs.getInt(6);
//		System.out.println(userData);
//	}
	System.out.println(count);
//	
	st.close();
	con.close();
	}

}
