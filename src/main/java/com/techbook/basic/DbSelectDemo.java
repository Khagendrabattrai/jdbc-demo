package com.techbook.basic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.techbook.utl.DbConnectionUtl;

public class DbSelectDemo {
	public static final String SQL = "select * from user_tbl";

	public static void main(String[] args) {
		try (Statement st = DbConnectionUtl.getConnection().createStatement();) {
		ResultSet rs = st.executeQuery(SQL);
		while (rs.next()) {
			System.out.println(" Id is:"+rs.getInt("id"));
		 System.out.println("username is:"+rs.getString("user_name"));
		 System.out.println("pasword is:"+rs.getString("password"));
		}
		} catch (SQLException | ClassNotFoundException a) {
			a.printStackTrace();

		}
	}
}
