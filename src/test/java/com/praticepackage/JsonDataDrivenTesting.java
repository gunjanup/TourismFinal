package com.praticepackage;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataDrivenTesting {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
FileReader filepath=new FileReader("C:\\Users\\91891\\eclipse-workspace\\com.otm.Yatrisuvidha\\src\\test\\resources\\Tourism.json");
//JSONParser is used to read/write json formatted file
JSONParser json=new JSONParser();

Object obj=json.parse(filepath);
//read data from json file
JSONObject map=(JSONObject)obj;
String value=(String) map.get("BROWSER");
System.out.println(map.get("url"));
System.out.println(map.get("email"));
System.out.println(map.get("password"));

	}

}
