package com.crm.Genericutils;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.otmobjectrepo.LogoutPage;
import com.otmobjectrepo.SigninPage;

public class BaseClass  {
	// TODO Auto-generated constructor stub
	
FileUtils flib=new FileUtils();
ExcelUtils elib=new ExcelUtils();
DataBaseUtils dlib=new DataBaseUtils();
WebdriverUtils wlib=new WebdriverUtils();



public static WebDriver driver;


@BeforeClass
public void config_BeforeClass() throws IOException
{
String browser=flib.readDataFromPropertiesFiles("browser");
if(browser.equalsIgnoreCase("chrome"))
{
	driver=new ChromeDriver();
	
}
else if (browser.equalsIgnoreCase("firebox")) {
	driver=new FirefoxDriver();
}
else
{
	driver=new EdgeDriver();
}
wlib.maximizebrowser(driver);
wlib.implicityTimeout(driver, 10);

}
@BeforeMethod
public void config_BeforeMethod() throws IOException
{
	String URL=flib.readDataFromPropertiesFiles("url");
	String USERNAME=flib.readDataFromPropertiesFiles("email");
	String PASSWORD=flib.readDataFromPropertiesFiles("password");
	driver.get(URL);
	SigninPage sin=new SigninPage(driver);
	sin.SigninAsUser(USERNAME, PASSWORD);
	
}

@AfterMethod
public void configureafterMethod()
{
	LogoutPage lp=new LogoutPage(driver);
	lp.logoutAsUser();
}
@AfterClass
public void closetheBrowser()
{
	wlib.closeBrowser(driver);
}



}
