package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pageobject.ClientPage;
import pageobject.CreateClient;
import pageobject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass{
	LoginPage l;
	CreateClient t;
	ClientPage g;
  @Test(dataProvider="dp")
  public void test(String n,String p) throws InterruptedException, AWTException {
		l=new LoginPage(driver);
		l.login(n,p);
		
		 t=new CreateClient(driver);
		  t.create();
		  
		  g=new ClientPage(driver);
		  g.test();
	  }
}
