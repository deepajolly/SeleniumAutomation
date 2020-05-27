package test;

import org.testng.annotations.Test;

import pageobject.CreateClient;
import utilities.BaseClass;

public class CreateClientTest extends BaseClass{
	CreateClient c;
  @Test
  public void client() throws InterruptedException {
	  c=new CreateClient(driver);
	  c.create();
  }
}
