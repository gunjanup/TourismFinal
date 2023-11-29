package com.praticepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bigbasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://www.bigbasket.com/");
driver.findElement(By.xpath("//div[@class='Header___StyledCategoryMenu2-sc-19kl9m3-13 ibVaum']")).click();
WebElement beverages=driver.findElement(By.xpath("//div[@id='headlessui-menu-items-:R1769b6:']/descendant::a[.='Beverages']"));
Actions action=new Actions(driver);
action.moveToElement(beverages).perform();

	}






	}

