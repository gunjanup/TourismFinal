package com.otmobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePassword {
	//declaration
	@FindBy(xpath="//a[.='Change Password']")
	private WebElement changepassword;
	
	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
	private WebElement currentpassword;
	
	@FindBy(xpath="//input[@id='newpassword']")
	private WebElement confirmpassword;
	
	
	//initialization
	public ChangePassword(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	
	
	public WebElement getChangepassword() {
		return changepassword;
	}



	public WebElement getCurrentpassword() {
		return currentpassword;
	}



	public WebElement getConfirmpassword() {
		return confirmpassword;
	}



	//buisness logic
	public void changePassword(String cpass,String npass,String cnpass)
	{
		changepassword.click();
        changepassword.sendKeys(cpass);
        currentpassword.sendKeys(npass);
        confirmpassword.sendKeys(cnpass);
        
        
		
		
		
	}

}
