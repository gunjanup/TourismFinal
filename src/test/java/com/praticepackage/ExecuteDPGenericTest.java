package com.praticepackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.Genericutils.ExcelUtils;

public class ExecuteDPGenericTest {
@Test(dataProvider = "getdatafromExcel" ,dataProviderClass = DataProviderExcelTest.class)
public void getData(String orgname,String location)
{
	System.out.println("organisation name"+orgname+"location is"+location);
}
@DataProvider
public Object[][] getdatafromExcel() throws EncryptedDocumentException, IOException
{
	excelutils elib=new excelutils();
	Object[][] value=elib.getMultipleSetofData("Sheet1");
	return value;
}


}
