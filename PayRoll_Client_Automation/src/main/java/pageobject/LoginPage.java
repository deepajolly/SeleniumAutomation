package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
	@FindBy(how=How.NAME,using="login-button")
	//@FindBy(name="login")
	WebElement login;

	public void testcase(String n,String p) throws InterruptedException
	{
		// WebElement user=driver.findElement(By.name("LoginForm[username]"));
		 driver.navigate().refresh();//creates stale exception when @FindBy is not used to find elements
		 Thread.sleep(2000);
		  //user.sendKeys("carol"); 
		//  Thread.sleep(2000);
		//  WebElement password=driver.findElement(By.name("LoginForm[password]"));
		//  password.sendKeys("1q2w3e4r");
		//  Thread.sleep(2000);
		 // WebElement login=driver.findElement(By.name("login-button"));
		 user.sendKeys(n);
		 Thread.sleep(2000);
		 password.sendKeys(p);
		 Thread.sleep(2000);
		  login.submit();
		  Thread.sleep(2000);
	}
	
	public String validateLoginpagetitle()
	{
		String a=driver.getTitle();
		return a;
	}
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
