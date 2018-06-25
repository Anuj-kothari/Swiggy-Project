package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.BaseTest;
import genericlibrary.Basepage;

public class Loginpage extends BaseTest {
	
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginbtn;

	@FindBy(id="mobile")
	private WebElement usernametb;

	@FindBy(id="password")
	private WebElement passwordtb;

	@FindBy(xpath="(//a[text()='Login'])[2]")
	private WebElement loginbtn1;
	
	@FindBy(xpath="//span[text()='Locate Me']")
	private WebElement location;
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	
	public void loginlinke()
	{
		loginbtn.click();
	}
	
	

	
	public void username(String number,WebDriver driver)
	{
	Basepage.ElementPresent(usernametb,  driver);
		usernametb.sendKeys(number);
	}
	
	public void password(String psw,WebDriver driver)
	{   Basepage.ElementPresent(passwordtb, driver);
		passwordtb.sendKeys(psw);
	}
	
	public void loginbtn1(WebDriver driver)
	{  Basepage.ElementPresent(loginbtn, driver);
		loginbtn1.click();
		
	}
	public void locationTrack() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	//	Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		location.click();
	}

	
	

}
