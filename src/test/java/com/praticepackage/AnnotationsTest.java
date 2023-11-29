package com.praticepackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsTest {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	@Test
	public void test1()
	{
		System.out.println("test 1");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void create5()
	{
		System.out.println("after method");
	}
	@Test
	public void Test2()
	{
		System.out.println("test 2");
	}
	@BeforeMethod
	public void beforeMethod2()
	{
		System.out.println("before method 2");
	}
	@AfterClass
	public void afterClass1()
	{
		System.out.println("after class 1");
	}
	@BeforeMethod
	public void beforeMethod3()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void beforeMethod4()
	{
		System.out.println("before  method 3");
	}
@AfterSuite
public void afterSuite()
{
	System.out.println("after suite");
}
}
