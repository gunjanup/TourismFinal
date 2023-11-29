package com.praticepackage;

import org.testng.annotations.Test;

public class GroupDemo2 {
	@Test
	public void m3()
	{
		System.out.println("method m3");
	}
	@Test(groups={"smoke","regression"})
	public void m4()
	{
		System.out.println("method m4");
	}
	

}
