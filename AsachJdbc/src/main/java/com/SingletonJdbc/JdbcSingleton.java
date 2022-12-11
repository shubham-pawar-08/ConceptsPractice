package com.SingletonJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSingleton {
	private static JdbcSingleton instance;
private String url ="jdbc:mysql://localhost:3306/mysql";
private String uname = "root";
private String pwd = "992029";
private Connection connection;

private JdbcSingleton() throws SQLException {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		this.connection = DriverManager.getConnection(url,uname,pwd);
	}
	catch (ClassNotFoundException e) {
		// TODO: handle exception
		System.out.println("Something wrong" + e.getMessage());
	}
}
public Connection getConnection() {
	return connection;
}
public static JdbcSingleton getInstance() throws SQLException {
	if(instance==null) {
		instance = new JdbcSingleton();
	}
	else if (instance.getConnection().isClosed()) {
		instance=new JdbcSingleton();
	}
	return instance;
}
}
