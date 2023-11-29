package com.otmobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement logout;
	
	public LogoutPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
	public WebElement getLogout() {
		return logout;
	}


	public void logoutAsUser()
	{
	logout.click();	
	}

}
