package com.techbook.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {
	public static final String SQL = "create table user_tbl(id int not null auto_increment,user_name varchar(45),password varchar(45),primary key(id))"; 
	public static final String URL = "jdbc:mysql://localhost:3306/user_db2"; 
	public static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	public static void main(String[] args) {

		try(Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
				Statement st =  con.createStatement();
				) {
			// 1.Register the driver
			//Class.forName(DRIVER_NAME);  // java 1.7 bata yo step optional banako xa nagaraepani hunxa
			                             // forName is a method name  which load a driver
			                           //and class is the  name of class
			//4.excute the query ()structured query language)
			st.executeUpdate(SQL);//calling method 
			System.out.println("table  created");

		} catch (SQLException a) {
			a.printStackTrace();
		}/*finally {// finally is not necessary to do from java seven.....
		 this has been replaced by above method(try with resource)
			try {
				//5. close the connections 
				con.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}*/
	

}
	}
