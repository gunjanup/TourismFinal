package com.yatrisuvidhaTourPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateTourPackageUser {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//create object of properties 
		Properties pobj=new Properties();
		pobj.setProperty("browser","chrome");
		pobj.setProperty("url","http://rmgtestingserver/domain/Online_Tourism_Management_System/index.php");
		pobj.setProperty("email","dverma7612@gmail.com");
		pobj.setProperty("password","6666");
		
		//create object for fileoutputstream
		FileOutputStream fout=new FileOutputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\tour.properties");
		pobj.store(fout,"write data");
		FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\tour.properties");
		pobj.load(fis);
		String BROWSER=pobj.getProperty("browser");
		String URL=pobj.getProperty("url");
		String EMAIL=pobj.getProperty("email");
		String PASSWORD=pobj.getProperty("password");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//a[.='/ Sign In']")).click();
		driver.findElement(By.xpath("//input[@id='email'  and @placeholder='Enter your Email']")).sendKeys(EMAIL);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password' and @placeholder='Password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//input[@value='SIGNIN' and @ name='signin']")).click();
		driver.findElement(By.xpath("//h4[.='Package Name: Americadgdgggsdsdsdfsfd']/ancestor::div[@class='rom-btm']/descendant::a[.='Details']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker' and @class='date hasDatepicker']")).click();
		driver.findElement(By.xpath("//span[.='November']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='28']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//span[.='November']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='30']")).click();
		
		
		WebElement comment=driver.findElement(By.xpath("//input[@name='comment']"));
		Actions act=new Actions(driver);
		act.moveToElement(comment).click().perform();
		comment.sendKeys("do the required booking");
		driver.findElement(By.xpath("//button[@name='submit2']")).click();
		WebElement success = driver.findElement(By.xpath("//strong[.='SUCCESS']/.."));
		String successtext = success.getText();
		System.out.println(successtext);
		if(successtext.equalsIgnoreCase("SUCCESS:Booked Successfully"))
		{
			System.out.println("booking is successfull by tourist");
		}
		else
		{
			System.out.println("booking is not been successful by tourist");
		}
		driver.manage().window().minimize();
		driver.quit();
	
	}

}
