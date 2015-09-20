package com.orangehrm.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	@FindBy(id="welcome")
	WebElement welcome;
	@FindBy(linkText="Logout")
	WebElement logout;
	public void logout() throws InterruptedException
	{
		welcome.click();
		Thread.sleep(2000);
		logout.click();
	}

}
