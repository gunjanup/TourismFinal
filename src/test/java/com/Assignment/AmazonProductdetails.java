package com.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonProductdetails {

	@Test
	public void productamazon(){
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\" and @name=\"field-keywords\"]"))
				.sendKeys("dell");
		driver.findElement(By
				.xpath("//input[@id=\"nav-search-submit-button\" and @class=\"nav-input nav-progressive-attribute\"]"))
				.click();
		List<WebElement> allproductname = driver
				.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		for (WebElement product : allproductname)

		{
			String productname = product.getText();
			System.out.println(productname);
			WebElement productprice = driver.findElement(By.xpath("//span[contains(text(),'" + productname
					+ "')]/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']"));
			System.out.println(productprice.getText());
		}
		driver.quit();

	}

}
