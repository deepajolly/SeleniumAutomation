package test;

import org.testng.annotations.Test;

import pageobject.CompanyProfile;
import utilities.BaseClass;

public class CompanyProfileTest extends BaseClass{
	CompanyProfile d;
  @Test
  public void example() throws InterruptedException {
	  d=new CompanyProfile(driver);
	  d.profile();
  }
}
