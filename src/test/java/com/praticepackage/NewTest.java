package com.praticepackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void testmethod1() {
	  System.out.println("test method 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method 1");
  }
  @BeforeMethod
  public void beforeMethod2()
  {
	  System.out.println("before method 2");
  }
  @Test   
  public void TestMethod2()
  {
	  System.out.println("test method 2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method 1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }
  @AfterMethod
  public void afterMethod2()
  {
	  System.out.println("after method 2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	System.out.println("after test");  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
