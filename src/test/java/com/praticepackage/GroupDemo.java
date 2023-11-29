package com.praticepackage;

import org.testng.annotations.Test;

public class GroupDemo{

	@Test(groups = "smoke")
	public void m1()
	{
		System.out.println("method m1");
	}
	
	@Test(groups="regression")
	public void m2()
	{
		System.out.println("method m2");
	}
}
