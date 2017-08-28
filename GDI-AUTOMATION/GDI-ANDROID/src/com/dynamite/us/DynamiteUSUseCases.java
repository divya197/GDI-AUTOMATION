package com.dynamite.us;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import generics.KeyWordMapper;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import generics.Property;
import io.appium.java_client.android.AndroidDriver;

public class DynamiteUSUseCases 
{
	 public static void signIn(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException
	 {
		WebDriverWait wait = new WebDriverWait(androidDriver, 40);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Create Account']"))); 
	  
	   //Create an account
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("CreateAccountText"), testReport);
	  
	   //Enter your mail 
	   KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("EmailIDTextField"), "test35@example.com", testReport);
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("JoinToEarnText"), testReport);
	   
	   //Enter your Password   
	   KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("PasswordTextField"), "Test1234", testReport);
	   
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("JoinToEarnText"), testReport);
	   
	   //click on signin button
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("SignInButton"), testReport); 
	 }
}
