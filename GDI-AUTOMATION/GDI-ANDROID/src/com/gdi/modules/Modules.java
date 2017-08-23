package com.gdi.modules;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.dynamite.us.DynamiteUSUseCases;
import com.gdi.basemodule.LaunchApp;

import io.appium.java_client.android.AndroidDriver;


public class Modules {
WebDriver driver;
@Test
public void dynamiteUS() throws MalformedURLException, InterruptedException{
	//Launching app
	LaunchApp lapp=new LaunchApp();
	AndroidDriver androidDriver=lapp.launchApplication("dynamite_com.1.16.3.apk");
	//login usecase
	DynamiteUSUseCases.login(androidDriver);
	
}
}
