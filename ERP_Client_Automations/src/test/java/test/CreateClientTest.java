package test;

import org.testng.annotations.Test;

import pageobject.CreateClient;
import utilities.BaseClass;

public class CreateClientTest extends BaseClass{
	CreateClient t;
  @Test
  public void test() throws InterruptedException {
	  t=new CreateClient(driver);
	  t.create();
  }
}
