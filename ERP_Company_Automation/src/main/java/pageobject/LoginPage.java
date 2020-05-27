package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@CacheLookup
	@FindBy(name="LoginForm[username]")
	WebElement user;

	@CacheLookup
	@FindBy(name="LoginForm[password]")
	WebElement password;

	@CacheLookup
	@FindBy(name="login-button")
	WebElement clic;

	public void login(String n,String p) throws InterruptedException
	{
		//WebElement user=driver.findElement(By.name("LoginForm[username]"));
		user.sendKeys(n);
		Thread.sleep(2000);
		
		//WebElement password=driver.findElement(By.name("LoginForm[password]"));
		password.sendKeys(p);
		Thread.sleep(2000);
		
		//WebElement clic=driver.findElement(By.name("login-button"));
		clic.submit();
		Thread.sleep(2000);
	}
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
