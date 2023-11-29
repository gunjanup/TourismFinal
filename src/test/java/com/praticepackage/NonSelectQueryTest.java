package com.praticepackage;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Logger;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQueryTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
//register the driver
		Connection con=null;
		int result=0;
try {		
Driver driver=new Driver();
DriverManager.registerDriver(driver);
//get connection of database
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root",
		"root");
//create statement
Statement state=con.createStatement();
//execute  a query ----->provide table name

String query="insert into tourism values('anjali','dehradun','7898989');";
String query1="alter table tourism add package varchar(40);";
  result=state.executeUpdate(query1);

if(result==1)
{
	System.out.println("data added successfully");
	System.out.println(result);
}
else {
	System.out.println("data not inserted succesfully");
}
		
}
catch (Exception e) {
	// TODO: handle exception
}

	
finally {
//close database
con.close();

}
}
}

