package genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest  implements Constant {
	public WebDriver driver;

	@BeforeMethod
	public void openapp()
	{   
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();

		driver.get(url);

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeapp()
	{
		  driver.close();

	}

	public static void main(String[] args) 
	{
		String excelsheet = Excel.excelsheet(path, "Sheet1", 0, 0);
		System.out.println(excelsheet);

	}
}



