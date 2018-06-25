package genericlibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage  {
	public  static  void  ElementPresent(WebElement element, WebDriver driver)
	{
		try
		{
			WebDriverWait w = new WebDriverWait(driver, 40);
			w.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("pass:Element is displayed",true);
		}
		catch(Exception e)
		{
			Reporter.log("Fail:Element is not displayed",true);
			Assert.fail();
		}

	}

	public static  void verifyPageDisplay(WebDriver driver,String title)
	{
		try
		{
			WebDriverWait w = new WebDriverWait(driver, 30);
			w.until(ExpectedConditions.titleContains(title));
			Reporter.log("Fail:Element is not displayed",true);
			Assert.fail();

		}
		catch(Exception e)
		{
			Reporter.log("Fail:Element is not displayed",true);
			Assert.fail();
		}

	
	}
	public   static  void scrollar(WebDriver driver)
	{  try
	{  
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,-500)");
	}
	catch(Exception e)
	{

	}
	}



}
