package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class locationpage {

	@FindBy(xpath="//span[text()='Locate Me']")
	private WebElement location;

	public locationpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);


	}

	public void locationTrack(WebDriver driver) throws InterruptedException
	{   //Basepage.ElementPresent(location, driver);
		Thread.sleep(4000);
		location.click();
		//Basepage.ElementPresent(location, driver);
	}

}
