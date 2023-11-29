package com.yatrisuvidhaSignin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import com.crm.Genericutils.ExcelUtils;
import com.crm.Genericutils.FileUtils;
import com.crm.Genericutils.WebdriverUtils;
import com.otmobjectrepo.ChangePassword;
import com.otmobjectrepo.LogoutPage;
import com.otmobjectrepo.SigninPage;

public class VerifythatAdminIsAbleToChangePassword {


		// TODO Auto-generated method stub
@Test
public void passwordSet() throws InterruptedException, IOException
{


	FileUtils fib=new FileUtils();
	WebdriverUtils wib=new WebdriverUtils();
	ExcelUtils elib=new ExcelUtils();
	
	String BROWSER = fib.readDataFromPropertiesFiles("browser");
	String URL = fib.readDataFromPropertiesFiles("url");
	String email = fib.readDataFromPropertiesFiles("email");
	String PASSWORD = fib.readDataFromPropertiesFiles("password");
    WebDriver driver=new EdgeDriver();
    driver.get(URL);
    wib.maximizebrowser(driver);
    wib.implicityTimeout(driver,10);
	SigninPage sp=new SigninPage(driver);
	sp.getSignin().click();
	sp.getEmail().sendKeys(email);
	sp.getPassword().sendKeys(PASSWORD);
    sp.getSubmit().click();
    
   String currentpass = elib.readDataFromExcel("Sheet1", 1, 1);
   String newpass=elib.readDataFromExcel("Sheet2", 1, 2);
   String confirmpass=elib.readDataFromExcel("Sheet1", 1, 3);
   
   ChangePassword cb=new ChangePassword(driver);
   cb.changePassword(currentpass, newpass, confirmpass);
   cb.getChange();
   
   LogoutPage lp=new LogoutPage(driver);
   lp.logoutAsUser();
   




		

	}

}
