package pom;

import org.testng.annotations.Test;

import genericlibrary.BaseTest;
import genericlibrary.Basepage;
import genericlibrary.Excel;

public class FilterCondition  extends BaseTest
{
	@Test()
	public void filter() throws InterruptedException
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
		
		Basepage.scrollar(driver);

		HomePage h = new HomePage(driver);
		h.seeall(driver);
		h.filter(driver);
		h.chckbox(driver);
		h.showrestbtn(driver);

	}

}
