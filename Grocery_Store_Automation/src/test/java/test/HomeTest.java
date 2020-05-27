package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.ConfirmOrder;
import pageobject.HomePage;
import pageobject.PersonalDetails;
import utilities.BaseClass;

public class HomeTest extends BaseClass {
	HomePage h;
	PersonalDetails s;
	ConfirmOrder o;
  @Test
  public void test() throws InterruptedException {
	  h=new HomePage(driver);
	  h.home();
	  
	 /* String b=h.validateLoginpagetitle();
	  System.out.println(b);
	  Assert.assertEquals(b, "Grocerystore");*/
	  
	  s=new PersonalDetails(driver);
	  s.personal();
	  
	  o=new ConfirmOrder(driver);
	  o.confirm();
  }
}
