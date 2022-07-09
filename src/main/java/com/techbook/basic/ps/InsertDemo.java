package com.techbook.basic.ps;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.techbook.utl.DbConnectionUtl;

public class InsertDemo {
	private static final String SQL = "insert into user_tbl(user_name,password) values(?,?)";

	public static void main(String[] args) {
		try (PreparedStatement ps = DbConnectionUtl.getConnection().prepareStatement(SQL);) {
			ps.setString(1,"deepak");
			ps.setString(2, "qwerty");
			ps.executeUpdate();
			System.out.println("inserted values ");

		} catch (SQLException | ClassNotFoundException a) {
			a.printStackTrace();
		}

	}
}
