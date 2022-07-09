package com.techbook.basic;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// steps for database connections (important interview question)
public class CreateDbDemo {
	public static final String SQL = "create schema user_db";
	public static final String URL = "jdbc:mysql://localhost:3306";// jdbc:mysql://localhost(connection protocal )  
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	//com.mysql.cj.jdbc is a pakage name in that we have a class driver which load which load ..
	//driver for the particular program.for eaxmple if we delete task in database  driver will be loaded.
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		try {
			// 1.Register the driver
			Class.forName(DRIVER_NAME);// forName is a method name  which load a driver
			                           //and class is the  name of class
			//2.obtain the connection object
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);// aslae mathi url ,user_name,password lai ..
			//3.obtain the statement object                              // connect garauxa
			st = con.createStatement(); 
			//4.excute the query ()structured query language)
			st.executeUpdate(SQL);//calling method 
			System.out.println("db created");

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				//5. close the connections 
				con.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
