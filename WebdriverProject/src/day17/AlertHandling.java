package day17;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	
	@Test
	public void alertTest() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('Hello Friends');");
		
		Thread.sleep(3000);
		handleAlert();
	}
	public void handleAlert()
	{
		try
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
			
		}
		catch(Exception e)
		{
			
		}
	}

}
