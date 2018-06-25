package scripts;

import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import genericlibrary.Excel;
import pom.ClickOnadd;
import pom.HomePage;
import pom.Loginpage;
import pom.locationpage;

public class AddScenario  extends BaseTest{

	@Test
	public void add() throws InterruptedException
	{
		Loginpage l = new Loginpage(driver);
		l.loginlinke();
		String un = Excel.excelsheet(path, "Sheet1", 1, 0);
		l.username(un,driver);
		String pwd = Excel.excelsheet(path, "Sheet1", 2, 0);
		l.password(pwd,driver);
		l.loginbtn1(driver); 


		locationpage p = new locationpage(driver);

		p.locationTrack(driver);

		HomePage h = new HomePage(driver);
		h.Restaname(driver);

		ClickOnadd c = new ClickOnadd(driver);
		c.addclick(driver);
		c.checkout();
		h.profile(driver);
		h.logoutbtn(driver);

	}



}
