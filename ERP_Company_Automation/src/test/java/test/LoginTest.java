package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pageobject.BranchesPage;
import pageobject.CompanyProfile;
import pageobject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass{
	LoginPage l;
	CompanyProfile d;
	BranchesPage b;
  @Test(dataProvider="dp")
  public void test(String n,String p) throws InterruptedException, AWTException {
		l=new LoginPage(driver);
		l.login(n,p);
		
		d=new CompanyProfile(driver);
		d.profile();
		
		 b=new BranchesPage(driver);
		 b.branch();
}
}
