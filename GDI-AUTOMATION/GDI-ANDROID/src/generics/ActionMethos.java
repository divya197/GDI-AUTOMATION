package generics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public static void waitForElement(AndroidDriver driver, String input1, ExtentTest testReport)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.presenceOfElementLocated((locator.getLocator(input1)))); 
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			testReport.log(LogStatus.INFO, "Enter the text :"+input1);
			testReport.log(LogStatus.FAIL, "Timed out after 15 seconds waiting for presence of element located by: "+input1);
			return;
		}
		testReport.log(LogStatus.PASS, "Successfully identified the element: "+input1);
	}
	
	
	public static void getText(AndroidDriver driver,String input1,ExtentTest testReport)
    {
    	//String[] data=null;
    	String value = null;
    	try
    	{
    		WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.presenceOfElementLocated((locator.getLocator(input1)))); 
    		value=driver.findElement(locator.getLocator(input1)).getText();
    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
			testReport.log(LogStatus.INFO, "Get the text :"+input1);
			testReport.log(LogStatus.FAIL, "Unable to get the text : "+input1);
			return;
    	}
    	testReport.log(LogStatus.PASS, "Successfully captured the text from : "+input1);
    	
    }
	
	public static void getTextAssertion(AndroidDriver driver,String input1,String input2, ExtentTest testReport)
    {
    	String value = null;
    	try
    	{
    		WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.presenceOfElementLocated((locator.getLocator(input1)))); 
    		value=driver.findElement(locator.getLocator(input1)).getText();
    		if(value.equals(input2))
    		{
    			testReport.log(LogStatus.INFO, "Get the text from : "+input1);
    			testReport.log(LogStatus.PASS, "Actual string ="+value+ " and expected string ="+input2+ " Both are same");
    			    		}
    		else
    		{
    			testReport.log(LogStatus.FAIL, "Unable to get the text : "+input1);	
    		}
    		
    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
			testReport.log(LogStatus.INFO, "Get the text :"+input1);
			testReport.log(LogStatus.FAIL, "Actual string ="+value+ " and expected string ="+input2+ " Both are not same");
			return;
    	}

    	
     }
	
	
	
	public static void scrollScreen(AndroidDriver driver, ExtentTest testReport) 
	{
		try 
		{
			Dimension size = driver.manage().window().getSize();
		    System.out.println(size);
		     
		    //Find swipe start and end point from screen's with and height.
		    //Find starty point which is at bottom side of screen.
		    int starty = (int) (size.height * 0.80);
		    //Find endy point which is at top side of screen.
		    int endy = (int) (size.height * 0.20);
		    //Find horizontal point where you wants to swipe. It is in middle of screen width.
		    int startx = size.width / 2;
		    System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

		    //Swipe from Bottom to Top.
		    driver.swipe(startx, starty, startx, endy, 3000);
		    //Thread.sleep(2000);

		}
		catch (Exception e) 
		{
			e.printStackTrace();
			testReport.log(LogStatus.FAIL, "Failed to Scroll");
			return;
		}
		
		testReport.log(LogStatus.PASS, "Scrolled successfully");
	}
	
	
	
	
	
	
	
}



