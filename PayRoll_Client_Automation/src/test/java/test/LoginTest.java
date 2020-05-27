package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.ClientPage;

import pageobject.CreateClient;
import pageobject.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass{
	LoginPage l;
	ClientPage f;
	CreateClient c;
  @Test(dataProvider="dp")
  public void login(String n,String p) throws InterruptedException {
	  l=new LoginPage(driver);
	  l.testcase(n,p);
	  
	  String b=l.validateLoginpagetitle();
	  System.out.println(b);
	  Assert.assertEquals(b, "Payroll Application");
	  	  
	  f=new ClientPage(driver);
	  f.clientExam();
	 
	  c=new CreateClient(driver);
	  c.create();
  }
  
  /*@Test
  public void validateLoginpagetest()
  {
	  String b=l.validateLoginpagetitle();
	  System.out.println(b);
	  Assert.assertEquals(b, "Payroll Application");
  }*/
}
