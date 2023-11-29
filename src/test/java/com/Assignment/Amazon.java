package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://www.amazon.in/");
WebElement searchbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
searchbox.sendKeys("iphone");
driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();



	}

}
