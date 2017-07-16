package com.instisoft.user.common;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import static java.util.ResourceBundle.getBundle;

public interface ICommonDAO {
		ResourceBundle bundle = getBundle("user_config");
		String dbURL = bundle.getString("dburl");
		String dbUsername = bundle.getString("dbuser");
		String dbPassword = bundle.getString("dbpswd");
		
		public static Connection getConnection() throws ClassNotFoundException, SQLException{
//			load  MYSQL JDBC Driver
			Class.forName(bundle.getString("driver"));
//			make a connection
			Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			
			return connection;
		}
}
