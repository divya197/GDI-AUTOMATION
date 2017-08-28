package com.gdi.basemodule;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport 
{
	public  static ExtentReports eReport;
	public  static ExtentTest testReport;

	public static void setReportName(String reportName)
	{
		 eReport=new ExtentReports("./Reports/"+reportName+".html");
	}
	
	@AfterSuite
	public void endFrameWork()
	{
		eReport.flush();
		//driver.quit();
	}
}
