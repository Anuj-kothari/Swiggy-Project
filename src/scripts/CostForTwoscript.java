package scripts;

import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import genericlibrary.Excel;
import pom.HomePage;
import pom.Loginpage;
import pom.SearchPage;
import pom.locationpage;

public class CostForTwoscript extends BaseTest
{
	@Test
	public void costfortwo() throws InterruptedException
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
		h.searchtext();

		SearchPage s = new SearchPage(driver);
		s.noodles();
		s.filter(driver);
		s.costfortwo();
		h.profile(driver);
		h.logoutbtn(driver);

	}

}
