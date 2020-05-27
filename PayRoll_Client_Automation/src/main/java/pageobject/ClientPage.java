package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
WebDriver driver;

@CacheLookup
@FindBy(name="ClientSearch[id]")
WebElement clientid;

@CacheLookup
@FindBy(xpath="//button[@type=\"submit\"]")
WebElement search;

@CacheLookup
@FindBy(xpath="//a[@href=\"/payrollapp/client/view?id=3\"]")
WebElement eye;

@CacheLookup
@FindBy(xpath="//a[@href=\"/payrollapp/client/update?id=3\"]")
WebElement pencil;

@CacheLookup
@FindBy(name="Client[fax]")
WebElement fax;

@CacheLookup
@FindBy(xpath ="//button[@type=\"submit\"]")
WebElement save;

/*@CacheLookup
@FindBy(xpath ="//*[@id=\"w1\"]/ul/li[11]/a")
WebElement next;*/

public void clientExam() throws InterruptedException
{
	WebElement client=driver.findElement(By.xpath("//a[text()=\"Clients\"]"));
	client.click();
	
	//WebElement clientid=driver.findElement(By.name("ClientSearch[id]"));
	clientid.sendKeys("3");
	Thread.sleep(1000);
	
	//WebElement search=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	search.submit();
	
	//WebElement eye=driver.findElement(By.xpath("//a[@href="/payrollapp/client/view?id=1"]"));
	eye.click();
	Thread.sleep(1000);
	
	//WebElement pencil=driver.findElement(By.xpath("//a[@href="/payrollapp/client/update?id=1"]"));
	pencil.click();
	Thread.sleep(1000);
	
	//WebElement fax=driver.findElement(By.name("Client[fax]"));
	fax.clear();
	fax.sendKeys("1000");
	Thread.sleep(1000);
	
	//WebElement save=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	save.submit();
	
	driver.navigate().to("https://www.qabible.in/payrollapp/client/update?id=3");
	Thread.sleep(3000);
	
	//WebElement next=driver.findElement(By.xpath("//*[@id="w1"]/ul/li[11]/a"));
	//next.click();
}
public ClientPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}