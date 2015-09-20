package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting6 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		List<WebElement> links=driver.findElements
		                                 (By.tagName("a"));
		int count=0;
		System.out.println("Total links count is "+links.size());
		for(int i=0;i<links.size();i++)
		{
		    //skip the hidden links
			if(!links.get(i).getText().isEmpty())
			{
				count++;
			}
		}
		System.out.println("Visible links count is "+count);
		System.out.println("Hidden  links count is "+(links.size()-count));

	}

}
