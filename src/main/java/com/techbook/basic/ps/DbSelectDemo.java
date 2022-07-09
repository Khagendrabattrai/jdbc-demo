package com.techbook.basic.ps;

import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.techbook.utl.DbConnectionUtl;

public class DbSelectDemo {
	public static final String SQL = "select * from user_tbl where id=?";

	public static void main(String[] args) {
		try (PreparedStatement ps = DbConnectionUtl.getConnection().prepareStatement(SQL);) {
	 ps.setInt(1, 4);
		ResultSet rs = ps.executeQuery();
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
