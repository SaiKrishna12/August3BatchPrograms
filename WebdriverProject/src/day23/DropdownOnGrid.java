package day23;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DropdownOnGrid {
	@Parameters("browser")
	@Test
	public void dropdownTest(String b) throws MalformedURLException
	{
		System.out.println(b);
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		driver.get("http://goair.in");
		WebElement drop1=driver.findElement(By.id("departureCitysearchBoxUserControlCriteriaBox"));
		List<WebElement> dropdown=drop1.findElements(By.tagName("option"));
		for(int i=1;i<dropdown.size();i++)
		{
			String city=dropdown.get(i).getText();
			dropdown.get(i).click();
			WebElement drop2=driver.findElement(By.id("toCitysearchBoxUserControlCriteriaBox"));
			String destination=drop2.getText();
			if(destination.contains(city))
			{
				System.out.println(city+" is not working correctly");
			}
			else
			{
				System.out.println(city+" is  working correctly");
			}
		}
	
	}
	
	
}
