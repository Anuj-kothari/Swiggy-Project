package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.Basepage;

public class SearchPage {
	@FindBy(xpath="//img[@alt='doughnut']")
	private WebElement doughnut;

	@FindBy(xpath="//a[.='Relevance']")
	private WebElement filteroptions;
	
	@FindBy(xpath="//li[.='Rating']")
	private WebElement ratingfilter;
	
	@FindBy(xpath="//img[@alt='noodles']")
	private WebElement noodleimg;
	
	@FindBy(xpath="//li[.='Cost For Two']")
	private WebElement costfortwo;


	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void image(WebDriver driver) throws InterruptedException
	{
		//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(10000);
		Basepage.ElementPresent(doughnut, driver);
		doughnut.click();
	}
	
	public void filter(WebDriver driver)
	{  Basepage.ElementPresent(filteroptions, driver);
		filteroptions.click();
	}
	
	public void rating()
	{
		ratingfilter.click();
	}
	
	public void noodles() throws InterruptedException
	{
		Thread.sleep(5000);
		noodleimg.click();
	}
	public void costfortwo() throws InterruptedException
	{
		Thread.sleep(3000);
		costfortwo.click();
	}

}
