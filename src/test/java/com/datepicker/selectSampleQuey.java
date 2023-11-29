package com.datepicker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class selectSampleQuey {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
Connection conn=null;
int result=0;
try {
Driver driver=new Driver();
DriverManager.registerDriver(driver);
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root","root");
System.out.println("connection is establish");
Statement state = conn.createStatement();
String query="insert into tourism values('subhangi','raipur','6767867');";
int result1=state.executeUpdate(query);
if(result>=1)
{
	System.out.println("inserted sucessfully");
	System.out.println(result1);
}
else
{
	System.err.println("not inserted");
}
}
catch (Exception e) {
	// TODO: handle exception
}

	}
	}



