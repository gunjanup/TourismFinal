package com.praticepackage;

import org.testng.annotations.Test;

public class ExecuteDpTest {
@Test(dataProviderClass = TestNGDataProviderTest.class,dataProvider = "storedata")
public void getData(String from,String dtsn)
{
	System.out.println("from---"+from+"dtsn----"+dtsn);
}
}
