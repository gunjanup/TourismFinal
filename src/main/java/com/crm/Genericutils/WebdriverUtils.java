package com.crm.Genericutils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * this class is webdriver utility class
 */
public class WebdriverUtils {
/*
 * This method is used to maximize the window	
 */
public void maximizebrowser(WebDriver driver)
{
	driver.manage().window().maximize();
}
public void implicityTimeout(WebDriver driver,int seconds)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
}
/*This method is used to take screeshot
 * 
 * 
 */
public static String getScreenshot(WebDriver driver,String Screenshot) throws IOException
{
TakesScreenshot ts=(TakesScreenshot)driver;
File Src=ts.getScreenshotAs(OutputType.FILE);
String path="./Screenshot"+Screenshot+".png";
File dst=new File(path);
FileUtils.copyFile(Src, dst);
return path;
}
/*
 * this method is used to close the browser
 */
public void closeBrowser(WebDriver driver)
{
driver.close();	
}

}
