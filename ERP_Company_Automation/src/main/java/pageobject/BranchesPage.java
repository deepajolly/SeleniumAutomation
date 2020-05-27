package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BranchesPage {
WebDriver driver;

@CacheLookup
@FindBy(xpath="/html/body/div/aside/section/ul/li[3]/a")
WebElement user;

@CacheLookup
@FindBy(id="branch-company_id")
WebElement id;

@CacheLookup
@FindBy(id="branch-branch_name")
WebElement branchname;

@CacheLookup
@FindBy(id="branch-email")
WebElement branchemail;

@CacheLookup
@FindBy(id="branch-phone")
WebElement phone;

@CacheLookup
@FindBy(id="branch-mobile")
WebElement mobile;

@CacheLookup
@FindBy(id="branch-gst_no")
WebElement gstno;

@CacheLookup
@FindBy(id="branch-address1")
WebElement address1;

@CacheLookup
@FindBy(id="branch-address2")
WebElement address2;

@CacheLookup
@FindBy(id="branch-state")
WebElement state;

@CacheLookup
@FindBy(id="branch-pincode")
WebElement pincode;

@CacheLookup
@FindBy(xpath="//button[@type=\"submit\"]")
WebElement save;

public void branch() throws InterruptedException
{
//WebElement user=driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a"));
user.click();

//WebElement id=driver.findElement(By.id("branch-company_id"));
Select s=new Select(id);
s.selectByIndex(0);
Thread.sleep(1000);

branchname.sendKeys("Trivandrum");
Thread.sleep(1000);

branchemail.sendKeys("tvm@gmail.com");
Thread.sleep(1000);

phone.sendKeys("258963");
Thread.sleep(1000);

mobile.sendKeys("8963257412");
Thread.sleep(1000);

gstno.sendKeys("1210101231010");
Thread.sleep(1000);

JavascriptExecutor j=(JavascriptExecutor)driver;
j.executeScript("window.scroll(0,1000)","");

address1.sendKeys("kazhakutoom");
Thread.sleep(1000);

address2.sendKeys("TVM");
Thread.sleep(1000);

state.sendKeys("kerala");
Thread.sleep(1000);

pincode.sendKeys("695583");
Thread.sleep(1000);

save.submit();
Thread.sleep(1000);
}

public BranchesPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
