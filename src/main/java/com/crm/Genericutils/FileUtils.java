package com.crm.Genericutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtils {
/**This method is used to read data from properties files
 * @author gunjan
 * @param key
 * @return 
 * @return
 * @throws Throwable
 */
	public String readDataFromPropertiesFiles(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\Tourism.properties");
		Properties plib=new Properties();
		plib.load(fis);
		String value=plib.getProperty(key);
		return value;
		
		
		
	}

}
