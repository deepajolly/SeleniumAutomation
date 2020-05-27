package test;

import org.testng.annotations.Test;

import pageobject.PersonalDetails;
import utilities.BaseClass;

public class PersonalDetailsTest extends BaseClass{
	PersonalDetails s;
  @Test
  public void details() throws InterruptedException {
	  s=new PersonalDetails(driver);
	  s.personal();
  }
}
