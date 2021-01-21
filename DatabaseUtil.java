package com.phonon.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	//MYSQL
	private static final String MYSQL_DB_USERNAME = "root";
	private static final String MYSQL_DB_PASSWORD = "root";
	private static final String MYSQL_DB_URL = "jdbc:mysql://localhost:3307/SopanDB";
	private static final String MYSQL_DB_DRIVERCLASS = "com.mysql.jdbc.Driver";
		
	
	private DatabaseUtil() {
		//as this is utility class--creating single instance private constructor..
	}

	public static Connection getMyQLConnection() {
		Connection conn  = null;
		try {
			Class.forName(MYSQL_DB_DRIVERCLASS);
			conn = DriverManager.getConnection(MYSQL_DB_URL,MYSQL_DB_USERNAME,MYSQL_DB_PASSWORD);
		}catch(ClassNotFoundException cls) {
			System.out.println("Problem in loading Driverclass...!");
		}catch(SQLException sql) {
			System.out.println("Problem in creating connection with database");
		}
		System.out.println("MYSQL --Connection Instance --  " + conn);
		return conn;
	}
	
	
	public static void main(String[] args) {
		//whatever the operation need to perform on database we can do it here
		getMyQLConnection();
	}

}