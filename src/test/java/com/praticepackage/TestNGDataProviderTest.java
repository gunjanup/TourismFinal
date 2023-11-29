package com.praticepackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.Genericutils.ExcelUtils;

public class TestNGDataProviderTest {
	@Test(dataProvider = "storedata")
	public void getdata(String from,String dtsn)
	{
	System.out.println("travelling from"+from +"to"+dtsn);	
	}
	@DataProvider
	public Object[][] storedata()
	{
		Object[][] obj=new Object[2][2];
		obj[0][0]="benguluru";
		obj[0][1]="mysore";
		
		
		obj[1][0]="mysore";
		obj[1][1]="hyderabad";
		
		return obj;
		
		
		
		
	}
	@DataProvider
	public void getdataFromExcel() throws EncryptedDocumentException, IOException
	{
		ExcelUtils elib=new ExcelUtils();
		Object[][] value=elib.getMultipleSetofData("Sheet1");
		return value;
		
	}
	

}
