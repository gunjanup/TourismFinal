package com.praticepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICCRankings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
String countryname="Australia";
Thread.sleep(1000);
List<WebElement> ele=driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]/span[2]"));
boolean flag=false;
for(WebElement webele:ele)
{
String countryNames=webele.getText();
if(countryNames.equals(countryname))
{
	System.out.println("country is present");
	flag=true;
	break;
}
}
if(!flag)
{
System.out.println("not present");	
}
             




	}

	
}
