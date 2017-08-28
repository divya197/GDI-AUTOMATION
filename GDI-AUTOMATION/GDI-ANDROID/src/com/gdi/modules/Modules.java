package com.gdi.modules;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.dynamite.us.DynamiteUSUseCases;
import com.gdi.basemodule.LaunchApp;

import com.gdi.basemodule.ExtentReport;
import io.appium.java_client.android.AndroidDriver;


public class Modules extends ExtentReport
{
	WebDriver driver;
	@Test
	public void signIn() throws MalformedURLException, InterruptedException
	{
		//1)setting the report name
		ExtentReport.setReportName("GDIUSReports");
		//2)Launching app
		LaunchApp lapp=new LaunchApp();
		testReport=eReport.startTest("Login");
		AndroidDriver androidDriver=lapp.launchApplication("dynamite_com.1.16.3.apk");
		//3)Login usecase
		//DynamiteUSUseCases.signIn(androidDriver, testReport);
		DynamiteUSUseCases.NewRegistration(androidDriver, testReport);
		DynamiteUSUseCases.completeProfile(androidDriver, testReport);
		//DynamiteUSUseCases.ErrorLogin(androidDriver, testReport);
	}
}
