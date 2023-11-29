package com.vtigerorganization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadDatafrompropertyFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//create object of properties class-java.util
		WebDriver driver;
Properties p=new Properties();
//open the document in java readable format
FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\commondata.properties");


//3.load the document into properties class
p.load(fis);
//4.provide the key and read the value
String BROWSER=p.getProperty("browser");
System.out.println(BROWSER);
String  URL=p.getProperty("url");
System.out.println(URL);
String USERNAME=p.getProperty("username");
System.out.println(USERNAME);
String PASSWORD=p.getProperty("password");
System.out.println(PASSWORD);
if(BROWSER.equalsIgnoreCase("chrome"))
{
	 driver=new ChromeDriver();
}
else {
	 driver=new EdgeDriver();
}

driver.get(URL);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.findElement(By.name("user_name")).sendKeys(USERNAME);
driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
driver.findElement(By.id("submitButton")).click();
driver.quit();


		
		
		
	}

}
