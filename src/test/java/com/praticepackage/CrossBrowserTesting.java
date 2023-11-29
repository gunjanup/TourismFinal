package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception
{
	if(browser.equalsIgnoreCase("firefox"))
{
driver=new FirefoxDriver();	
}
	else if (browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		throw new Exception("incorrect browser");
	}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@Test
public void verifytitle()
{
	driver.get("https://www.cowin.gov.in/");
	System.out.println("the title is"+driver.getTitle());
	Assert.assertEquals(driver.getTitle(),"CoWin");
	driver.quit();
	
}
}
