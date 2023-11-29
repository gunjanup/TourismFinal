package com.otmobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//h4[.='Package Name: Indonesia']/ancestor::div[@class='rom-btm']/descendant::a[.='Details']")
private WebElement Tourpackage;

public HomePage(WebDriver driver)
{
PageFactory.initElements( driver,this);	
}

public WebElement getTourpackage() {
	return Tourpackage;
}

}
