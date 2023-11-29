package com.vtigerorganization;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrganizationTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//get the data from property file
		Properties pobj=new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\commondata.properties");
pobj.load(fis);
String BROWSER=pobj.getProperty("browser");
String URL=pobj.getProperty("url");
String USERNAME=pobj.getProperty("username");
String PASSWORD=pobj.getProperty("password");
WebDriver driver=new ChromeDriver();

driver.get(URL);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.findElement(By.name("user_name")).sendKeys(USERNAME);
driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
driver.findElement(By.id("submitButton")).click();
//click on org link
driver.findElement(By.linkText("Organizations")).click();
driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
//enter the value in text fields
FileInputStream fi=new FileInputStream(null);
Workbook wb=WorkbookFactory.create(fi);
org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet1");
int count=sh.getLastRowNum();
System.out.println(count);
HashMap<String, String> map=new HashMap<String, String>();
for()



	}

}
