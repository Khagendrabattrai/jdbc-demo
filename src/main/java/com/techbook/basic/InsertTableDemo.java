package com.techbook.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTableDemo {
	public static final String SQL = "insert into user_db2(user_name,password) values('himal','red')";
	public static final String URL = "jdbc:mysql://localhost:3306/user_db";
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	public static void main(String[] args) {
		
			try (Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
					Statement st = con.createStatement();) {
				st.executeUpdate(SQL);
				System.out.println("inserted  values ");

			} catch (SQLException a) {
				a.printStackTrace();
			}
	}

}
