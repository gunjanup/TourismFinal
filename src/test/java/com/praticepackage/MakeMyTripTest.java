package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://www.makemytrip.com/");
Actions act=new Actions(driver);
act.doubleClick().click().perform();
Thread.sleep(1000);
act.moveByOffset(50,50).click().perform();
//driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
//driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
}
}
