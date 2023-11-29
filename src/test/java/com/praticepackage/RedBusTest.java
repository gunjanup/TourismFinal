package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.redbus.in/");
		//wait for pageload
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		String year="2023";
		String month="dec";
		String date="23";
		driver.findElement(By.xpath("//div[@id=\"onwardCal\"]")).click();
		while(true)	
		{
			
		}
		
		
	}

}
