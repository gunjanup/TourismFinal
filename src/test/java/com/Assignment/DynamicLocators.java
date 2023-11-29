package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://www.youtube.com/");
driver.findElement(By.xpath("//input[@id=\"search\"]/ancestor::div[@class=\"style-scope ytd-masthead\"]/descendant::button[@aria-label=\"Search with your voice\"]"));
driver.findElement(By.xpath("//input[@id='search']/ancestor::div[@class='style-scope ytd-masthead']/descendant::button[@aria-label='Create']")).click();
driver.findElement(By.xpath("//input[@id='search']/ancestor::div[@class=\"style-scope ytd-masthead\"]/descendant::button[@aria-label=\"Notifications\"]"));
		
	}

}
