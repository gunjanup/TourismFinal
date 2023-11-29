package com.praticepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelTest {
	@DataProvider
	
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
		//create obj of fis to read the file
	FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\practice.xlsx");
	//call workbook factory
	Workbook wb=WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet1");
	//int rowcount=sh.getLastRowNum();
int rowcount1=sh.getPhysicalNumberOfRows();
	int cellcount=sh.getRow(0).getLastCellNum();
	Object[][] obj=new Object[rowcount1][cellcount];
	for(int i=0;i<rowcount1;i++)
	{
		for(int j=0;j<cellcount;j++)
		{
			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		}

	
	}
	return obj;
	}
}
	


