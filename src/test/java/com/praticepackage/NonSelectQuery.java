package com.praticepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQuery {

	public static void main(String[] args) throws SQLException {

		// TODO Auto-generated method stub
		Connection conn=null;
		int result=0;
		try {
Driver driver=new Driver();
//1.register my sql to the database
DriverManager.registerDriver(driver);
//2.connect to the database
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","root");
System.out.println("connection is done");
//3.create query statement
Statement stat=conn.createStatement();
String Query="insert into tourism values('sneha','raipur','787687687');";
//update query
result=stat.executeUpdate(Query);
		}
catch (Exception e) {
	// TODO: handle exception
}
finally {
	if(result==1)
	{
		System.out.println("record updated suceessfully");
		System.out.println(result);
	}
	else
	{
		System.out.println("record not updated succesfully");
	}
}

	}

}
