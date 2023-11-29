package com.praticepackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\writeexcel.xlsx");
Workbook wb=WorkbookFactory.create(fi);
org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet("Sheet1");
sh.createRow(5).createCell(1).setCellValue("qspiders");
sh.createRow(5).createCell(4).setCellValue(false);
FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\writeexcel.xlsx");
wb.write(fout);
wb.close();


	}

}
