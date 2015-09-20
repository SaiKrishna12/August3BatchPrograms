package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CaptchaAutomation {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver();
		driver.get("http://www.harvard.edu/feedback");
	}
	
	@Test
	public void captchaTest() throws InterruptedException
	{
		for(long b=1;b<=999999999l;b++)
		{
		
			driver.findElement(By.id("edit-submitted-name")).sendKeys("tester1");
			driver.findElement(By.id("edit-submitted-email")).sendKeys("tester1@gmail.com");
			driver.findElement(By.id("edit-submitted-comment")).sendKeys("Stupid change the captcha");
			String x=driver.findElement(By.className("field-prefix")).getText();
			String[] a=x.split(" ");
			int i=Integer.parseInt(a[0]);
			int j=Integer.parseInt(a[2]);
			int k=i+j;
			String str=Integer.toString(k);
			driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
			Thread.sleep(6000);
			//driver.findElement(By.name("op")).click();
			driver.navigate().refresh();
		}
		
		
		
		
	}

}
