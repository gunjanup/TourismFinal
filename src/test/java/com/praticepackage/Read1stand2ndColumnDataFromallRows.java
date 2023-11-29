



package com.praticepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read1stand2ndColumnDataFromallRows {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\TESTCASES_OTMS.xlsx");
Workbook workbook=WorkbookFactory.create(fis);
Sheet sheet = workbook.getSheet("Sheet1");
int count = sheet.getLastRowNum();
for(int i=0;i<count;i++)
	
{
	Row row = sheet.getRow(i);
	System.out.println(row.getCell(0).getStringCellValue());
	System.out.println(row.getCell(1).getStringCellValue());
	
}
























	}

}
