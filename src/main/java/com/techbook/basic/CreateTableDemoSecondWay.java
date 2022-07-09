package com.techbook.basic;

import java.sql.SQLException;
import java.sql.Statement;
// by calling method 
import com.techbook.utl.DbConnectionUtl;

public class CreateTableDemoSecondWay {
	public static final String SQL = "create table user_tbl (id int not null auto_increment,user_name varchar(45),password varchar(45),primary key(id))"; 
		public static void main(String[] args)  {
			try (Statement st = DbConnectionUtl. getConnection().createStatement()) {
				st.executeUpdate(SQL);
				System.out.println("created table  ");

			} catch (SQLException | ClassNotFoundException a) {
				a.printStackTrace();
			

			}
	

}
}