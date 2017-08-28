package generics;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.android.AndroidDriver;

public class ActionMethos 
{

	
	public static void click(AndroidDriver driver, String input1, ExtentTest testReport) 
	{
		try 
		{
			driver.findElement(locator.getLocator(input1)).click();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			testReport.log(LogStatus.FAIL, "Failed to Click");
			return;
		}
		testReport.log(LogStatus.INFO, "Click on Element");
		testReport.log(LogStatus.PASS, "Clicked successfully");
	}
	
	public static void sendKeys(AndroidDriver driver, String input1,String input2, ExtentTest testReport)
	{
		try
		{
			driver.findElement(locator.getLocator(input1)).sendKeys(input2);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			testReport.log(LogStatus.INFO, "Enter the text :"+input2);
			testReport.log(LogStatus.FAIL, "Failed to enter the text: "+input2);
			return;
		}
		testReport.log(LogStatus.PASS, "Successfully entered the text: "+input2);
	}
}
