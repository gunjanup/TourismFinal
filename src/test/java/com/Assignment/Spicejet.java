package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Spicejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@data-testid=\"round-trip-radio-button\"]/descendant::*[name()='svg']")).click();
		WebElement formtextfield = driver.findElement(By.xpath(" //div[@data-testid='to-testID-origin']//input[@type='text']"));
		formtextfield.sendKeys("AMD");
		WebElement totextfield=driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/descendant::input[@type=\"text\"]"));
		totextfield.sendKeys("ATQ");
		
		
		
	}

}
