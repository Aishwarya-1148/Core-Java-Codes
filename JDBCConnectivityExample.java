package com.JDBCConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnectivityExample {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/java_Internship?autoReconnect=true&userSSL=false";
		String user = "root";
		String pass = "root";
		
		try 
		{
			// step 1 : load and register the driver class
			// step 2 : establish the connection 
			// step 3 : create statement 
			// step 4 : Execute query
			// step 5 : close the connection 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url , user , pass );
			
			System.out.println("----- Connection Created ....! ");
			Statement st = con.createStatement(); 
			ResultSet rs = st.executeQuery("select * from student");
			
			System.out.println(" ---------- The Student Details are --------------- ");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ " | " +
								   rs.getString(2)+" | " +
								   rs.getInt(3)+ " | " +
								   rs.getInt(4)+ " | " +
								   rs.getString(5));	
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
