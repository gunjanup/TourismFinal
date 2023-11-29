package com.otmobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	//declaration
	@FindBy(name="fname")
	private WebElement FullName;
	
	@FindBy(name="mobilenumber")
	private WebElement MobileNumber;

	@FindBy(name="email")
	private WebElement Email;
	
	@FindBy(name="password")
	private WebElement Password;
	@FindBy(name="submit")
	private WebElement CreateAccount;
	
	
	//initialization
	public SignupPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	public WebElement getFullName() {
		return FullName;
	}
	public WebElement getMobileNumber() {
		return MobileNumber;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	//buisness logic
	public void Signup(String fn,String mb,String em,String pass)
	{
		FullName.sendKeys(fn);
		MobileNumber.sendKeys(mb);
		Email.sendKeys(em);
		Password.sendKeys(pass);
		
		
	}
	
	
		
		
	}
