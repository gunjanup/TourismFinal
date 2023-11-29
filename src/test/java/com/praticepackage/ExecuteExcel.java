package com.praticepackage;

import org.testng.annotations.Test;

public class ExecuteExcel {
	@Test(dataProviderClass = DataProviderExcelTest.class,dataProvider = "data")
	public void getData(String OrgName,String location)
	{
		System.out.println("from---"+OrgName+"dtsn----"+location);
	}
	}

