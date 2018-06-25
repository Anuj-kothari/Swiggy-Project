package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.Basepage;

public class RestaurentPage {
	@FindBy(xpath="//span[.='Favourite']")
	private WebElement favouritz;

	@FindBy(xpath="//span[.='Favourites']")
	private WebElement favouritesoption;

	@FindBy(xpath="//input[@placeholder='Search for dishes...']")
	private WebElement searchdish;


	public RestaurentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void favouritezbox(WebDriver driver) throws InterruptedException
	{Basepage.ElementPresent(favouritz, driver);
		favouritz.click();

	}
	public void favouritoption()
	{
		favouritesoption.click();
	}

	public void searchtb(String search)
	{

		searchdish.sendKeys(search);	
	}



}
