package com.techbook.basic;
// creating table calling method 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.techbook.utl.DbConnectionUtl;

public class InsertTableDemoSecondWay {
	private  static final String SQL = "insert into user_tbl(user_name,password) values('durga','red')";

	public static void main(String[] args)  {
		try (Statement st = DbConnectionUtl.getConnection().createStatement()) {
			st.executeUpdate(SQL);
			System.out.println("inserted values ");

		} catch (SQLException | ClassNotFoundException a) {
			a.printStackTrace();
		

		}

	}

}
