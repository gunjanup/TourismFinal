package com.praticepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.Genericutils.IPathConstants;

public class TestUtil {

	public Object[][] getMultipleSetofData(String Sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\tourismsignup.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(Sheet);
		int rowcount=sh.getPhysicalNumberOfRows();
		int cellcount=sh.getRow(0).getLastCellNum();
		Object[][] obj=new Object[rowcount][cellcount];
		for(int i=2;i<rowcount;i++)//row
		{
			for(int j=0;j<cellcount;j++)//cell
			{
			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();	
			}
		}
		return obj;
	}
	}
	
	
