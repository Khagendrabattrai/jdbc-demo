package com.techbook.basic;

import java.sql.SQLException;
import java.sql.Statement;

import com.techbook.utl.DbConnectionUtl;

public class DeleteDemo {
		public static final String SQL = "delete from  user_tbl where id =3"; 
		public static void main(String[] args)  {
			try (Statement st = DbConnectionUtl. getConnection().createStatement()) {
				st.executeUpdate(SQL);
				System.out.println(" deleated  ");

			} catch (SQLException | ClassNotFoundException a) {
				a.printStackTrace();
			

			}
	}

}
