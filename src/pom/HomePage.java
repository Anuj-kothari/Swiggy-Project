package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.Basepage;

public class HomePage {
	@FindBy(xpath="//span[@class='_1qbcC']")
	private WebElement pname;

	@FindBy(xpath="(//div[text()='Edit profile'])[1]")
	private WebElement editprofile;

	@FindBy(xpath="(//div[text()='CHANGE'])[3]")
	private WebElement change;

	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement enterpass;

	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement reenterpass;

	@FindBy(xpath="//a[text()='UPDATE']")
	private WebElement submit;

	@FindBy(xpath="//span[@class='SSFcO icon-close']")
	private WebElement close;

	@FindBy(xpath="//span[.='Logout']")
	private WebElement logout;

	@FindBy(xpath="//span[@class='icon-downArrow kVKTT']")
	private WebElement downArrow;

	@FindBy(xpath="//div[.='Get current location']")
	private WebElement getcurrent;

	@FindBy(xpath="//div[.='SKIP & ADD LATER']")
	private WebElement skiplink;

	@FindBy(xpath="//span[.='Search']")
	private WebElement searchoptn;

	@FindBy(xpath="(//div[@class='nA6kb'])[6]")
	private WebElement TheRestra;

	@FindBy(xpath="//div[.='SEE ALL']")
	private WebElement seeall;

	@FindBy(xpath="//span[.='Filters']")
	private WebElement filter;

	@FindBy(xpath="//span[@class='_1X1xw _3ucsV']")
	private WebElement vegonlycheckbox;

	@FindBy(xpath="//a[.='SHOW RESTAURANTS']")
	private WebElement showtbtn;

	@FindBy(xpath="(//div[@class='nA6kb'])[9]")
	private WebElement restmouse;

	@FindBy(xpath="(//a[@class='_1T-E4'])[3]")
	private WebElement helplink;

	@FindBy(xpath="(//div[@class='_3UPKW'])[4]")
	private WebElement vegonlylink;

	public HomePage(WebDriver driver) 

	{
		PageFactory.initElements(driver, this);
	}

	public void profile(WebDriver driver) throws InterruptedException
	{//Thread.sleep(4000);
		Basepage.ElementPresent(pname, driver);
		Actions act = new Actions(driver);
		act.moveToElement(pname).perform();
		pname.click();

	}

	public void edit(WebDriver driver) throws InterruptedException
	{ // Thread.sleep(4000);
		Basepage.ElementPresent(editprofile, driver);
		editprofile.click();
	}

	public void changepass(WebDriver driver) throws InterruptedException
	{
		//	Thread.sleep(4000);
		Basepage.ElementPresent(change, driver);
		change.click();
	}

	public void pass(String newpass)
	{ 
		enterpass.sendKeys(newpass);	
	}

	public void repass(String renewpass)
	{
		reenterpass.sendKeys(renewpass);
	}

	public void update()
	{
		submit.click();
	}

	public void close(WebDriver driver) throws InterruptedException
	{// Thread.sleep(4000);
		Basepage.ElementPresent(close, driver);
		//Actions act= new Actions(driver);
		//act.moveToElement(close).perform();
		close.click();
	}

	public void logoutbtn(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(4000);
		Basepage.ElementPresent(logout, driver);
		logout.click();
	}

	public void changeloc(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		downArrow.click();
	}

	public void getloc(WebDriver driver) throws InterruptedException
	{ Thread.sleep(5000);
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getcurrent.click();
	}

	public void skipbtn( WebDriver driver)
	{  Basepage.ElementPresent(skiplink, driver);
		skiplink.click();
	}

	public void searchtext() throws InterruptedException
	{Thread.sleep(5000);
	searchoptn.click();
	}

	public void Restaname(WebDriver driver) throws InterruptedException
	{// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,100)");
		Thread.sleep(4000);
		TheRestra.click();
	}

	public void seeall(WebDriver driver) throws InterruptedException
	{   


		//	JavascriptExecutor j = (JavascriptExecutor) driver;
		//	j.executeScript("window.scrollBy(500,0)");
		//	Thread.sleep(4000);
		Basepage.scrollar( driver);
		Basepage.ElementPresent(seeall, driver);
		seeall.click();
		//j.executeScript("window.scrollBy(0,200)");


	}

	public void filter(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		filter.click();
	}

	public void chckbox(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		Basepage.ElementPresent(vegonlycheckbox, driver);
		vegonlycheckbox.click();
	}

	public void showrestbtn(WebDriver driver)
	{
		showtbtn.click();

	}

	public void restmousehover(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(restmouse).perform();

	}
	public void helpbtn(WebDriver driver) throws InterruptedException
	{
		Basepage.ElementPresent(helplink, driver);
		Thread.sleep(4000);
		helplink.click();
	}

	public void vegonly()
	{
		vegonlylink.click();
	}








}
