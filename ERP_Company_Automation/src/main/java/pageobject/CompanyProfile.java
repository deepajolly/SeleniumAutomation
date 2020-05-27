package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CompanyProfile {
WebDriver driver;

@CacheLookup
@FindBy(xpath="/html/body/div/header/nav/div/ul/li[6]/a")
WebElement ob;

@CacheLookup
@FindBy(xpath="//a[@href=\"/erp/company\"]")
WebElement profile;

@CacheLookup
@FindBy(id="company-company_name")
WebElement name;

@CacheLookup
@FindBy(id="company-company_email")
WebElement email;

@CacheLookup
@FindBy(id="company-company_address")
WebElement address;

@CacheLookup
@FindBy(id="company-started_at")
WebElement date;

@CacheLookup
@FindBy(xpath="//button[@type=\"submit\"]")
WebElement save;

public void profile() throws InterruptedException
{
	// WebElement ob=driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[6]/a"));
	 ob.click();
	//Select s=new Select(ob);
	//s.selectByValue("Company Profile");;
	Thread.sleep(1000);
	
	// WebElement profile=driver.findElement(By.xpath("//a[@href=\"/erp/company\"]"));
	 profile.click();
	Thread.sleep(1000);
	
	//WebElement name=driver.findElement(By.id("company-company_name"));
	name.clear();
	name.sendKeys("jk company");
	Thread.sleep(1000);
	
	//WebElement email=driver.findElement(By.id("company-company_email"));
	email.clear();
	email.sendKeys("jk company@gmail.com");
	Thread.sleep(1000);
	
	//WebElement address=driver.findElement(By.id("company-company_address"));
	address.clear();
	address.sendKeys("TVM");
	Thread.sleep(1000);

	//WebElement date=driver.findElement(By.id("company-started_at"));
	date.clear();
	date.sendKeys("12-05-2020");
	Thread.sleep(1000);

	//WebElement save=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	save.submit();
	Thread.sleep(1000);
}
public CompanyProfile(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
