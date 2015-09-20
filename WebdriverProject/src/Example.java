import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://amazon.in");
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		for(int i=0;i<dropdown.size();i++)
		{
			if(dropdown.get(i).getText().equals("Car & Motorbike"))
			{
				dropdown.get(i).click();
			}
		}
	}

}
