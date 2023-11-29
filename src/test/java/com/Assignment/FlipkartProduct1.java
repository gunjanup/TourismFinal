package com.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProduct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		Action sendesc=act.sendKeys(Keys.ESCAPE).build();
		sendesc.perform();
		driver.findElement(By.name("q")).sendKeys("dell");
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		Action sendpagedown=act.sendKeys(Keys.PAGE_DOWN).build();
		sendpagedown.perform();
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String xpathrows="//*[@class=\"_1YokD2 _3Mn1Gg\"]/div";
		List<WebElement> listoftotal=driver.findElements(By.xpath(xpathrows));
		System.out.println("total no of rows:---"+listoftotal.size());
		for(int i=1;i<=listoftotal.size();i++)
		{

	String xpathbyexpression="//*[@class=\"_1YokD2 _3Mn1Gg\"]/div["+i+"]/div";
	List<WebElement> listofcols=driver.findElements(By.xpath(xpathbyexpression));
	System.out.println("list of cols----"+listofcols);
	
		
	
		
		
	}

}
}
