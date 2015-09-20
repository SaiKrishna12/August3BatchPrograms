package com.orangehrm.testsuite;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.orangehrm.utility.ExcelOperations;
import com.orangehrm.utility.Screenshots;

public class Constants {
	
	static RemoteWebDriver driver=null;
	ExcelOperations eo=new ExcelOperations();
	Screenshots sc=new Screenshots();
	String path1="E:\\August3Batch\\OrangeHRM\\src\\com\\orangehrm\\excel\\EmployeeList.xlsx";
	String path2="E:\\August3Batch\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
	String path3="E:\\August3Batch\\OrangeHRM\\src\\com\\orangehrm\\screenshots\\";
}
