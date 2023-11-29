package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://money.rediff.com/gainers/bse/dailygroupa");
	String text = driver.findElement(By.xpath("https://money.rediff.com/gainers/bse/dailygroupa")).getText();
	System.out.println(text);	
		
	}

}
