package test;

import org.testng.annotations.Test;

import pageobject.ConfirmOrder;
import utilities.BaseClass;

public class ConfirmOrderTest extends BaseClass{
	ConfirmOrder o;
  @Test
  public void order() throws InterruptedException {
	  o=new ConfirmOrder(driver);
	  o.confirm();
  }
}
