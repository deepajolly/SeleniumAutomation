package pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrder {
WebDriver driver;



//@CacheLookup
//@FindBy(xpath= "//input[@value='Continue']")
//WebElement next;

@CacheLookup
@FindBy(id= "button-shipping-address")
WebElement next1;

@CacheLookup
@FindBy(id= "button-shipping-method")
WebElement shipping;

@CacheLookup
@FindBy(name= "agree")
WebElement checkbox;

@CacheLookup
@FindBy(id= "button-payment-method")
WebElement cash;

@CacheLookup
@FindBy(id= "button-confirm")
WebElement confirm;

public void confirm() throws InterruptedException
{
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scroll(0,-1000)","");
	
	//next.click();
	//Thread.sleep(1000);
	
	next1.click();
	Thread.sleep(3000);
	
	shipping.click();
	Thread.sleep(3000);
	
	checkbox.click();
	Thread.sleep(3000);
	
	cash.click();
	Thread.sleep(3000);
	
	confirm.click();
	Thread.sleep(3000);
}
public ConfirmOrder(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
