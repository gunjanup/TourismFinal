package com.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//rows in a table
	int	rows=driver.findElements(By.xpath("//table[@id='product' and @class='table-display']/tbody/tr[position()>1]")).size();
	System.out.println(rows);
	//columns
	int    cols  =driver.findElements(By.xpath("//table[@id='product' and @class='table-display']/descendant::th")).size();
	System.out.println(cols);
	
	//reterive specific row and column
System.out.println(	driver.findElement(By.xpath("//table[@id='product' and @class='table-display']/descendant::tr[8]/td[1]")).getText());
//reterive all the data from tables
for(int r=2;r<=rows+1;r++)
{
	for(int c=1;c<cols;c++)
	{
	String data=driver.findElement(By.xpath("//table[@id='product' and @class='table-display']/tbody/tr["+r+"]/td["+c+"]")).getText();
	System.out.println(data+"      ");
	}
	System.out.println();
}
driver.quit();
		
	}


}
