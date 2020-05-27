package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateClient {
WebDriver driver;

/*@CacheLookup
@FindBy(xpath="//a[text()=\\\"Clients\\\"]")
WebElement client;

@CacheLookup
@FindBy(xpath="//a[text()=\\\"Create Client\\\"]")
WebElement create;*/

@CacheLookup
@FindBy(name="Client[branch_id]")
WebElement branch;

@CacheLookup
@FindBy(name="Client[division_id]")
WebElement division;

@CacheLookup
@FindBy(name="Client[client_name]")
WebElement name;

@CacheLookup
@FindBy(name="Client[client_address]")
WebElement address;

@CacheLookup
@FindBy(name="Client[postcode]")
WebElement postcode;

@CacheLookup
@FindBy(name="Client[country]")
WebElement country;

@CacheLookup
@FindBy(name="Client[your_ref]")
WebElement ref;

@CacheLookup
@FindBy(name="Client[invoice_contact]")
WebElement invoice;

@CacheLookup
@FindBy(name="Client[phone]")
WebElement phone;

@CacheLookup
@FindBy(name="Client[fax]")
WebElement fax;

@CacheLookup
@FindBy(name="Client[email]")
WebElement email;

@CacheLookup
@FindBy(name="Client[company_reg]")
WebElement reg;

@CacheLookup
@FindBy(name="Client[invoice_order]")
WebElement order;

@CacheLookup
@FindBy(name="Client[invoice_delivery_method]")
WebElement delivery;

@CacheLookup
@FindBy(name="Client[master_document]")
WebElement master;

@CacheLookup
@FindBy(name="Client[settilement_days]")
WebElement days;

@CacheLookup
@FindBy(name="Client[vat_rate]")
WebElement rate;

@CacheLookup
@FindBy(xpath="//input[@id=\"client-require_po\"]")
WebElement direct;

@CacheLookup
@FindBy(xpath ="//button[@type=\"submit\"]")
WebElement save;

public void create() throws InterruptedException
{
	WebElement client=driver.findElement(By.xpath("//a[text()=\"Clients\"]"));
	client.click();
	
	WebElement create=driver.findElement(By.xpath("//a[text()=\"Create Client\"]"));
	create.click();
	
	//WebElement branch=driver.findElement(By.name("Client[branch_id]"));
	Select s=new Select(branch);
	 s.selectByIndex(1);
	 Thread.sleep(1000);
	 
	//WebElement division=driver.findElement(By.name("Client[division_id]"));
	Select s2=new Select(division);
	s2.selectByIndex(1);
	Thread.sleep(1000);
	
	//WebElement name=driver.findElement(By.name("Client[client_name]"));
	name.sendKeys("obsqura");
	Thread.sleep(1000);
	
	//WebElement address=driver.findElement(By.name("Client[client_address]"));
	address.sendKeys("asiatic building");
	Thread.sleep(1000);
	
	//WebElement postcode=driver.findElement(By.name("Client[postcode]"));
	postcode.sendKeys("58585");
	Thread.sleep(1000);
	
	//WebElement country=driver.findElement(By.name("Client[country]"));
	country.clear();
	country.sendKeys("india");
	Thread.sleep(1000);
	
	//WebElement ref=driver.findElement(By.name("Client[your_ref]"));
	ref.sendKeys("12");
	Thread.sleep(1000);
	
	//WebElement invoice=driver.findElement(By.name("Client[invoice_contact]"));
	invoice.sendKeys("78956");
	Thread.sleep(1000);
	
	//WebElement phone=driver.findElement(By.name("Client[phone]"));
	phone.sendKeys("2417304");
	Thread.sleep(1000);
	
	//WebElement fax=driver.findElement(By.name("Client[fax]"));
	fax.sendKeys("1000");
	Thread.sleep(1000);
	
	//WebElement email=driver.findElement(By.name("Client[email]"));
	email.sendKeys("deepajolly95@gmail.com");
	Thread.sleep(1000);
	
	//WebElement reg=driver.findElement(By.name("Client[company_reg]"));
	reg.sendKeys("nil");
	Thread.sleep(1000);
	
	//WebElement order=driver.findElement(By.name("Client[invoice_order]"));
	Select s3=new Select(order);
	s3.selectByIndex(2);
	Thread.sleep(1000);
	
	//WebElement delivery=driver.findElement(By.name("Client[invoice_delivery_method]"));
	Select s4=new Select(delivery);
	s4.selectByIndex(1);
	Thread.sleep(1000);
	
	//WebElement master=driver.findElement(By.name("Client[master_document]"));
	Select s5=new Select(master);
	s5.selectByIndex(2);
	Thread.sleep(1000);
	
	//WebElement days=driver.findElement(By.name("Client[settilement_days]"));
	days.sendKeys("15");
	Thread.sleep(1000);
	
	//WebElement rate=driver.findElement(By.name("Client[vat_rate]"));
	Select s6=new Select(rate);
	s6.selectByIndex(2);
	Thread.sleep(1000);
	
	//WebElement direct=driver.findElement(By.name("Client[require_po]"));
	direct.click();
	Thread.sleep(1000);
	
	//WebElement save=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	save.submit();
}
public CreateClient(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
