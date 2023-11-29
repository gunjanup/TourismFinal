package com.otmobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TourPackagePage {

	@FindBy(xpath="//input[@id='datepicker' and @class='date hasDatepicker']")
	private WebElement From;
	
	@FindBy(xpath="//span[.='November']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='22']")
	private WebElement FromDate;
	
	@FindBy(xpath="//input[@id='datepicker1']")
	private WebElement To;
	
	@FindBy(xpath="//span[.='November']/ancestor::div[@id='ui-datepicker-div']/descendant::a[.='25']")
	private WebElement ToDate;
	
	@FindBy(xpath="//input[@name='comment']")
	private WebElement comment;
	
	@FindBy(xpath="//button[@name='submit2']")
	private WebElement submit;
	
	public TourPackagePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getFrom() {
		return From;
	}

	public WebElement getFromDate() {
		return FromDate;
	}

	public WebElement getTo() {
		return To;
	}

	public WebElement getToDate() {
		return ToDate;
	}

	public WebElement getComment() {
		return comment;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
}
