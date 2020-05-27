package pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	WebDriver driver;

	@CacheLookup
	@FindBy(xpath="/html/body/div/aside/section/ul/li[2]/a")
	WebElement client;

	@CacheLookup
	@FindBy(name="ClientSearch[client_name]")
	WebElement clientname;

	public void test() throws InterruptedException, AWTException
	{
		 // WebElement client=driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a"));
	      client.click();
		  Thread.sleep(1000);
		  
		  //WebElement clientname=driver.findElement(By.name("ClientSearch[client_name]"));
	      clientname.sendKeys("liza");
	      Robot r=new Robot();
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		  
	}
	public ClientPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
