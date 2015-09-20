package day26;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day26.pom.WelcomeMercuryTours;

public class PomTestCase {
	@Test
	public void pomTest()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		//page object creation in POM
		WelcomeMercuryTours wm=PageFactory.initElements
				               (driver,WelcomeMercuryTours.class);
		
		wm.findAFlight("Admin","pass@123");
		driver.navigate().back();
		wm.menu.REGISTER();
	}
}

