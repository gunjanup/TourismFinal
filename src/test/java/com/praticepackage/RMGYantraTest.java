package com.praticepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.Resultset;

public class RMGYantraTest {

	public static void main(String[] args) throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
Connection conn=null;

WebDriver driver1=new ChromeDriver();
driver1.get("http://rmgtestingserver:8084/");
driver1.manage().window().maximize();
driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//sign in to the application
driver1.findElement(By.xpath("//input[@id='usernmae']")).sendKeys("rmgyantra");
driver1.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("rmgy@9999");
driver1.findElement(By.xpath("//button[text()='Sign in']")).click();
//create project

driver1.findElement(By.linkText("Projects")).click();
driver1.findElement(By.xpath("//span[.='Create Project']")).click();
driver1.findElement(By.xpath("//input[@name='projectName']")).sendKeys("yatri saral");
driver1.findElement(By.name("createdBy")).sendKeys("vijayalakshmi");
WebElement projectstatus = driver1.findElement(By.xpath("//label[text()='Project Status ']/following::select"));
projectstatus.click();
Select select=new Select(projectstatus);
Thread.sleep(1000);
select.selectByIndex(2);
driver1.findElement(By.xpath("//input[@value='Add Project']")).click();
//register the driver
Driver driver=new Driver();
DriverManager.registerDriver(driver);
//get connection of database
Connection con=DriverManager.getConnection(null);
//execute query
Statement state=con.createStatement();
String query="Select * from project;";
Resultset result=(Resultset) state.executeQuery(query);
;






	}

}
