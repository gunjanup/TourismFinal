package com.yatrisuvidhaTourPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.Genericutils.DataBaseUtils;
import com.crm.Genericutils.ExcelUtils;
import com.crm.Genericutils.FileUtils;
import com.crm.Genericutils.WebdriverUtils;
import com.otmobjectrepo.SigninPage;

public class CreatedTourPackageisVisibleinTourHistory {

@Test
public void Tourhistory() throws IOException
{
	// TODO Auto-generated method stub
	//create object of properties 
	FileUtils fib=new FileUtils();
	WebdriverUtils wib=new WebdriverUtils();
	ExcelUtils elib=new ExcelUtils();
	
	String BROWSER=fib.readDataFromPropertiesFiles("browser");
	String URL=fib.readDataFromPropertiesFiles("url");
	String EMAIL=fib.readDataFromPropertiesFiles("email");
	String PASSWORD=fib.readDataFromPropertiesFiles("password");
    WebDriver driver=new EdgeDriver();
    driver.get(URL);
    wib.maximizebrowser(driver);
    wib.implicityTimeout(driver,10);
	SigninPage sp=new SigninPage(driver);
	sp.getSignin().click();
	sp.getEmail().sendKeys(EMAIL);
	sp.getPassword().sendKeys(PASSWORD);
    sp.getSubmit().click();
WebElement details = driver.findElement(By.xpath("//h4[.='Package Name: Indonesia']/ancestor::div[@class='rom-btm']/descendant::a[.='Details']"));
int yaxis = details.getRect().getY();
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,"+yaxis+")");
details.click();
driver.findElement(By.xpath("//input[@id='datepicker' and @class='date hasDatepicker']")).click();
driver.findElement(By.xpath("//span[.='November']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='22']")).click();
driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
driver.findElement(By.xpath("//span[.='November']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='25']")).click();
WebElement comment=driver.findElement(By.xpath("//input[@name='comment']"));
Actions act=new Actions(driver);
act.moveToElement(comment).click().perform();
comment.sendKeys("Indonesia trip");
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
	driver.findElement(By.linkText("My Tour History")).click();
WebElement bookid=driver.findElement(By.xpath("//td[.='#BK551']"));
String Bookidtext=bookid.getText();
System.out.println("booidtext is"+Bookidtext);
if(Bookidtext.contains("#BK"))
{
	System.out.println("booking id is created");
}
else
{
	System.out.println("booking id is not been created");
}

}
}
