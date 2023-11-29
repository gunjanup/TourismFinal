package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		
driver.get("https://www.goibibo.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://www.irctc.co.in/nget/train-search");
driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-widget-content ng-tns-c58-10 ng-star-inserted']/descendant::a[text()='16']"))
.click();

	}

}
