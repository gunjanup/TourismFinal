package com.crm.Genericutils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtils {
	public int getRandomNo()
	{
		Random ran=new Random(); 
		int random=ran.nextInt(500);
		return random;
	}
	public String systemDate()
	{
		Date date=new Date();
		String systemdate=date.toString();
		return systemdate;
	}
	public String systemDataInFormat()
	{
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy HH-mm-ss");
		Date date=new Date();
		String systemDataInFormat=dateformat.format(date);
		return systemDataInFormat;
		
		
	}

}
