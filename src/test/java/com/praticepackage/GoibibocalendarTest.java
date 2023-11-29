package com.praticepackage;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibibocalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//launch the browser
		WebDriver driver = new ChromeDriver();
//maximize the browser
		driver.manage().window().maximize();
//enter the url
		driver.get("https://www.goibibo.com/");
//wait for pageload
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//manage the popup
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
//driver.findElement(By.xpath("//div[text()='November 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='29']")).click();

		for (;;) {
			try {
				driver.findElement(By.xpath("//div[text()='February 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='14']")).click();
				break;
			} catch (org.openqa.selenium.NoSuchElementException e) {

				// TODO: handle exception
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		driver.findElement(By.xpath("//span[text()='Done']")).click();
	}

}
