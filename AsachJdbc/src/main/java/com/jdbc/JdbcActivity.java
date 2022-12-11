package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcActivity {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	String url ="jdbc:mysql://localhost:3306/mysql";
	String uname = "root";
	String pwd = "992029";
	String create = "create table NoOperation(id int(10), Name varchar(20), Country varchar(20))";
	String insert = "insert into NoOperation(id,Name,Country) values(11, 'Dinesh' , 'India')";
	String retrieve = "select * from NoOperation";
	String update = "update NoOperation set Name='Hello' where id=10 ";
	String delete = "delete from NoOperation where id =10";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, uname, pwd);
	System.out.println("Connected");
	Statement st = con.createStatement();
//	st.executeUpdate(create);
//	st.executeUpdate(insert);
//	st.executeUpdate(update);
	st.execute(delete);
//	ResultSet rs = st.executeQuery(retrieve);
//	while(rs.next()) {
//		String data = rs.getInt(1) +" " +rs.getString(2) + " " + rs.getString(3);
//		System.out.println(data);
//		
//	}
	st.close();
	con.close();
}
}
