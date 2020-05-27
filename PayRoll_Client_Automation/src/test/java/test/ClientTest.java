package test;

import org.testng.annotations.Test;

import pageobject.ClientPage;
import utilities.BaseClass;

public class ClientTest extends BaseClass{
	ClientPage f;
  @Test
  public void page() throws InterruptedException {
	  f=new ClientPage(driver);
	  f.clientExam();
  }
}
