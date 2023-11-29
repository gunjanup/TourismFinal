package com.praticepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\TESTCASES_OTMS.xlsx");
//open workbook in read mode
Workbook workbook=WorkbookFactory.create(fis);
 Sheet sh = workbook.getSheet("Sheet1");
Row row = sh.getRow(2);
Cell cell = row.createCell(3);
cell.setCellValue("qspiders");
//open same workbook in write mode and save the file
FileOutputStream fout=new FileOutputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\writeexcel.xlsx");
workbook.write(fout);
workbook.close();



 


	}

}
