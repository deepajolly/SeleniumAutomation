package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetails {
WebDriver driver;

@CacheLookup
@FindBy(id= "input-payment-firstname")
WebElement firstname;

@CacheLookup
@FindBy(id= "input-payment-lastname")
WebElement lastname;

@CacheLookup
@FindBy(id= "input-payment-email")
WebElement email;

@CacheLookup
@FindBy(id= "input-payment-telephone")
WebElement telephone;

@CacheLookup
@FindBy(id= "input-payment-fax")
WebElement fax;

@CacheLookup
@FindBy(id= "input-payment-password")
WebElement password;

@CacheLookup
@FindBy(id= "input-payment-confirm")
WebElement passwordconfirm;

@CacheLookup
@FindBy(id= "input-payment-company")
WebElement company;

@CacheLookup
@FindBy(id= "input-payment-address-1")
WebElement address1;

@CacheLookup
@FindBy(id= "input-payment-address-2")
WebElement address2;

@CacheLookup
@FindBy(id= "input-payment-city")
WebElement city;

@CacheLookup
@FindBy(id= "input-payment-postcode")
WebElement postcode;

@CacheLookup
@FindBy(id= "input-payment-country")
WebElement country;

@CacheLookup
@FindBy(id= "input-payment-zone")
WebElement state;

@CacheLookup
@FindBy(name= "agree")
WebElement agree;

@CacheLookup
@FindBy(id= "button-register")
WebElement button;


public void personal() throws InterruptedException
{
	firstname.sendKeys("Helsinki");
	Thread.sleep(1000);
	
	lastname.sendKeys("oslo");
	Thread.sleep(1000);
	
	email.sendKeys("helsinki@gmail.com");
	Thread.sleep(1000);
	
	telephone.sendKeys("988887888");
	Thread.sleep(1000);
	
	fax.sendKeys("24242424");
	Thread.sleep(1000);
	
	password.sendKeys("helsinki89");
	Thread.sleep(1000);
	
	passwordconfirm.sendKeys("helsinki89");
	Thread.sleep(1000);
	
	company.sendKeys("us company");
	Thread.sleep(1000);
	
	address1.sendKeys("infopark");
	Thread.sleep(1000);
	
	address2.sendKeys("ekm");
	Thread.sleep(1000);
	
	city.sendKeys("ernakulam");
	Thread.sleep(1000);
	
	postcode.sendKeys("698852");
	Thread.sleep(1000);
	
	Select s2=new Select(country);
	s2.selectByVisibleText("India");
	Thread.sleep(1000);
	
	Select s3=new Select(state);
	s3.selectByVisibleText("Kerala");
	Thread.sleep(1000);
	
	agree.click();
	Thread.sleep(1000);
	
	button.click();
	Thread.sleep(3000);
	

}
public PersonalDetails(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
