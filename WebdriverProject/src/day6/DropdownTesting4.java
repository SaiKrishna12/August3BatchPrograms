package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting4 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
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
