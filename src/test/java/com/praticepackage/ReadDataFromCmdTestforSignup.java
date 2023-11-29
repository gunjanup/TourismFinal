package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ReadDataFromCmdTestforSignup {

@Test
public void readData()
{
String BROWSER=System.getProperty("browser");
String URL=System.getProperty("url");
String FULLNAME=System.getProperty("fullname");
String MobileNum=System.getProperty("mobilenumber");
String EMAIL=System.getProperty("email");
String Password=System.getProperty("password");
WebDriver driver=new ChromeDriver();
driver.get(URL);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(FULLNAME);
driver.findElement(By.xpath("//input[@name='mobilenumber']")).sendKeys(MobileNum);
driver.findElement(By.xpath("//input[@id='email' and  @placeholder='Email id']")).sendKeys(EMAIL);
driver.findElement(By.xpath("//input[@id='submit']")).click();
driver.quit();


}
	}


