package com.crm.Genericutils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListImpClass implements ITestListener {
	ExtentReports report;
	ExtentTest test;
	

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String MethodName=result.getMethod().getMethodName();
		test=report.createTest(MethodName);
		Reporter.log(MethodName+"-----TestScript Execution starts from here-----");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.PASS,MethodName+"---->PASSED");
		Reporter.log(MethodName+"----TestScript executed successfully----");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String FS=result.getMethod().getMethodName();
		String  FScript=FS+new JavaUtils().systemDate();
		try {
			WebdriverUtils.getScreenshot(BaseClass.driver,FScript);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		test.log(Status.FAIL,result.getThrowable());
		test.log(Status.FAIL,FScript+"---->Failed");
		Reporter.log(FScript+"----test script execution failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	String MethodName=result.getMethod().getMethodName();
	test.log(Status.SKIP,MethodName+"----SKIPPED");
	test.log(Status.SKIP,result.getThrowable());
	Reporter.log(MethodName+"----TestScript execution skipped");
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	ExtentSparkReporter htmlreport=new ExtentSparkReporter("./Extentreport/report.html");
	htmlreport.config().setDocumentTitle("CRM");
	htmlreport.config().setTheme(Theme.STANDARD);
	htmlreport.config().setReportName("V-TIGER");
	
	report=new ExtentReports();
	report.attachReporter(htmlreport);
	report.setSystemInfo("browser","chrome");
	report.setSystemInfo("url", "http://localhost:8888");
	report.setSystemInfo("reportner name","gunjan");
	
	
	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//consolidate the report/clean older report
		report.flush();
	}

	

}
