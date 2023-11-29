package com.praticepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class SelectQuerySampleTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=null;
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism","root",
				"root");
java.sql.Statement state = conn.createStatement();
		String query="select * from tourism;";
		ResultSet result = state.executeQuery(query);
		while(result.next())
		{
			System.out.println(result.getString(1));
		}
		conn.close();
}
}