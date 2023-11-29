package com.praticepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDatafromPropertiesFileForTourism {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//create object for properties class
		Properties pobj=new Properties();
		pobj.setProperty("browser","chrome");
		pobj.setProperty("url","http://rmgtestingserver/domain/Online_Tourism_Management_System/");
		pobj.setProperty("email","gpra1886@gmail.com");
		pobj.setProperty("password","Gunjanpr#18");
		
		//create obj for fileoutputStream
FileOutputStream fout=new FileOutputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\Tourism.properties");
		pobj.store(fout, "write data");
		
FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\Tourism.properties");
	pobj.load(fis);
	String BROWSER=pobj.getProperty("browser");
	String URL=pobj.getProperty("url");
	String USERNAME=pobj.getProperty("email");
	String PASSWORD=pobj.getProperty("password");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.xpath("//a[.='/ Sign In']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='email'  and @placeholder='Enter your Email']")).sendKeys(USERNAME);
	driver.findElement(By.name("//input[@id='password'  and @placeholder='Password']")).sendKeys(PASSWORD);
	driver.findElement(By.xpath("//input[@name='signin' and @value='SIGNIN']")).click();
	
	}

}
