package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;

@CacheLookup
@FindBy(xpath="//*[@id=\"Featured\"]/div/div[1]/div/div[2]/a")
WebElement shop;

@CacheLookup
@FindBy(xpath = "//*[text()='Add to Cart']")
WebElement addtocart;

@CacheLookup
@FindBy(id="cart")
WebElement items;

@CacheLookup
@FindBy(xpath="//*[text()=' View Cart']")
WebElement viewcart;

@CacheLookup
@FindBy(linkText = "Checkout")
WebElement checkout;

@CacheLookup
@FindBy(id="button-account")
WebElement continu;


public void home() throws InterruptedException
{
	
	shop.click();
	Thread.sleep(3000);
	
	addtocart.click();
	Thread.sleep(3000);

	 items.click();
	 Thread.sleep(3000);
	 
	 viewcart.click();
	 Thread.sleep(3000);
	 
	 checkout.click();
	 Thread.sleep(3000);
	 
	 continu.click();
	 Thread.sleep(3000);
}

/*public String validateLoginpagetitle()
{
	String a=driver.getTitle();
	return a;
}*/
public HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

}
