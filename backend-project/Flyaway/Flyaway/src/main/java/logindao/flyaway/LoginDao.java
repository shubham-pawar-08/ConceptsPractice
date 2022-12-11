package logindao.flyaway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class LoginDao {
	
	String sql = "select * from login where uname=? and pass=?";
String url ="jdbc:mysql://localhost:3306/flyway";
String username= "root";
String password="914633";

public boolean check(String uname, String pass) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection established");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, uname);
		st.setString(2, pass);
		System.out.println("Prepared statement");
		System.out.println(st);
		ResultSet rs = st.executeQuery();
		if(rs.next()){
			System.out.println("Done");
			return true;

		}
	}catch(Exception e) {
		
	}
	
	
	return false;
	
}
public boolean change(String uname, String pass) {
	String update="update login set pass = ? where uname = ?";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection established");
		PreparedStatement st = con.prepareStatement(update);
		st.setString(1,uname);
		st.setString(2, pass);
		st.executeUpdate();
		System.out.println(st);
		System.out.println("done");
		con.close();
//		st.setString(1, uname);
//		st.setString(2, uname);
		
//		int rs = st.executeUpdate(update);
//	System.out.println(rs);
//		if(rs.next()){
//			System.out.println("Updated");
//			System.out.println(rs);
//			return true;
//		}
	}catch(Exception e) {
		
	}
	
	
	
	return false;
	
}

}
