package com.otmobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
@FindBy(linkText = "/ Sign In")
private WebElement signin;

@FindBy(xpath="//input[@id='email' and  @placeholder='Enter your Email']")
private WebElement email;

@FindBy(xpath="//input[@id='password' and @placeholder='Password']")
private WebElement password;

@FindBy(xpath="//input[@value='SIGNIN' and @ name='signin']")
private WebElement submit;

public SigninPage(WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public WebElement getSignin() {
	return signin;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getSubmit() {
	return submit;
}
//buisness logic
public void SigninAsUser(String username,String Pass) {
	signin.click();
	email.sendKeys(username);
	password.sendKeys(Pass);
	submit.click();
	
	
	
	
	
	
}



}
