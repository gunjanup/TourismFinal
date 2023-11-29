package com.praticepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelfiel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
//get obj for physical representation
FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\TESTCASES_OTMS.xlsx");
Workbook wb=WorkbookFactory.create(fis);;
org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet1");

int rowcount=sh.getLastRowNum();
System.out.println(rowcount);
int celcount=sh.getRow(0).getLastCellNum();
System.out.println(celcount);
 for(int i=0;i<=rowcount;i++)//row
 {
	 for(int j=0;j<celcount;j++)//cell
	 {
		 String value=sh.getRow(i).getCell(j).getStringCellValue();
		 System.out.println(value);
		 System.out.println("");
	 }
 }
 System.out.println();



	}

}
