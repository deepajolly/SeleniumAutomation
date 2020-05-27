package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pageobject.ClientPage;
import utilities.BaseClass;

public class ClientTest extends BaseClass{
	ClientPage g;
  @Test
  public void sample() throws InterruptedException, AWTException {
	  g=new ClientPage(driver);
	  g.test();
  }
}
