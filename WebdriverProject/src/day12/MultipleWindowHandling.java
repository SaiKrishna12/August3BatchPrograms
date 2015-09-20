package day12;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver();
		driver.get("http://www.bing.com/");
	}
	
	@Test
	public void multipleWindowTest()
	{
		driver.findElement(By.linkText("Help")).click();
		switchWindow("//*[@id='ohid_footer']/div/span[7]/a");
		switchWindow("//a[@class='CTAButton']");
			
	}
	
	public void switchWindow(String x)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			try
			{
				driver.findElement(By.xpath(x)).click();
				break;
			}
			catch(Exception e)
			{
				
			}
		}
	}
	

}
