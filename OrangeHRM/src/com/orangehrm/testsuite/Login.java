package com.orangehrm.testsuite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login  extends Constants{
	@Parameters("browser")
	@Test
	public void loginTest(String b) throws IOException
	{
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
			cap.setPlatform(Platform.WINDOWS);
		}
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://localhost:8090/orangehrm");
		OrangehrmLogin ohrmlogin=PageFactory.initElements(driver,OrangehrmLogin.class);
		String runmode=eo.getCellData(path2,0,1,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Skipping login testcase");
		}
		else
		{
			ohrmlogin.loginPanel("Admin","Admin");
		}
	}
	

}
