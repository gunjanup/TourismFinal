package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
WebElement nametextfield = driver.findElement(By.id("inputUsername"));
nametextfield.sendKeys("gunjan");
WebElement passwordtextfield=driver.findElement(By.name("inputPassword"));
passwordtextfield.sendKeys("gunjan");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("gunjan");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("gpra1886@gmail.com");
driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("6768789798");
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
System.out.println(driver.findElement(By.cssSelector("form p")).getText());
driver.findElement(By.cssSelector(".go-to-login-btn")).click();
nametextfield.sendKeys("rahul");
driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
driver.findElement(By.className("signInBtn")).click();
	}

}
