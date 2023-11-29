package com.otmobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTourHistoryPage {
@FindBy(linkText = "My Tour History")
private WebElement TourHistory;

public MyTourHistoryPage(WebDriver driver)
{
	PageFactory.initElements (driver,this);
}
public WebElement getTourHistory() {
	return TourHistory;
	




}

}
