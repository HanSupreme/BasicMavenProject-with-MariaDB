package com.newproject.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTest {

	public static void main(String[] args) {
		

	}	
		public static void mariahDbConnection() {
			
			try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/sampledatabase","root","");

			if (connection.isValid(0)) {
				System.out.println("YYEESSSS, WE'RE CONNECTED!");
			} else {
				System.out.println("Hmm, we're not connected. Fix it!");
			}
			
		} catch(SQLException SQLexception) {
			System.out.println("java.sql.SQLSyntaxErrorException");
		} catch(ClassNotFoundException classNotFoundException) {
			System.out.println("ClassNotFoundException");
		}
		
	}

}
