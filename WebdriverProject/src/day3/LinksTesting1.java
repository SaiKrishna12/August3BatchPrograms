package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;

public class LinksTesting1 {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		String exptitle="Gmail - Free Storage and Email from Google";
		driver.findElement(By.linkText("Gmail")).click();
		String acttitle=driver.getTitle();
		Assert.assertEquals(acttitle,exptitle);

	}

}
