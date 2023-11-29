package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TourismDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.manage().deleteAllCookies();
	driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/index.php");
	
	}
	@DataProvider
//to fetch data from excel file
	public void getTestData()
	{
	}
	@Test
	
	public void signUP(String fn,String Mb,String email,String pass)
	{
	//enter data
		driver.findElement(By.name("fname")).sendKeys(null);
		driver.findElement(By.name("mobilenumber")).sendKeys(null);
		driver.findElement(By.name("email")).sendKeys(null);
		driver.findElement(By.name("password")).sendKeys(null);
		
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
