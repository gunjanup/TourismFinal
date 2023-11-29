package com.crm.Genericutils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.SheetBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelUtils {
	

	/**This method is used to read data from excel file
	 * @author gunjan
	 * @param Sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */

public String readDataFromExcel(String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException
{
FileInputStream fi=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\practice.xlsxC:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\practice.xlsx");
Workbook wb=WorkbookFactory.create(fi);
org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(Sheetname);
String value=sh.getRow(row).getCell(cell).getStringCellValue();
return value;
}
/**This method is used to get the total row count
 * @author gunjan
 * @param Sheetname
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public int getLastRowNo(String Sheetname) throws EncryptedDocumentException, IOException
{
	FileInputStream fi=new FileInputStream(IPathConstants.Excelpath);
	Workbook wb=WorkbookFactory.create(fi);
	org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(Sheetname);
	int count = sh.getLastRowNum();
	return count;
}
/**
 * 
 * @param Sheetname
 * @param row
 * @param cell
 * @param data
 * @throws IOException
 */
public  void writeDataIntoExcel(String Sheetname,int row,int cell,String data) throws IOException
{
	FileInputStream fi=new FileInputStream(IPathConstants.Excelpath);
	Workbook wb=WorkbookFactory.create(fi);
	org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(Sheetname);
	sh.createRow(row).createCell(cell).setCellValue(data);
	FileOutputStream fout=new FileOutputStream(IPathConstants.Excelpath);
	wb.write(fout);
	wb.close();
}
public void readMultipleData(String sheetname,WebDriver driver) throws EncryptedDocumentException, IOException
{
	JavaUtils jlib=new 	JavaUtils();
	FileInputStream fi=new FileInputStream(IPathConstants.Excelpath);
	Workbook wb=WorkbookFactory.create(fi);
	org.apache.poi.ss.usermodel.Sheet sh=wb.getSheet(sheetname);
	int count=sh.getLastRowNum();
	HashMap<String ,String> map=new HashMap<String, String>();
	for(int i=0;i<=count;i++)
	{
		String key=sh.getRow(i).getCell(0).getStringCellValue();
		String value=sh.getRow(i).getCell(1).getStringCellValue();
		map.put(key, value);
	}
	for(Entry<String, String> set:map.entrySet())
	{
		if(set.getKey().contains("accountname"))
		{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue()+jlib.getRandomNo());
		}
		else
		{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
	}
	
	
}
public Object[][] getMultipleSetofData(String Sheet) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(IPathConstants.Excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(Sheet);
	int rowcount=sh.getPhysicalNumberOfRows();
	int cellcount=sh.getRow(0).getLastCellNum();
	Object[][] obj=new Object[rowcount][cellcount];
	for(int i=0;i<rowcount;i++)//row
	{
		for(int j=0;j<cellcount;j++)//cell
		{
		obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();	
		}
	}
	return obj;
}
}
