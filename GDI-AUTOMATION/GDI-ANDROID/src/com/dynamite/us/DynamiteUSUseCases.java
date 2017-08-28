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
	   KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("CreateAccountText"), testReport); 
	  
	  
	   //Enter your mail 
	   KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("EmailIDTextField"), "test35@example.com", testReport);
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("JoinToEarnText"), testReport);
	   
	   //Enter your Password   
	   KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("PasswordTextField"), "Test1234", testReport);
	   
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("JoinToEarnText"), testReport);
	   
	   //click on signin button
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("SignInButton"), testReport); 
	   
	   //Notify me
	  
	   KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("NotifyButton"), testReport); 
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("NotifyButton"), testReport); 
	    
	   //UseMyLocation
	   KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("UseMyLocationButton"), testReport); 
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("UseMyLocationButton"), testReport); 
	  
	   //Allow
	   KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("AllowLocationButton"), testReport); 
	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("AllowLocationButton"), testReport); 
		  
	   
	 }
	 
      public static void NewRegistration(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException
      
     
      {
       KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("CreateAccountText"), testReport); 
    	  
   	   //Create an accounts
   	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("CreateAccountText"), testReport);
   	  
   	   //Enter your mail 
   	   KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("EmailIDTextField"), "test108@example.com", testReport);
   	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("JoinToEarnText"), testReport);
   	   
   	   //Enter your Password   
   	   KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("PasswordTextField"), "Test1234", testReport);
   	   
   	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("JoinToEarnText"), testReport);
   	   
   	   //click on signin button
   	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("SignInButton"), testReport); 
   	   
   	   //Notify me
   	  
   	   KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("NotifyButton"), testReport); 
   	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("NotifyButton"), testReport); 
   	    
   	   //UseMyLocation
   	   KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("UseMyLocationButton"), testReport); 
   	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("UseMyLocationButton"), testReport); 
   	  
   	   //Allow
   	   KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("AllowLocationButton"), testReport); 
   	   KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("AllowLocationButton"), testReport); 
   		    
   	   //10% off
   	   KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("CompleteProfilePopUp"), testReport); 
   	   KeyWordMapper.executekeyword(androidDriver, "getTextAssertion",Property.getPropertyValue("CompleteProfilePopUp"),"Complete Profile", testReport);
		  
      }

	
      
      
      
      
	 
      public static void  completeProfile(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException
      {
    	 
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("CompleteProfilePopUp"), testReport); 
       Thread.sleep(2000);
       KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("NewFirstName"), "Divya", testReport);
       KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("NewLastName"), "Tippa", testReport);
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("LastNameText"),testReport);
       Thread.sleep(1000);
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("NewBirthDay"), testReport); 
      
       Thread.sleep(1000);
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("NewCalenderOk"),testReport);
       KeyWordMapper.executekeyword(androidDriver, "scrollScreen",testReport);
       Thread.sleep(2000);
       
       KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("NewAddress1"),"richmond circle",testReport);
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("Address1Text"),testReport);
       KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("NewCity"),"Toronto",testReport);
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("CityText"),testReport);
       KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("NewPostalCode"),"M5E1W5",testReport);
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("CityText"),testReport);
       KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("NewPhoneNumber"),"1234567890",testReport);
       KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("NewPhoneNumber"),"897",testReport);
       
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("CityText"),testReport);
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("CompleteProfile"),testReport);
       Thread.sleep(4000);
       KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("CompleteProfileSuccesWindow"), testReport);
       KeyWordMapper.executekeyword(androidDriver, "getTextAssertion",Property.getPropertyValue("CompleteProfileSuccesWindow"),"COMPLETE PROFILE", testReport);
       Thread.sleep(3000);
       KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("CompleteProfileCloseButton"), testReport);
       KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("CompleteProfileCloseButton"),testReport);
       
       
       
      }
	 
	 
	 
      
      public static void ErrorLogin(AndroidDriver androidDriver, ExtentTest testReport) throws InterruptedException
      {
    	  KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("CreateAccountText"), testReport); 
    	  //Enter your mail 
   	   	  KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("EmailIDTextField"), "test35@example.com", testReport);
   	      KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("JoinToEarnText"), testReport);
   	   
   	      //Enter your Password   
   	      KeyWordMapper.executekeyword(androidDriver, "sendkeys", Property.getPropertyValue("PasswordTextField"), "7yhg6234", testReport);
   	   
   	      KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("JoinToEarnText"), testReport);
   	   
   	      //click on signin button
   	      KeyWordMapper.executekeyword(androidDriver, "click", Property.getPropertyValue("SignInButton"), testReport); 
   	      KeyWordMapper.executekeyword(androidDriver, "waitforElement", Property.getPropertyValue("LoginErrorMessage"), testReport); 
   	      KeyWordMapper.executekeyword(androidDriver, "getTextAssertion",Property.getPropertyValue("LoginErrorMessage"),"Please enter valid email address and password", testReport);
   	   
    	  
      }
	 
	 
	 
}
