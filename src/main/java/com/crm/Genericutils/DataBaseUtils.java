package com.crm.Genericutils;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;
/**this method is used to read and validate data from database
 * 
 * 
 */

public class DataBaseUtils {
	Connection conn=null;
	public void connection() throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		conn=DriverManager.getConnection(IPathConstants.DBURL,IPathConstants.DBUSERNAME,IPathConstants.DBPASSWORD);
		
	}
	public String executableAndGetData(int celldata,String ExpData) throws SQLException
	{
		Statement state=conn.createStatement();
		String query="select * from empname";
		ResultSet result= state.executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
			String actual=result.getString(celldata);
			if(actual.equalsIgnoreCase(ExpData))
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("project created successfully");
			return ExpData;
		}
		else
			
		{
			System.out.println("project is not created");
			return "";
		}
		
	}
	public void disconnectDB() throws SQLException 
	{
		conn.close();
	}
}
