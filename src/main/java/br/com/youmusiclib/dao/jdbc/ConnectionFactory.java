package br.com.youmusiclib.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static Connection getConnection(){
		
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			return DriverManager.getConnection("jdbc:mysql://localhost/youmusiclib","root","");
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
	}

}
