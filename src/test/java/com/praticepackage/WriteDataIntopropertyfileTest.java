package com.praticepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteDataIntopropertyfileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//create object for properties class
Properties pobj=new Properties();

//create obj for fileOutput stream
FileOutputStream fout=new FileOutputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\commondata.properties");
pobj.store(fout,"write data");
FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\commondata.properties");
pobj.load(fis);
String BROWSER=pobj.getProperty("browser");
String URL=pobj.getProperty("url");
String USERNAME=pobj.getProperty("username");
String PASSWORD=pobj.getProperty("password");

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(URL);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.findElement(By.name("user_name")).sendKeys(USERNAME);
driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
driver.findElement(By.id("submitButton")).click();






}
}