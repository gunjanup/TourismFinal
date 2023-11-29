package com.praticepackage;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

public class SelectQueryJDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
		com.mysql.cj.jdbc.Driver driver=new com.mysql.cj.jdbc.Driver();
		//1.register my sql to the database
		DriverManager.registerDriver(driver);
		//2.Connect to the database
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","root");
		System.out.println("connection is done");
		//create query statement
		Statement stat=conn.createStatement();
		String Query="select TName from tourism where TAddress='bihar';";
		//execute query
		ResultSet resultset = stat.executeQuery(Query);
		while(resultset.next())
		{
		System.out.println(resultset.getString(1));	
		}
		
		}
		catch(Exception e)
		{
			
		}
		finally {
			conn.close();
			System.out.println("close connection");
		}
	}
}
	
