package com.praticepackage;

import org.testng.annotations.Test;

public class TestNGPracticeTest {
@Test(priority = 3,enabled = false)
public void createTest()
{ int a,b,c;
	try {
	 a=30;
	 b=0;
	
      c=a/b;
      System.out.println(c); {
		
	}
  	
	}
	catch (ArithmeticException e) {
		// TODO: handle exception
System.out.println("catch block");
	}
	
	
	
}
@Test(invocationCount = 1)
public void editTest()
{
	int a=10;
	int b=20;
	int c;
	c=a;
	a=b;
	b=c;
	System.out.println(a);
	System.out.println(b);
}
@Test(dependsOnMethods = "createTest")
public void deleteTest()
{
	int a=80;
	int b=78;
	int c=a+b;
	System.out.println(c);
}
}
