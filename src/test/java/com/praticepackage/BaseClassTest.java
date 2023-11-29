package com.praticepackage;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.crm.Genericutils.DataBaseUtils;
import com.crm.Genericutils.ExcelUtils;
import com.crm.Genericutils.FileUtils;
import com.crm.Genericutils.WebdriverUtils;

public class BaseClassTest {
	
	public DataBaseUtils dlib=new DataBaseUtils();
	public ExcelUtils elib=new ExcelUtils();
	public FileUtils flib=new FileUtils();
	public WebdriverUtils wlib=new WebdriverUtils();
	public WebDriver driver;
	
	@BeforeSuite
	public void config_BS() throws SQLException
	{
//switching browser in run time -Run time polymorphism
	dlib.connection();
	System.out.println("connected to database");
			
	}
	@BeforeClass
	public void 

}

