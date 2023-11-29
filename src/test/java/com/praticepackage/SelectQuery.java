package com.praticepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//register the driver
Driver driver=new Driver();
DriverManager.registerDriver(driver);
//get connection of database
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root",
				"root");
//execute query
Statement state=con.createStatement();
//execute  a query--->
String Query="select * from tourism;";
ResultSet result=state.executeQuery(Query);
while(result.next())
{
	System.out.println(result.getString(1)   +result.getString(2)   +result.getString(3)  );
}
//close the database
con.close();

	}
}
	


