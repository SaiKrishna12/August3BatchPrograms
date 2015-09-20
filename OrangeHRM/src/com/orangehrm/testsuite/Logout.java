package com.orangehrm.testsuite;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Logout extends Constants{
	
	/*Menu menu=null;
	public Logout(WebDriver driver)
	{
		menu=PageFactory.initElements(driver,Menu.class);
	}*/
	@Test
	public void logoutTest() throws InterruptedException, IOException
	{  
		String runmode=eo.getCellData(path2,0,4,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Skippping logout test");
		}
		else
		{
			Thread.sleep(10000);
			LogoutPage ohrmlogout=PageFactory.initElements(driver,LogoutPage.class);
			ohrmlogout.logout();
		}
		
	}

}
