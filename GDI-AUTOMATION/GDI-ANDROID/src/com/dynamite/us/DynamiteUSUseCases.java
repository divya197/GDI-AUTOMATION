package com.dynamite.us;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.Property;

public class DynamiteUSUseCases {
	 public static void login(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 40);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Create Account']"))); 
	   
	   //Create an account
	    
	   driver.findElement(By.xpath(Property.getPropertyValue("CreateAccountText"))).click();
	   
	   //Enter your mail 
	   driver.findElement(By.xpath(Property.getPropertyValue("EmailIDTextField"))).sendKeys("test35@example.com");
	   driver.findElement(By.xpath(Property.getPropertyValue("JoinToEarnText"))).click();
	   
	   driver.findElement(By.xpath(Property.getPropertyValue("PasswordTextField"))).sendKeys("Test1234");
	   
	   
	   driver.findElement(By.xpath(Property.getPropertyValue("JoinToEarnText"))).click();
	   driver.findElement(By.xpath(Property.getPropertyValue("SignInButton"))).click();
}
}
