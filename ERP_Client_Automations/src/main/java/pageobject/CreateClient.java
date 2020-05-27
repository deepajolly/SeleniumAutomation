package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateClient {
	WebDriver driver;

	@CacheLookup
	@FindBy(xpath="//a[@title=\"Clients\"]")
	WebElement ob;

	@CacheLookup
	@FindBy(xpath="/html/body/div/aside/section/ul/li[3]/a")
	WebElement createclient;

	@CacheLookup
	@FindBy(name="Client[client_name]")
	WebElement clientname;

	@CacheLookup
	@FindBy(name="Client[client_address]")
	WebElement clientaddress;

	@CacheLookup
	@FindBy(name="Client[postcode]")
	WebElement postcode;

	@CacheLookup
	@FindBy(name="Client[state]")
	WebElement state;

	@CacheLookup
	@FindBy(name="Client[phone]")
	WebElement phone;

	@CacheLookup
	@FindBy(name="Client[email]")
	WebElement email;

	@CacheLookup
	@FindBy(xpath="//input[@id=\"client-status\"]")
	WebElement status;

	@CacheLookup
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement save;

	public void create() throws InterruptedException
	{
		//WebElement ob=driver.findElement(By.xpath("//a[@title=\"Clients\"]"));
	      ob.click();
		  Thread.sleep(1000);
		  
	    //WebElement createclient=driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a"));
	      createclient.click();
		  Thread.sleep(1000);
		  
		//WebElement clientname=driver.findElement(By.name("Client[client_name]"));
	      clientname.sendKeys("liza");
		  Thread.sleep(1000);
		  
		//WebElement clientaddress=driver.findElement(By.name("Client[client_address]"));
	      clientaddress.sendKeys("paliyath house, TC NO 30/0464, TVM");
		  Thread.sleep(1000); 
		  
		//WebElement postcode=driver.findElement(By.name("Client[postcode]"));
	      postcode.sendKeys("695583");
		  Thread.sleep(1000);  
		  
		//WebElement state=driver.findElement(By.name("Client[state]"));
	      state.sendKeys("kerala");
		  Thread.sleep(1000);
		  
		//WebElement phone=driver.findElement(By.name("Client[phone]"));
	      phone.sendKeys("258963");
		  Thread.sleep(1000);
		  
		//WebElement email=driver.findElement(By.name("Client[email]"));
	      email.sendKeys("liza95@gmail.com");
		  Thread.sleep(1000);
		  
		//WebElement status=driver.findElement(By.xpath("//input[@id="client-status"]"));
	      status.click();
		  Thread.sleep(1000);
		  
		//WebElement save=driver.findElement(By.xpath("//button[@type="submit"]"));
	      save.submit();
		  Thread.sleep(1000);
	}
	public CreateClient(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
