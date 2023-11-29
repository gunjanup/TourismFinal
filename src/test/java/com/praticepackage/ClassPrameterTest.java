package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassPrameterTest {
	@Test
	public void cmdParameterTest() throws InterruptedException
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		Thread.sleep(1000);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		Thread.sleep(1000);
		driver.findElement(By.id("submitButton")).click();
	}

}
