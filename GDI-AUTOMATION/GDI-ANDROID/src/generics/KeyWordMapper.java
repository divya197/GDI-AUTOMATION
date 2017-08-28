package generics;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;

public class KeyWordMapper 
{
	public static void executekeyword(AndroidDriver androidDriver, String action, String input1, ExtentTest testReport) throws InterruptedException
	{
		if(action.equalsIgnoreCase("click"))
		{
			ActionMethos.click(androidDriver, input1, testReport);
		}
	}
	public static void executekeyword(AndroidDriver androidDriver, String action,String input1, String input2, ExtentTest testReport) throws InterruptedException
	{
		if(action.equalsIgnoreCase("sendkeys"))
		{
			ActionMethos.sendKeys(androidDriver,input1, input2, testReport);
		}
	}
}
	
