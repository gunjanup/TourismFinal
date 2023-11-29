package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KsrtcTest {
	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.ksrtc.in/oprs-web/");
		//wait for pageload
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		//operations on element
		//select calender
driver.findElement(By.id("txtJourneyDate")).click();
driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/descendant::a[text()='8']")).click();
		
		
	}

}
