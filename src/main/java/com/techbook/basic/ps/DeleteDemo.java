package com.techbook.basic.ps;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.techbook.utl.DbConnectionUtl;

public class DeleteDemo {
		public static final String SQL = "delete from  user_tbl where id =?"; 
		public static void main(String[] args)  {
			try (PreparedStatement ps = DbConnectionUtl. getConnection().prepareStatement(SQL);){
				ps.setInt(1, 6);
				ps.executeUpdate();
				System.out.println(" deleated  ");

			} catch (SQLException | ClassNotFoundException a) {
				a.printStackTrace();
			

			}
	}

}
