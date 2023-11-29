package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void soft()
	{
		String exp="TMS | Tourism System";
		org.testng.asserts.SoftAssert sa=new org.testng.asserts.SoftAssert();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/");
		String actual=driver.getTitle();
		sa.assertEquals(actual,exp);
		System.out.println(actual);
		sa.assertAll();
		
		
		
	}

}
