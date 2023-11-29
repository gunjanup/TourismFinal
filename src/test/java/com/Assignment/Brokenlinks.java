package com.Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		System.out.println("all links present"+alllinks.size());
		List<String> urllist=new ArrayList<String>() ;
		for(WebElement ele:alllinks)
		{
	String	url=ele.getAttribute("href");
	urllist.add(url);
	break;
		}

}
}
