package com.praticepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class CreateDatabaseFetchnameAndData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

Driver driver=new Driver();
Connection conn=null;
String name;
Scanner scan=new Scanner(System.in);
System.out.println("enter name");
name=scan.nextLine();

//register the 
try {
DriverManager.registerDriver(driver);
//get connection of database
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism", "root","root");
//create statement
Statement state=conn.createStatement();

ResultSet rs=state.executeQuery("select * from empname");
//check if result set is empty
if(rs.next()==false)
{
	System.out.println("result set is empty in java");
}
while(rs.next())
{
String name1=rs.getString("parakash");
System.out.println(name);
}


	
}
catch (Exception e) {
	// TODO: handle exception
}
finally {
//close the database
conn.close();
}

}
	}
