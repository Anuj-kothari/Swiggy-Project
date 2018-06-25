package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.Basepage;

public class ClickOnadd {

	
	@FindBy(xpath="(//div[@class='pLC0v _3L1X9'])[3]")
	private WebElement addbtn;
	
	@FindBy(xpath="//div[@class='_1ds9T']")
	private WebElement plusbutton;
	
	@FindBy(xpath="//div[@class='_1gPB7']")
	private WebElement checkoutbtn;
	
	@FindBy(xpath="//span[.='General Queries']")
	private WebElement generalqueriesbtn;
	
	public ClickOnadd(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	
	public void addclick(WebDriver driver) throws InterruptedException
	{   Basepage.ElementPresent(addbtn, driver);
	Thread.sleep(4000);
		addbtn.click();
	}
	
	public void plusbtn() throws InterruptedException
	{
		Thread.sleep(5000);
		plusbutton.click();
	}
	
	public void checkout()
	{
		checkoutbtn.click();
	}
	
	public void generalquery() throws InterruptedException
	{  Thread.sleep(5000);
		generalqueriesbtn.click();
	}

}
