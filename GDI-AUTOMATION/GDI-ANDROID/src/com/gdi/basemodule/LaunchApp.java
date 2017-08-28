package com.gdi.basemodule;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LaunchApp 
{
	public  AndroidDriver launchApplication(String appName) throws MalformedURLException, InterruptedException 
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		File appDir=new File("apps");
		File app= new File(appDir,appName);
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy J2 (2016)");
		AndroidDriver androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		return androidDriver;
	}	 
}
