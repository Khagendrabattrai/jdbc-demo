package com.techbook.basic.ps;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techbook.utl.DbConnectionUtl;

public class UpdateTableDemo {

	private static final String SQL = "update user_tbl set user_name=?,password=?where id=?";

	public static void main(String[] args) {
		try (PreparedStatement ps = DbConnectionUtl.getConnection().prepareStatement(SQL);) {
			ps.setString(1,"zaarol");
			ps.setString(2, "ratio");
			ps.setInt(3,2);
			ps.executeUpdate();
			System.out.println("updated values");

		} catch (SQLException | ClassNotFoundException a) {
			a.printStackTrace();
		}

	}

}
