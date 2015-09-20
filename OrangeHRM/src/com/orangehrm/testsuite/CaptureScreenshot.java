package com.orangehrm.testsuite;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class CaptureScreenshot  extends  Constants
{
	@Test
	public void screenshotTest() throws IOException
	{
		String runmode=eo.getCellData(path2,0,3,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Skippping screenshots test");
		}
		else
		{
			sc.takingScreenshots(driver,path3,"addemp");
		}
	}

}
