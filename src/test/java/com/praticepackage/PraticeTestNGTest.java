package com.praticepackage;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class PraticeTestNGTest {

	
	@Test(invocationCount = 0)
	public void createTest()
	{
	int a[]= {2,3,4,5,};
	System.out.println(a[10]);
		
	
	}
	@Test()
	public void editTest()
	{
		System.out.println("----edit test-----");
	}
	@Test(dependsOnMethods = "createTest")
	public void deleteTest()
	{
		System.out.println("----delete test------");
	}
}
