package test;

import org.testng.annotations.Test;

import pageobject.BranchesPage;
import utilities.BaseClass;

public class BranchesTest extends BaseClass{
	BranchesPage b;
  @Test
  public void page() throws InterruptedException {
	  b=new BranchesPage(driver);
	  b.branch();
  }
}
