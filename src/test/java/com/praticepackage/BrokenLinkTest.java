package com.praticepackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {
public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
//navigate to site
driver.get("http://localhost:8888/index.php?action=Login&module=Users");
//finding all the available link on webpage
List<WebElement> links=driver.findElements(By.tagName("a"));
//iterating each link and checking the response status
for(WebElement link:links)
{
	String url=link.getAttribute("href");
	verifylink(url);
}
driver.quit();
}
public static void verifylink(String url)
{
	try {
		URL link=new URL(url);
		HttpsURLConnection httpURLConnection=(HttpsURLConnection)link.openConnection();
		httpURLConnection.setConnectTimeout(3000);
		httpURLConnection.connect();
		if(httpURLConnection.getResponseCode()==200)
		{
	System.out.println(url+"-----"+httpURLConnection.getResponseMessage());		
		}
		else
		{
			System.out.println(url+"-----"+httpURLConnection.getResponseMessage());			
		}
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(url+"----"+"is a broken link");
	}
}

}
