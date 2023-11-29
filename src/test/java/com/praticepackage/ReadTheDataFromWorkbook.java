package com.praticepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTheDataFromWorkbook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\TESTCASES_OTMS.xlsx");
Workbook wb=WorkbookFactory.create(fis);
Sheet sheet = wb.getSheet("Sheet1");
Row row = sheet.getRow(1);
 Cell cell = row.getCell(2);
 String value = cell.getStringCellValue();
 System.out.println(value);
 wb.close();

	}

}
