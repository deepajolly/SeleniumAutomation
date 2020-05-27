package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {
	public WebDriver driver;
	  @BeforeSuite
	  public void upurl() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\chromedriver latest\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("http://opesmount.in/grocerystore1/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	  }
	  @AfterSuite
	  public void exit()
	  {
		 // driver.quit();
	  }

}
